package com.example.texasburgercompany.Service;

import com.example.texasburgercompany.Model.Location;
import com.example.texasburgercompany.Model.Menu;

import java.util.List;

public interface MenuService {


    public List<Menu> listAll();

    public Menu createMenu(Menu menu);

    Menu listById(String id);

    public Menu get(String id);
    public Menu update(String id, Menu menu);

    public void delete(String id);
}

