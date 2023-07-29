package com.springboot.template.mvcmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MongoUser {

    @Id
    private Integer id;
    private Integer userId;
    private String title;
    private Boolean completed;

}
    