package com.example.texasburgercompany.Controller;


import com.example.texasburgercompany.Model.Menu;
import com.example.texasburgercompany.Service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

     @Autowired
    private MenuService mservice;

    //CREATE
    @PostMapping("/addmenu")
    public Menu addMenu(@RequestBody Menu menu)
    {
        return mservice.createMenu(menu);
    }


    //Retrive from the database
    @GetMapping("/location/menu")
    public List<Menu> getAll() {
        return mservice.listAll();
    }

    @GetMapping("/location/{id}")
    public Menu getDemoById(@PathVariable String id) {
        return  mservice.listById(id);
    }

    @PutMapping("/location/menu/update")
    public Menu updateDemo(String id , @RequestBody Menu menu ) {
        return mservice.update(id,menu);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id)
    {
        mservice.delete(id);
    }
}
