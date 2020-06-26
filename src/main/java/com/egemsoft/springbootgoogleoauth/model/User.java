package com.egemsoft.springbootgoogleoauth.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String imageUrl;
    @Column
    private String userType;

}
