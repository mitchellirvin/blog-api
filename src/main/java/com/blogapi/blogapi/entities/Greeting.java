package com.blogapi.blogapi.entities;

import lombok.Data;

@Data
public class Greeting {

  private String id;

  private String message;

  public Greeting() {
  }

  public Greeting(String id, String message) {
    this.id = id;
    this.message = message;
  }

}
