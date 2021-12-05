package com.example.reactiveneo4j.repo;

import com.example.reactiveneo4j.model.Reaction;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;

public interface ReactionRepository extends ReactiveNeo4jRepository<Reaction,String> {
}
