package com.portfolio.karinsd.service;

import com.portfolio.karinsd.entity.About;
import com.portfolio.karinsd.repository.RAbout;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SAbout {
    
    //para hacer inyección de dependencias sin crear tantas instancias con new
    @Autowired  
    public RAbout aboutRepo;

    //Endpoints
    public List<About> getAbouts() {
        return aboutRepo.findAll();
    }
    
    //si no encuentra los datos retorna null
    public About findAbout(Integer id) {
        return aboutRepo.findById(id).orElse(null);   
    }
    
    //ya no hay create, sino q modifica lo q hay y si no hay, lo crea
    public void saveAbout(About aboutme) {
        aboutRepo.save(aboutme);  
    }
   
    public void deleteAbout(Integer id) {
        aboutRepo.deleteById(id);
    }

    //mismo que create
    public void updateAbout(About aboutme) {
        aboutRepo.save(aboutme);
    }
  
}
