package com.example.texasburgercompany.Repository;

import com.example.texasburgercompany.Model.Location;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LocationRepository extends JpaRepository<Location,String > {
}
