package com.codehunter.springdatarestrepo.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
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

  @OneToMany(mappedBy = "book", orphanRemoval = true)
  @OrderBy("name")
  private List<Author> authors = new ArrayList<>();

  public List<Author> getAuthors() {
    return authors;
  }

  public void setAuthors(List<Author> authors) {
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
