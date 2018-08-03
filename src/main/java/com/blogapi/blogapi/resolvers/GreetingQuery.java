package com.blogapi.blogapi.resolvers;

import com.blogapi.blogapi.entities.Greeting;
import com.blogapi.blogapi.repositories.GreetingRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingQuery implements GraphQLQueryResolver {

  @Autowired
  private GreetingRepository greetingRepository;

  public Greeting getGreeting(String id) {
    return greetingRepository.find(id);
  }
}
