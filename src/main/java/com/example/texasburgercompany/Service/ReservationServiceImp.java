package com.example.texasburgercompany.Service;


import com.example.texasburgercompany.Exception.ReservationNotFoundException;
import com.example.texasburgercompany.Model.Reservation;
import com.example.texasburgercompany.Repository.ReservationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReservationServiceImp implements ReservationService{

   private final ReservationRepository reservationRepo;

   public ReservationServiceImp(ReservationRepository reservationRepo) {
    this.reservationRepo = reservationRepo;
  }

  @Override
    public List<Reservation> listAll() {
        return reservationRepo.findAll();
    }

    @Override
    public Reservation createReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    /*@Override
    public Reservation get(String id) {
        return reservationRepo.findById(id).get();
    }
*/
    @Override
    public Reservation update(String id, Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    @Override
    public void delete(String id) {
      reservationRepo.deleteById(id);
    }

  @Override
  public Reservation listById(String id) {
    Reservation reservation = reservationRepo.findById(id).get();

      if(reservation==null) {
          throw new ReservationNotFoundException("reservation with id=" +id+ "not found ");
      }else{
          return reservation;
      }

  }
}
