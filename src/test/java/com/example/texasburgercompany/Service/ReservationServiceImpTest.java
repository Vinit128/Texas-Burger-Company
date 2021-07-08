package com.example.texasburgercompany.Service;

import com.example.texasburgercompany.Repository.MenuRepository;
import com.example.texasburgercompany.Repository.ReservationRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;

import static org.junit.Assert.*;

public class ReservationServiceImpTest {

    @Autowired
    private ReservationService reservationService;
    @MockBean
    private ReservationRepository reservationRepository;

    @Bean
    public ReservationService reservationService() {
        return new ReservationServiceImp(reservationRepository);
    }

    @Test
    public void listAll() {
    }

    @Test
    public void createReservation() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void listById() {
    }
}