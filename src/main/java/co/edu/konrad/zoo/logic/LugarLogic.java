package co.edu.konrad.zoo.logic;

import co.edu.konrad.zoo.entities.LugaresEntity;
import co.edu.konrad.zoo.persistence.LugarPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Andres Hernandez
 */

@Stateless
public class LugarLogic {
    
    @Inject
    private LugarPersistence persistence;
    
    
    /**
     * Get All
     *
     * @return Selecciona todos los lugares
     */
    public List<LugaresEntity> findAll(){
        return persistence.findAll();
    }
    
    
    /**
     * Get
     *
     * @param id
     * @return Selecciona un Lugar x ID
     */
    public LugaresEntity findById(long id){
        return persistence.find(id);
    }
    
    /**
     * Insert
     *
     * @param Lugar
     * @return Inserta Lugar
     */
    public LugaresEntity insert(LugaresEntity lugar){
        persistence.create(lugar);
        return lugar;
    }
    
    /**
     * Update
     *
     * @param p
     * @return actualizado
     */
    public LugaresEntity update(LugaresEntity p){
        persistence.merge(p);
        return p;
    }
    
    
     /**
     * Delete
     *
     * @param id
     * @return Eliminacion
     */
    public void delete(long id){
        persistence.delete(id);
    }
    
}
