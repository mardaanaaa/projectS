package org.example.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "ssr_group")
public class Group {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;


    private String name;


    public Long getId(){
        return id;
    }

}
