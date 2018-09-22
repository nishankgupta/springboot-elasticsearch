package com.nishank.elasticsearch.resource;

import com.nishank.elasticsearch.domain.Book;
import com.nishank.elasticsearch.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping(path = "/name/{bookName}")
    @ResponseBody
    public Book getBookByName(@PathVariable("bookName") String name) {
        return bookService.getBookByName(name);
    }

    /**
     * {
     * 	"name":"Elastic search",
     * 	"price": 400.00,
     * 	"authors":[{"name": "A"},{"name":"B"}]
     * }
     */

    @PostMapping(path = "/add")
    @ResponseBody
    public void createBook(@RequestBody Book book) {
        bookService.save(book);
    }

    @DeleteMapping(path = "/delete/{bookName}")
    @ResponseBody
    public void deleteBook(@PathVariable("bookName") String name) {
        bookService.delete(name);
    }
}
