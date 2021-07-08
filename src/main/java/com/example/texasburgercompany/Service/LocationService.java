package com.example.texasburgercompany.Service;

import com.example.texasburgercompany.Model.Location;
import java.util.List;

public interface LocationService {


     List<Location> listAll(int page, int size);

     Location createLocation(Location location);

    //public Location get(String id);
      Location update(String id, Location loc);

    void delete(String id);

    Location findById(String id);
}
