package com.example.texasburgercompany.Service;

import com.example.texasburgercompany.Repository.LocationRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;


@SpringBootTest
public class LocationServiceImpTest {


    @Autowired
    private LocationService locationService;
    @MockBean
    private LocationRepository locationRepository;


    @Bean
    public LocationService locationService() {
        return new LocationServiceImp(locationRepository);
    }


    @Test
    public void listAll() {

    }

    @Test
    public void createLocation() {

    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void findById() {
    }
}