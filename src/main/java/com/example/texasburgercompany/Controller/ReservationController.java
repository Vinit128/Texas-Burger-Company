package com.example.texasburgercompany.Controller;


import com.example.texasburgercompany.Model.Reservation;
import com.example.texasburgercompany.Service.ReservationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
@Api(value="Reservation related endpoints")
public class ReservationController {

     private final ReservationService rservice;

     public ReservationController(ReservationService rservice) {
          this.rservice = rservice;
     }

     @PostMapping("/addReservation")
     @ApiOperation(value="Creates the  Reservation",
             notes="Creates a new record  in the database"
     )
     public Reservation addReservation(@RequestBody Reservation reservation)
     {

          return rservice.createReservation(reservation);
     }

     @GetMapping
     @ApiOperation(value="Find all Reservation",
             notes="Returns a list of all location in the database"
     )
     public List<Reservation> getAll() {
          return rservice.listAll();
     }

     @GetMapping("/{id}")
     @ApiOperation(value="Find a reservation by id" ,
             notes="Returns a reservation by ID from the database"
     )
     public Reservation getDemoById(@PathVariable String id) {
          return  rservice.listById(id);
     }

     @PutMapping("/update")
     @ApiOperation(value="Updates the Reservation",
             notes="Stores the updated record  in the database"
     )
     public Reservation updateReservation(String id , @RequestBody Reservation reservation ) {
          return rservice.update(id,reservation);
     }

     @DeleteMapping("/delete/{id}")
     @ApiOperation(value="Delete a reservation by id ",
             notes=" Deletes a  record from the database"
     )
     public void delete(@PathVariable String id)
     {
          rservice.delete(id);
     }

}
