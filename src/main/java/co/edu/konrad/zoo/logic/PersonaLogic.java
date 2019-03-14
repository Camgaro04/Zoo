package co.edu.konrad.zoo.logic;

import co.edu.konrad.zoo.entities.PersonaEntity;
import co.edu.konrad.zoo.persistence.PersonaPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Grupo Zoo
 */
@Stateless
public class PersonaLogic {
    @Inject
    private PersonaPersistence persistence;
    
    public List<PersonaEntity> findAll(){
        return persistence.findAll();
    }
    
    public PersonaEntity findById(int id){
        return persistence.find(id);
    }
    
    
     public PersonaEntity insert(PersonaEntity p){
        persistence.insert(p);
        return p;
    }
     
    public PersonaEntity update(PersonaEntity p){
        persistence.update(p);
        return p;
    }
    
    
    public void delete(int id){
        persistence.delete(id);
    }
   
}
