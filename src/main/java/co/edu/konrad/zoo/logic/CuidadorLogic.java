package co.edu.konrad.zoo.logic;

import co.edu.konrad.zoo.entities.CuidadorEntity;
import co.edu.konrad.zoo.persistence.CuidadorPersistence;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Grupo Zoo
 */
@Stateless
public class CuidadorLogic {
    
    private CuidadorPersistence persistence; 
    
    
    public List<CuidadorEntity> findAll(){
        return persistence.findAll();
    }
    
    public CuidadorEntity findById(int id){
        return persistence.find(id);
    }
    
    
     public CuidadorEntity insert(CuidadorEntity p){
        persistence.insert(p);
        return p;
    }
     
    public CuidadorEntity update(CuidadorEntity p){
        persistence.update(p);
        return p;
    }
    
    
    public void delete(int id){
        persistence.delete(id);
    }
    
}
