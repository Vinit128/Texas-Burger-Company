package com.example.texasburgercompany.Controller;

import com.example.texasburgercompany.Model.Location;
import com.example.texasburgercompany.Service.LocationService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/location")
@Api(value="Loaction related endpoints")
public class LocationController {

    private final LocationService lservice;

    public LocationController(LocationService lservice) {
        this.lservice = lservice;
    }


    @PostMapping("/addLocation")
    @ApiOperation(value="Creates the  location",
             notes="Creates a new record  in the database")
    @ApiResponses(value = {
            @ApiResponse(code = 404, message = " Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error"),
            @ApiResponse(code = 200,message = "Successful")
    })
    public Location addLocation(@RequestBody Location location) {
        return lservice.createLocation(location);
    }



    @GetMapping
    @ApiOperation(value="Find all location",
            notes="Returns a list of all location in the database")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Ok"),
            @ApiResponse(code=500,message="Internal Server Error")
    })
    public List<Location> getAll() {
        return lservice.listAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value="Find a location by id" ,
            notes="Returns a location by ID from the database")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Ok"),
            @ApiResponse(code=404,message="Not Found"),
            @ApiResponse(code=500,message="Internal Server Error")
    })
    public Location getDemoById(  @ApiParam(value="it is the id of the location", required=true) @PathVariable String id) {
        return  lservice.findById(id);
    }


    @PutMapping("/updateLocation")
    @ApiOperation(value="Updates the  location",
            notes="Stores the updated record  in the database")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Ok"),
            @ApiResponse(code=404,message="Not Found"),
            @ApiResponse(code=500,message="Internal Server Error")
    })
    public Location updateDemo(String id ,@RequestBody Location location ) {
        return lservice.update( id,location);
    }



    @DeleteMapping("/delete/{id}")
    @ApiOperation(value="Delete a location by id ",
            notes=" Deletes a  record from the database")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Ok"),
            @ApiResponse(code=404,message="Not Found"),
            @ApiResponse(code=500,message="Internal Server Error")
    })
    public void delete(@PathVariable String id)
    {
        lservice.delete(id);
    }

}


















