package com.nishank.elasticsearch.service;

import com.nishank.elasticsearch.domain.Book;
import com.nishank.elasticsearch.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    public Book getBookByName(String name){
        return bookRepository.findByName(name);
    }

    public void save(Book book){
        bookRepository.save(book);
    }

    public void delete(String name){
        elasticsearchTemplate.delete(Book.class,name);
    }

}
