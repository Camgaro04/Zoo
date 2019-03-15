package co.edu.konrad.zoo.logic;

import co.edu.konrad.zoo.entities.TipoAnimalEntity;
import co.edu.konrad.zoo.persistence.TipoAnimalPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Andres Hernandez
 */
@Stateless
public class TipoAnimalLogic {
    @Inject
    private TipoAnimalPersistence persistence;
    
    
    /**
     * Get All
     *
     * @return Selecciona todos los Tipos de Animal
     */
    public List<TipoAnimalEntity> findAll(){
        return persistence.findAll();
    }
    
    /**
     * Get
     *
     * @param id
     * @return Selecciona un Tipo de Animal x ID
     */
    public TipoAnimalEntity findById(long id){
        return persistence.find(id);
    }
    

    /**
     * Insert
     *
     * @param p (Entity TipoAnimal)
     * @return Inserta  un Entity Animal
     */    
    public TipoAnimalEntity insert(TipoAnimalEntity p){
        persistence.create(p);
        return p;
    }
     
     /**
     * Update
     *
     * @param p (Entity TipoAnimal)
     * @return Actualiza  un Entity Animal
     */    
    public TipoAnimalEntity update(TipoAnimalEntity p){
        persistence.merge(p);
        return p;
    }
        
     /**
     * Delete
     * Elimina un Tipo Animal x ID
     * @param id
     */  
    public void delete(int id){
        persistence.delete(id);
    }
}
