package com.student_management.Api;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor

public class Student {

    @Id
    private int id ;
    private String name ;
    private Long mobile ;
    private String contry ;

}
