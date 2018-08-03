package com.blogapi.blogapi;

import graphql.Scalars;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlogApiApplication {

	public static void main(String[] args) {
	  SpringApplication.run(BlogApiApplication.class, args);

	}

  @Bean
  public GraphQLSchema schema() {
    return GraphQLSchema.newSchema()
        .query(GraphQLObjectType.newObject()
            .name("query")
            .field(field -> field
                .name("test")
                .type(Scalars.GraphQLString)
                .dataFetcher(environment -> "response")
            )
            .build())
        .build();
  }

}
