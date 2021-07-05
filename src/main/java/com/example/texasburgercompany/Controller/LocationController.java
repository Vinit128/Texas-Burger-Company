package com.example.texasburgercompany.Controller;


import com.example.texasburgercompany.Model.Location;
import com.example.texasburgercompany.Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//import java.util.Optional;


@RestController
@RequestMapping("location")
public class LocationController {

    @Autowired
    private LocationService lservice;

    //CREATE
    @PostMapping("/addLocation")
    public Location addLocation(@RequestBody Location location) {
        return lservice.createLocation(location);
    }


    //Retrive from the database
    @GetMapping("/location")
    public List<Location> getAll() {
        return lservice.listAll();
    }

    @GetMapping("/location/{id}")
    public Location getDemoById(@PathVariable String id) {
        return  lservice.listById(id);
    }

    @PutMapping("/updateLocation/location")
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

