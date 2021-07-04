package com.example.texasburgercompany.Repository;

import com.example.texasburgercompany.Model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, String> {

}
