package com.example.texasburgercompany.Service;

import com.example.texasburgercompany.Model.Menu;

import java.util.List;

public interface MenuService {


     List<Menu> listAll();

     Menu createMenu(Menu menu);

     Menu listById(String id);

     Menu get(String id);
     Menu update(String id, Menu menu);

     void delete(String id);
}

