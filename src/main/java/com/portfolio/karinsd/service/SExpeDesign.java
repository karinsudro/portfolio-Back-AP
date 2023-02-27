package com.portfolio.karinsd.service;

import com.portfolio.karinsd.entity.ExpeDesign;
import com.portfolio.karinsd.repository.RExpeDesign;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class SExpeDesign {
    
    //para hacer inyección de dependencias sin crear tantas instancias con new
    @Autowired  
    public RExpeDesign expeDesRepo;

    //Endpoints
    public List<ExpeDesign> getExpeDesigns() {
        return expeDesRepo.findAll();
    }
    //ya no hay create, sino q modifica lo q hay y si no hay, lo crea
    public void saveExpeDesign(ExpeDesign expeDe) {
        expeDesRepo.save(expeDe);  
    }
    
    //si no encuentra el trabajo retorna null
    public ExpeDesign findExpeDesign(Integer id) {
        return expeDesRepo.findById(id).orElse(null);   
    }

    public void deleteExpeDesign(Integer id) {
        expeDesRepo.deleteById(id);
    }
    
    //mismo que create
    public void updateExpeDesign(ExpeDesign expeDe) {
        expeDesRepo.save(expeDe);
    }
    
}
