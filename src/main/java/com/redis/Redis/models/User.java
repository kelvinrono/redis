package com.redis.Redis.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class User implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
}
