package com.example.reactiveneo4j.repo;

import com.example.reactiveneo4j.model.Share;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShareRepository extends ReactiveNeo4jRepository<Share,String> {
}
