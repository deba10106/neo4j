package com.example.reactiveneo4j.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.geo.Point;
import org.springframework.data.neo4j.core.schema.*;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//@AllArgsConstructor
//@NoArgsConstructor
@Node
@Getter
@Setter
public class Group {

    @Id
    private Long id;
//    private String groupName;
   private final String groupDescription;
//    private List<String> groupRules;
//    private List<String> blockListedByUserId;
//    private Point groupLocation;
//    private List<String> groupAdmin;
//    private List<String> groupMembers;
//    private List<String> groupType;
//    private List<String> category;
//    private List<String> hashTags;
//    private List<String> keywords;
//    private String link;
//    @Relationship(type = "GROUP_CREATED",direction = Relationship.Direction.INCOMING)
//    private User user;
//    @Relationship(type = "POSTED_ON_GROUP",direction = Relationship.Direction.INCOMING)
//    private Post post;


    //@Property("tagline")
    private final String groupName;
//    @Relationship(type = "ACTED_IN", direction = Relationship.Direction.INCOMING)
//    private Set<Post> actors = new HashSet<>();
    @Relationship(type = "POSTED_ON", direction=Relationship.Direction.INCOMING)
    private Set<Post> post;
    public Group(String groupDescription, String groupName) {
        this.id = null;
        this.groupName = groupName;
        this.groupDescription=groupDescription;
    }
    public Group withId(Long id) {
        if (this.id.equals(id)) {
            return this;
        } else {
            Group newObject = new Group(this.groupDescription, this.groupName);
            newObject.id = id;
            return newObject;
        }
    }


}
