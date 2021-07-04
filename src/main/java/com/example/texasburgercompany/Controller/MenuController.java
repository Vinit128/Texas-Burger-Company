package com.example.texasburgercompany.Controller;


import com.example.texasburgercompany.Service.LocationService;
import com.example.texasburgercompany.Service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class MenuController {

     @Autowired
    private MenuService mservice;
}
