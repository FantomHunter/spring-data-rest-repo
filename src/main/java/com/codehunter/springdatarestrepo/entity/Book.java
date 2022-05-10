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
import org.hibernate.annotations.GenericGenerator;

@Entity(name = "book")
public class Book extends Auditable {

  @Id
  @Column(name = "id", nullable = false)
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
  private UUID id;

  @Column(name = "title", nullable = false)
  private String title;

  @ManyToMany
  @JoinTable(name = "author_books",
      joinColumns = @JoinColumn(name = "books_id"),
      inverseJoinColumns = @JoinColumn(name = "author_id"))
  private Set<Author> authors = new java.util.LinkedHashSet<>();

  public Set<Author> getAuthors() {
    return authors;
  }

  public void setAuthors(Set<Author> authors) {
    this.authors = authors;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public UUID getId() {
    return id;
  }
}
