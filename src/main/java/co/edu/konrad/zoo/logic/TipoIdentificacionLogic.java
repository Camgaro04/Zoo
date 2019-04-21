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
     
    public TipoIdentificacionEntity actualizarTipoIdentificacion(long id,TipoIdentificacionEntity entity){
        TipoIdentificacionEntity TipoIdentificacionActualizado = persistence.update(entity);
        return TipoIdentificacionActualizado;
    }
    
    
    public void delete(int id){
        persistence.delete(id);
    }
    
    
}
