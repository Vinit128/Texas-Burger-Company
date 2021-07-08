package com.example.texasburgercompany.Service;

import com.example.texasburgercompany.Repository.LocationRepository;
import com.example.texasburgercompany.Repository.MenuRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;

import static org.junit.Assert.*;




public class MenuServiceImpTest {


    @Autowired
    private MenuService menuService;
    @MockBean
    private MenuRepository menuRepository;

    @Bean
    public MenuService menuService() {
        return new MenuServiceImp(menuRepository);
    }

        @Test
    public void listAll() {
    }

    @Test
    public void createMenu() {
    }

    @Test
    public void listById() {
    }

    @Test
    public void get() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }
}