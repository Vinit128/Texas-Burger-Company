package com.example.texasburgercompany.Controller;


import com.example.texasburgercompany.Model.Reservation;
import com.example.texasburgercompany.Service.ReservationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("/location/{id}/reservation")
@Api(value="Reservation related endpoints")
public class ReservationController {

     private final ReservationService rservice;

     public ReservationController(ReservationService rservice) {
          this.rservice = rservice;
     }

     @PostMapping("/addReservation")
     @ApiOperation(value="Creates the  Reservation",
             notes="Creates a new record  in the database")
     @ApiResponses(value={
             @ApiResponse(code=200,message="Ok"),
             @ApiResponse(code=500,message="Internal Server Error")
     })
     public Reservation addReservation(@RequestBody Reservation reservation)
     {

          return rservice.createReservation(reservation);
     }

     @GetMapping
     @ApiOperation(value="Find all Reservation",
             notes="Returns a list of all location in the database")
     @ApiResponses(value={
             @ApiResponse(code=200,message="Ok"),
             @ApiResponse(code=404,message="Not Found")
     })
     public List<Reservation> getAll() {
          return rservice.listAll();
     }

     @GetMapping("/{id}")
     @ApiOperation(value="Find a reservation by id" ,
             notes="Returns a reservation by ID from the database")
     @ApiResponses(value = {
             @ApiResponse(code = 404, message = "Not Found"),
             @ApiResponse(code = 500, message = "Internal Server Error"),
             @ApiResponse(code = 200,message = "Successful")
     })
     public Reservation getDemoById(@PathVariable String id) {
          return  rservice.listById(id);
     }

     @PutMapping("/update")
     @ApiOperation(value="Updates the Reservation",
             notes="Stores the updated record  in the database"
     )
     @ApiResponses(value = {
             @ApiResponse(code = 404, message = "Not Found"),
             @ApiResponse(code = 500, message = "Internal Server Error"),
             @ApiResponse(code = 200,message = "Successful")
     })
     public Reservation updateReservation(String id , @RequestBody Reservation reservation ) {
          return rservice.update(id,reservation);
     }

     @DeleteMapping("/delete/{id}")
     @ApiOperation(value="Delete a reservation by id ",
             notes=" Deletes a  record from the database")
     @ApiResponses(value={
             @ApiResponse(code=200,message="Ok"),
             @ApiResponse(code=404,message="Not Found"),
             @ApiResponse(code=500,message="Internal Server Error")
     })

     public void delete(@PathVariable String id)
     {
          rservice.delete(id);
     }

}
