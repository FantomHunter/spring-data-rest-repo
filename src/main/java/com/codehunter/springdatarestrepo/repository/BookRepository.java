package com.codehunter.springdatarestrepo.repository;

import com.codehunter.springdatarestrepo.entity.Book;
import java.util.UUID;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "books", path = "books")
public interface BookRepository extends PagingAndSortingRepository<Book, UUID> {

}
