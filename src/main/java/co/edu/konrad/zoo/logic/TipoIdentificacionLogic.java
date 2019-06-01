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
    /**
     * DEclara la persistencia 
     */
    @Inject
    private TipoIdentificacionPersistence persistence;
    /**
     * 
     * @return 
     */
    public List<TipoIdentificacionEntity> findAll(){
        return persistence.findAll();
    }
    /**
     * Busca por id
     * @param id
     * @return 
     */
    public TipoIdentificacionEntity findById(int id){
        return persistence.find(id);
    }
    
    /**
     * Inserta
     * @param p
     * @return 
     */
     public TipoIdentificacionEntity insert(TipoIdentificacionEntity p){
        persistence.insert(p);
        return p;
    }
     /**
      * Actualizar
      * @param id
      * @param entity
      * @return 
      */
    public TipoIdentificacionEntity actualizarTipoIdentificacion(long id,TipoIdentificacionEntity entity){
        TipoIdentificacionEntity TipoIdentificacionActualizado = persistence.update(entity);
        return TipoIdentificacionActualizado;
    }
    
    /**
     * Delete
     * @param id 
     */
    public void delete(int id){
        persistence.delete(id);
    }
    
    
}
