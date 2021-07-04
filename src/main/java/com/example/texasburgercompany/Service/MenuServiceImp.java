package com.example.texasburgercompany.Service;

import com.example.texasburgercompany.Model.Menu;
import com.example.texasburgercompany.Repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImp implements MenuService {

    @Autowired
  private MenuRepository menuRepo;


    @Override
    public List<Menu> listAll() {
        return menuRepo.findAll();
    }

    @Override
    public Menu createLocation(Menu menu) {
        return menuRepo.save(menu);
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
