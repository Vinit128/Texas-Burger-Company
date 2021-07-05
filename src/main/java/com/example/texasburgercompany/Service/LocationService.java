package com.example.texasburgercompany.Service;

import com.example.texasburgercompany.Model.Location;
import java.util.List;

public interface LocationService {


    public List<Location> listAll();

    public Location createLocation(Location location);

    //public Location get(String id);
    public Location update(String id, Location loc);

    public void delete(String id);

    Location listById(String id);
}
