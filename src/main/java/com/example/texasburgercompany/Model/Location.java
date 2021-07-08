package com.example.texasburgercompany.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location implements Serializable {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")

    private String id;
    private String name;
    private String day;
    private Timestamp time;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Reservation> reservation;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Menu menu;

}

