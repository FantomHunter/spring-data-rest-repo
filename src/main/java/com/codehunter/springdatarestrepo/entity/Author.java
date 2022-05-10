package com.codehunter.springdatarestrepo.entity;

import java.util.Set;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Author extends Auditable {

  @Id
  @Column(name = "id", nullable = false)
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
  private UUID id;

  @Column(name = "name", nullable = false)
  private String name;

  @ManyToMany
  @JoinTable(name = "author_books",
      joinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "books_id", referencedColumnName = "id"))
  private Set<Book> books = new java.util.LinkedHashSet<>();


  public Set<Book> getBooks() {
    return books;
  }

  public void setBooks(Set<Book> books) {
    this.books = books;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }
}
