package com.example.texasburgercompany.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

    @Id
    @GeneratedValue
    private String menuID;
    private String menuItem;
    private String menuDescription;
    private float price;


}
