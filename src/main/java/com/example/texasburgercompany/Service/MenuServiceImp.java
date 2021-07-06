package com.example.texasburgercompany.Service;

import com.example.texasburgercompany.Exception.LocationNotFoundException;
import com.example.texasburgercompany.Exception.MenuNotFoundException;
import com.example.texasburgercompany.Model.Location;
import com.example.texasburgercompany.Model.Menu;
import com.example.texasburgercompany.Repository.MenuRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImp implements MenuService {

    private final MenuRepository menuRepo;

    public MenuServiceImp(MenuRepository menuRepo) {
        this.menuRepo = menuRepo;
    }


    @Override
    public List<Menu> listAll() {
        return menuRepo.findAll();
    }

    @Override
    public Menu createMenu(Menu menu) {
        return menuRepo.save(menu);
    }

    @Override
    public Menu listById(String id) {
        Menu menu = menuRepo.findById(id).get();

        if(menu==null) {
            throw new MenuNotFoundException("Menu with id=" +id+ "not found ");
        }else{
            return menu;
        }
    }


    @Override
    public Menu get(String id) {
        return menuRepo.findById(id).get();
    }

    @Override
    public Menu update(String id, Menu menu) {
        return menuRepo.save(menu);
    }

    @Override
    public void delete(String id) {
       menuRepo.deleteById(id);
    }
}
