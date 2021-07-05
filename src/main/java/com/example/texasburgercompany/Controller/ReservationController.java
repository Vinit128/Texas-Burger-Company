package com.example.texasburgercompany.Controller;


import com.example.texasburgercompany.Model.Reservation;
import com.example.texasburgercompany.Service.ReservationService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

     private final ReservationService rservice;

     public ReservationController(ReservationService rservice) {
          this.rservice = rservice;
     }


     //CREATE
     @PostMapping("/addReservation")
     public Reservation addReservation(@RequestBody Reservation reservation)
     {

          return rservice.createReservation(reservation);
     }


     //Retrive from the database
     @GetMapping
     public List<Reservation> getAll() {
          return rservice.listAll();
     }

     @GetMapping("/{id}")
     public Reservation getDemoById(@PathVariable String id) {
          return  rservice.listById(id);
     }

     @PutMapping("/update")
     public Reservation updateReservation(String id , @RequestBody Reservation reservation ) {
          return rservice.update(id,reservation);
     }

     @DeleteMapping("/delete/{id}")
     public void delete(@PathVariable String id)
     {
          rservice.delete(id);
     }

}
