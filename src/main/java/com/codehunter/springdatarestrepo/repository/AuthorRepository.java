package com.codehunter.springdatarestrepo.repository;

import com.codehunter.springdatarestrepo.entity.Author;
import java.util.UUID;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "authors", path = "authors")
public interface AuthorRepository extends PagingAndSortingRepository<Author, UUID> {

}
