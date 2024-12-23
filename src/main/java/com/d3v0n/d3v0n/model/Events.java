package com.d3v0n.d3v0n.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "events")
public class Events implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String description;
    private String image;
    private String date;
    private String created_at;
    private String updated_at;
}
