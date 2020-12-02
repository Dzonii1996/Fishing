package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "licences")
public class Licence {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "type")
  private String type;

  @Column(name = "expiration_data")
  private String expirationData;

  public Licence() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getExpirationData() {
    return expirationData;
  }

  public void setExpirationData(String expirationData) {
    this.expirationData = expirationData;
  }

}
