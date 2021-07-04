package com.example.texasburgercompany.Repository;

import com.example.texasburgercompany.Model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;



public interface MenuRepository extends JpaRepository<Menu,String  > {
}
