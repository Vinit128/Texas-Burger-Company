package com.example.texasburgercompany.Controller;


import com.example.texasburgercompany.Model.Menu;
import com.example.texasburgercompany.Service.MenuService;
//import org.springframework.beans.factory.annotation.Autowired;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
@Api(value="Menu related endpoints")
public class MenuController {

     private final MenuService mservice;

    public MenuController(MenuService mservice) {
        this.mservice = mservice;
    }


    @PostMapping("/addmenu")
    @ApiOperation(value="Creates the  menu",
            notes="Creates a new record  in the database"
    )
    public Menu addMenu(@RequestBody Menu menu)
    {
        return mservice.createMenu(menu);
    }


    //Retrive from the database
    @GetMapping()
    @ApiOperation(value="Find all Menu",
            notes="Returns a list of all location in the database"
    )
    public List<Menu> getAll() { return mservice.listAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value="Find a menu by id" ,
            notes="Returns a menu by ID from the database"
    )
    public Menu getDemoById(@PathVariable String id) {
        return  mservice.listById(id);
    }

    @PutMapping("/update")
    @ApiOperation(value="Updates the  Menu",
            notes="Stores the updated record  in the database"
    )
    public Menu updateDemo(String id , @RequestBody Menu menu ) {
        return mservice.update(id,menu);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value="Delete a reservation by id ",
            notes=" Deletes a  record from the database"
    )
    public void delete(@PathVariable String id)
    {
        mservice.delete(id);
    }
}
