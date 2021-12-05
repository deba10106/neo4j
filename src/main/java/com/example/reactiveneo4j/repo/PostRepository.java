package com.example.reactiveneo4j.repo;

import com.example.reactiveneo4j.model.Post;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface PostRepository extends ReactiveNeo4jRepository<Post,String> {


     @Query("MATCH(u:User)<-[n:POSTED]-(p:Post) RETURN u,n,p")
    Mono<Post> getByImg_src(String img_src);

}
