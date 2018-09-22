package com.nishank.elasticsearch.repo;

import com.nishank.elasticsearch.domain.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends ElasticsearchCrudRepository<Book,String> {

    Book findByName(String name);

}
