package com.example.texasburgercompany.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
public class Reservation {

    @Id
     private String reservationId;

     private ZonedDateTime StartTime;
     private ZonedDateTime EndTime;
     private ZonedDateTime workinghours;


    public Reservation(String reservationId, ZonedDateTime startTime, ZonedDateTime endTime) {
        this.reservationId = UUID.randomUUID().toString();
        StartTime = startTime;
        EndTime = endTime;
    }
}
