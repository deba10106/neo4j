package com.example.reactiveneo4j.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Reaction {

    @Id
    private String reactionId;
    private String reactionValue;
    private String reactionUserId;
}
