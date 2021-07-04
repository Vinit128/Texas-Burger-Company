package com.example.texasburgercompany.Controller;


import com.example.texasburgercompany.Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.stream.Location;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("location")
public class LocationController {
/*
    @Autowired
    private LocationService lservice;

    @RequestMapping(method= RequestMethod.GET)
    public List<Location> findAll()
    {
        return lservice.findAll();
    }

    @RequestMapping(method= RequestMethod.GET ,value="id")
    public Location findbyid(@PathVariable("id") String id)
    {
        return lservice.findOne(id);

    }

    @RequestMapping(method= RequestMethod.POST)
    public Location create(@RequestBody Location location)
    {
        return location;
    }
    @RequestMapping(method= RequestMethod.PUT , value="id")
    public Location update(@PathVariable("id") String id , @RequestBody Location location)
    {
        return location;

    }
    @RequestMapping(method= RequestMethod.DELETE , value="id")
    public void deletebyid(@PathVariable("id") String id){
     return lservice.delete();
    }


*/

/*
    @GetMapping("")             //localhost:8080/api/location
    public List<Location> getAllLocations(){
        return lservice.listall();
    }

    @GetMapping("{id}")     //localhost:8080/api/location/id
    public Optional<Location> getlocationById(@PathVariable("id") String id){
        return lservice.Locationbyid(id);
    }

*/

}
















    // Controller -->  Service---> Repository

