package com.example.reactiveneo4j.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Comment {

    @Id
    private String commentId;
    private String commentValue;
    private String commentUserId;
    @Relationship(type = "REACTED_ON_COMMENT",direction = Relationship.Direction.INCOMING)
    private Reaction reaction;
}
