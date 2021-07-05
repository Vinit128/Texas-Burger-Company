package com.example.texasburgercompany.Service;

import com.example.texasburgercompany.Model.Location;
import com.example.texasburgercompany.Repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LocationServiceImp implements LocationService {

    @Autowired
    private LocationRepository lrepo;

    @Override
    public List<Location> listAll() {
        return lrepo.findAll();
    }

    @Override
    public Location createLocation(Location location) {
        return lrepo.save(location);
    }

    /*@Override
    public Location get(String id) {
        return lrepo.findById(id).get();

    }
*/
    @Override
    public Location update(String id, Location loc) {
        return lrepo.save(loc);
    }

    @Override
    public void delete(String id) {
        lrepo.deleteById(id);
    }

    @Override
    public Location listById(String id) {
        return lrepo.getById(id);
    }

}
