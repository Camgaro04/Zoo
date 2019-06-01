package co.edu.konrad.zoo.logic;

import co.edu.konrad.zoo.entities.TipoAlimentoEntity;
import co.edu.konrad.zoo.persistence.TipoAlimentoPersistence;

/**
 *
 * @author Grupo Zoo
 */
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class TipoAlimentoLogic {
     @Inject
    private TipoAlimentoPersistence persistence;
    /**
     * Retorna lista de tipos de alimentos
     * @return 
     */
    public List<TipoAlimentoEntity> findAll(){
        return persistence.findAll();
    }
     /**
      * Encuentra tipo de alimento por id
      * @param id
      * @return 
      */
    public TipoAlimentoEntity findById(long id){
        return persistence.find(id);
    }
    
    /**
     * Insertar
     * @param p
     * @return 
     */
     public TipoAlimentoEntity insert(TipoAlimentoEntity p){
        persistence.create(p);
        return p;
    }
     /**
      * Actualiza
      * @param id
      * @param entity
      * @return 
      */
    public TipoAlimentoEntity actualizarTipoAlimento(long id,TipoAlimentoEntity entity){
        TipoAlimentoEntity TipoAlimentoActualizado = persistence.merge(entity);
        return TipoAlimentoActualizado;
    }
    
    /**
     * Elimina
     * @param id 
     */
    public void delete(int id){
        persistence.delete(id);
    }
}
