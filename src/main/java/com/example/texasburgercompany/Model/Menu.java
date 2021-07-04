package com.example.texasburgercompany.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
public class Menu {

    @Id
    private String menuID;
    private String menuItem;
    private String menuDescription;
    private float price;

    public Menu(String menuID, String menuItem, String menuDescription, float price) {
        this.menuID = UUID.randomUUID().toString();
        this.menuItem = menuItem;
        this.menuDescription = menuDescription;
        this.price = price;
    }
}
