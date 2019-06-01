package co.edu.konrad.zoo.logic;

import co.edu.konrad.zoo.entities.AnimalesEntity;
import co.edu.konrad.zoo.persistence.AnimalPersistence;
import java.util.List;

/**
 *
 * @author Grupo Zoo
 */
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class AnimalesLogic {
    /**
     * Declara la persistencia de la clase
     */
    @Inject
    private AnimalPersistence persistence;
    /**
     * Retorna la lista de la entidad
     */
    public List<AnimalesEntity> findAll() {
        return persistence.findAll();
    }
    /**
     * Encuentra por id el animal hace el puente por la persistencia
     * @param id
     * @return 
     */
    public AnimalesEntity findById(long id) {
        return persistence.find(id);
    }
    /**
     * inserta un animal hace puente por la persistencia
     * @param p
     * @return 
     */
    public AnimalesEntity insert(AnimalesEntity p) {
        persistence.create(p);
        return p;
    }
    /**
     * ACtualiza animales  puente en la resistencia
     * @param id
     * @param entity
     * @return 
     */
    public AnimalesEntity actualizarAnimales(long id, AnimalesEntity entity) {
        AnimalesEntity AnimalesActualizado = persistence.merge(entity);
        return AnimalesActualizado;
    }
    /**
     * Elima un animal por medio del id por puente de la resistencia
     * @param id 
     */
    public void delete(int id) {
        persistence.delete(id);
    }
}
