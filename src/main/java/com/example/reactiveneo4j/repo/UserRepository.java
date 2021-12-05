package com.example.reactiveneo4j.repo;

import com.example.reactiveneo4j.model.User;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends ReactiveNeo4jRepository<User,String> {

   // @Query("MATCH(u:User)<-[n:POSTED]-(p:Post) RETURN u,n,p")
    Mono<User> getByName(String name);
}
