package com.shashannkd.movieshub.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "reviews")
public class Review {
    
    @Id
    private ObjectId id;
    private String body;
    private String user;
    private String imdbId;
    private Date updatedDate;

    public Review(String body, String user, String imdbId, Date updatedDate) {
        this.body = body;
        this.user = user;
        this.imdbId = imdbId;
        this.updatedDate = updatedDate;
    }
}
