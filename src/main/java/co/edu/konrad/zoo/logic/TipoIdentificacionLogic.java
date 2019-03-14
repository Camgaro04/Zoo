package co.edu.konrad.zoo.logic;


import co.edu.konrad.zoo.entities.TipoIdentificacionEntity;
import co.edu.konrad.zoo.persistence.TipoIdentificacionPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Grupo Zoo
 */
@Stateless
public class TipoIdentificacionLogic {
    
    @Inject
    private TipoIdentificacionPersistence persistence;
    
    public List<TipoIdentificacionEntity> findAll(){
        return persistence.findAll();
    }
    
    public TipoIdentificacionEntity findById(int id){
        return persistence.find(id);
    }
    
    
     public TipoIdentificacionEntity insert(TipoIdentificacionEntity p){
        persistence.insert(p);
        return p;
    }
     
    public TipoIdentificacionEntity update(TipoIdentificacionEntity p){
        persistence.update(p);
        return p;
    }
    
    
    public void delete(int id){
        persistence.delete(id);
    }
    
    
}
