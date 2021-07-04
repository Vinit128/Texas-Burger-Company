package com.example.texasburgercompany.Service;


import com.example.texasburgercompany.Model.Reservation;

import java.util.List;


public interface ReservationService {


    public List<Reservation> listAll();

    public Reservation createLocation(Reservation reservation);

    public Reservation get(String id);
    public Reservation update(String id, Reservation reservation);


    public void delete(String id);
}
