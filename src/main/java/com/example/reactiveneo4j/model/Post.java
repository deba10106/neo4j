package com.example.reactiveneo4j.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.geo.Point;
import org.springframework.data.neo4j.core.schema.*;

import java.util.Date;
import java.util.List;

@Node
//@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
public class Post {

    @Id
    private final String postId;
    private final String itemId;
    public Post(String postId, String itemId) {
        this.postId = postId;
        this.itemId= itemId;
    }
//    private String groupId;
//    private String tags;
//    private String img_src;
//    private Date timeStamp;
//    private String postType;
//    private Date createTime;
//    private Date updateTime;
//    private String deletePost;
//    private String postCategory;
//    private Double discountedPrice;
//    private Double normalPrice;
//    private Date discountedPriceStartDate;
//    private Date discountedPriceEndDate;
//    private String postContentDescription;
//    private List<String> images;
//    private String postContentName;
//    private String deliveryRange;
//    @Relationship(type = "POSTED",direction = Relationship.Direction.INCOMING)
//    private User user;
//    @Relationship(type = "REACTED_ON_POST",direction = Relationship.Direction.INCOMING)
//    private Reaction reaction;
//    @Relationship(type = "COMMENTED_ON_POST",direction = Relationship.Direction.INCOMING)
//    private Comment comment;

}

//    CREATE (Funny:Post{postId:'1',userId:'1',itemId:'1',groupId:"1",tags:'1',img_src:"Google"})
//        CREATE (Comment:Post{postId:'2',userId:'2',itemId:'3',groupId:"3",tags:'2',img_src:'Chrome'})
//        CREATE (Peter:User{name:'Peter',age:"30"})
//        CREATE (Ram:User{name:'Ram',age:"32"})
//        CREATE (Sam:User{name:'Sam',age:"34"})
//        CREATE
//        (Funny)-[:POSTED]->(Peter),
//        (Funny)-[:POSTED]->(Ram),
//        (Funny)-[:POSTED]->(Sam),
//        (Comment)-[:POSTED]->(Peter),
//        (Comment)-[:POSTED]->(Ram),
//        (Comment)-[:POSTED]->(Sam);
