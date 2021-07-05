package com.example.texasburgercompany.Controller;


import com.example.texasburgercompany.Model.Location;
import com.example.texasburgercompany.Service.LocationService;

import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/location")
public class LocationController {

    private final LocationService lservice;

    public LocationController(LocationService lservice) {
        this.lservice = lservice;
    }

    //CREATE
    @PostMapping("/addLocation")
    public Location addLocation(@RequestBody Location location) {
        return lservice.createLocation(location);
    }


    //Retrive from the database
    @GetMapping
    public List<Location> getAll() {
        return lservice.listAll();
    }

    @GetMapping("/{id}")
    public Location getDemoById(@PathVariable String id) {
        return  lservice.findById(id);
    }


    @PutMapping("/updateLocation")
    public Location updateDemo(String id ,@RequestBody Location location ) {
        return lservice.update( id,location);
    }



    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id)
    {
        lservice.delete(id);
    }

}
















    // Controller -->  Service---> Repository

