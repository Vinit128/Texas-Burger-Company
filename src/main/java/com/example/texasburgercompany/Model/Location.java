package com.example.texasburgercompany.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;


@Entity
@Data
@NoArgsConstructor
public class Location {

    @Id
    //Column(olumnDefinition = "VARCHAR(36)")
    private String id;
    private String name;
    private String state;
    private String city;
    private Integer zip;

    public Location(String id, String name, String state, String city, Integer zip) {
        this.id= UUID.randomUUID().toString();
        this.name = name;
        this.state = state;
        this.city = city;
        this.zip = zip;
    }
}
