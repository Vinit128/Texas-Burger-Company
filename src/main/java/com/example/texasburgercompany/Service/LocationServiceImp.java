package com.example.texasburgercompany.Service;

import com.example.texasburgercompany.Exception.LocationNotFoundException;
import com.example.texasburgercompany.Model.Location;
import com.example.texasburgercompany.Repository.LocationRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LocationServiceImp implements LocationService {

    private final LocationRepository lrepo;

    public LocationServiceImp(LocationRepository lrepo) {
        this.lrepo = lrepo;
    }

    @Override
    public List<Location> listAll(int page, int size) {
        try{
            return lrepo.findAll(PageRequest.of(page, size)).getContent();
        }
        catch(Exception e){
            throw new LocationNotFoundException("locations cannot be found");
        }
    }

    @Override
    public Location createLocation(Location location) {
        try{
            return lrepo.save(location);
        }
        catch(Exception e){
            throw new LocationNotFoundException("location cannot be created"+ e.getMessage());
        }
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
        try{
            Location location = lrepo.findById(id).get();
            if(location==null) {
                throw new LocationNotFoundException("location with id=" +id+ "not found ");
            }else{
                return location;
            }
        }
        catch(Exception e){
            throw new LocationNotFoundException(e.getMessage());
        }
    }
}
