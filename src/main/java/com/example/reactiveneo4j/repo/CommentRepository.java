package com.example.reactiveneo4j.repo;

import com.example.reactiveneo4j.model.Comment;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends ReactiveNeo4jRepository<Comment,String> {
}
