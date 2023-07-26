package com.springboot.template.mysqltemplate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MySqlUser {

    @Id
    private Integer id;
    private Integer userId;
    private String title;
    private Boolean completed;

}
