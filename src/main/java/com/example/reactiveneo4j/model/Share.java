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
public class Share {

    @Id
    private String Id;
    private String privacy;
    @Relationship(type = "SHARED_ON",direction = Relationship.Direction.INCOMING)
    private String postId;
    private String groupId;
}
