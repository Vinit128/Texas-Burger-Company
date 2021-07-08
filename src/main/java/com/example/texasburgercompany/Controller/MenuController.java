package com.example.texasburgercompany.Controller;


import com.example.texasburgercompany.Model.Menu;
import com.example.texasburgercompany.Service.MenuService;
//import org.springframework.beans.factory.annotation.Autowired;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/location/{id}/menu")
@Api(value="Menu related endpoints")
public class MenuController {

     private final MenuService mservice;

     public MenuController(MenuService mservice) {
        this.mservice = mservice;
    }


    @PostMapping("/addmenu")
    @ApiOperation(value="Creates the  new Menue",
            notes="Creates a new record  in the database")
    @ApiResponses(value = {
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error"),
            @ApiResponse(code = 200,message = "Successful")
    })
    public Menu addMenu(@RequestBody Menu menu)
    {
        return mservice.createMenu(menu);
    }


    //Retrive from the database
    @GetMapping()
    @ApiOperation(value="Find all Menu",
            notes="Returns a list of all location in the database")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Ok"),
            @ApiResponse(code=404,message="Not Found")
    })
    public List<Menu> getAll() { return mservice.listAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value="Find a menu by id" ,
            notes="Returns a menu by ID from the database")
    @ApiResponses(value = {
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error"),
            @ApiResponse(code = 200,message = "Successful")
    })
    public Menu getMenuById(@PathVariable String id) {
        return  mservice.listById(id);
    }

    @PutMapping("/update/{id}")
    @ApiOperation(value="Updates the  Menu",
            notes="Stores the updated record  in the database")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Ok"),
            @ApiResponse(code=500,message="Internal Server Error")

    })

    public Menu updateMenu(@PathVariable("id") String id , @RequestBody Menu menu ) {
        return mservice.update(id,menu);
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
        mservice.delete(id);
    }
}
