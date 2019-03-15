package co.edu.konrad.zoo.logic;

/**
 *
 * @author Grupo Zoo
 */
import co.edu.konrad.zoo.entities.HorarioEntity;
import co.edu.konrad.zoo.persistence.HorarioPersistence;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class HorarioLogic {
     @Inject
     private HorarioPersistence persistence;
    
      public List<HorarioEntity> findAll(){
        return persistence.findAll();
    }
    
    public HorarioEntity findById(long id){
        return persistence.find(id);
    }
    
    
     public HorarioEntity insert(HorarioEntity p){
        persistence.create(p);
        return p;
    }
     
    public HorarioEntity update(HorarioEntity p){
        persistence.merge(p);
        return p;
    }
    
    
    public void delete(int id){
        persistence.delete(id);
    }
    
}
