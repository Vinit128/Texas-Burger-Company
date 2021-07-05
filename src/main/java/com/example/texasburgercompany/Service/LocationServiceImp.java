package com.example.texasburgercompany.Service;

import com.example.texasburgercompany.Model.Location;
import com.example.texasburgercompany.Repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LocationServiceImp implements LocationService {

    private final LocationRepository lrepo;

    public LocationServiceImp(LocationRepository lrepo) {
        this.lrepo = lrepo;
    }

    @Override
    public List<Location> listAll() {
        return lrepo.findAll();
    }

    @Override
    public Location createLocation(Location location) {
        return lrepo.save(location);
    }


    @Override
    public Location update(String id, Location loc) {
        return lrepo.save(loc);
    }



    @Override
    public void delete(String id) {
        lrepo.deleteById(id);
    }

    @Override
    public Location findById(String id) {
        Location location = lrepo.findById(id).get();
        return location;
    }

}
