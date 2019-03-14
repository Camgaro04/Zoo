package co.edu.konrad.zoo.logic;

/**
 *
 * @author Grupo Zoo
 */
import co.edu.konrad.zoo.entities.CalificacionEntity;
import co.edu.konrad.zoo.persistence.CalificacionPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class CalificacionLogic {
    
    @Inject
     private CalificacionPersistence persistence;
    
      public List<CalificacionEntity> findAll(){
        return persistence.findAll();
    }
    
    public CalificacionEntity findById(long id){
        return persistence.find(id);
    }
    
    
     public CalificacionEntity insert(CalificacionEntity p){
        persistence.create(p);
        return p;
    }
     
    public CalificacionEntity update(CalificacionEntity p){
        persistence.merge(p);
        return p;
    }
    
    
    public void delete(int id){
        persistence.delete(id);
    }
    
}
