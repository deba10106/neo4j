package com.example.reactiveneo4j.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.neo4j.cypherdsl.core.Order;
import org.springframework.data.geo.Point;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.Date;
import java.util.List;

@Node
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    private String userId;
    private String name;
    private String age;
    private Point userLocation;
    private String gender;
    private String profession;
    private String shopName;
    private Point shopLocation;
    private String shopType;
    private Date lastSeenTimeStamp;
    private String status;
    private List<String> connections;
    private List<String> blacklistedByUserId;
    private List<String> blacklistedByGroupId;
    private List<String> userType;
    private List<String> interestedIn;
    private List<Order> orderList;
    private List<String> followingByUserId;
    private List<String> followingByPostId;
    private List<String> followingByGroupId;
    private List<String> unFollowingByUserId;
    private List<String> unFollowingByPostId;
    private List<String> unFollowingByGroupId;
    private List<String> subscriptionByUserId;
    private List<String> subscriptionByGroupId;
    private List<String> search_history;

}
