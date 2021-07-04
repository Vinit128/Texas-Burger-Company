package com.example.texasburgercompany.Service;

import com.example.texasburgercompany.Model.Menu;

import java.util.List;

public interface MenuService {


    public List<Menu> listAll();

    public Menu createLocation(Menu menu);

    public Menu get(String id);
    public Menu update(String id, Menu menu);

    public void delete(String id);
}

