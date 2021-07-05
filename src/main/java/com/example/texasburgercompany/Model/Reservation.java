package com.example.texasburgercompany.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.ZonedDateTime;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue
     private String reservationId;

     private ZonedDateTime StartTime;
     private ZonedDateTime EndTime;
     private ZonedDateTime workinghours;


}
