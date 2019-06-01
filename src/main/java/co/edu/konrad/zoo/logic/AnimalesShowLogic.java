package co.edu.konrad.zoo.logic;

/**
 *
 * @author Grupo Zoo
 */
import co.edu.konrad.zoo.entities.AnimalesShowEntity;
import co.edu.konrad.zoo.persistence.AnimalesShowPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class AnimalesShowLogic {

    @Inject
    private AnimalesShowPersistence persistence;

    public List<AnimalesShowEntity> findAll() {
        return persistence.findAll();
    }
    /**
     * Encuentra animales por id
     * @param id
     * @return 
     */
    public AnimalesShowEntity findById(long id) {
        return persistence.find(id);
    }
    /**
     * Inserta 
     * @param p
     * @return 
     */
    public AnimalesShowEntity insert(AnimalesShowEntity p) {
        persistence.create(p);
        return p;
    }
    /**
     * Actualiza animales
     * @param id
     * @param entity
     * @return 
     */
    public AnimalesShowEntity actualizarAnimalesShow(long id, AnimalesShowEntity entity) {
        AnimalesShowEntity AnimalesShowActualizado = persistence.merge(entity);
        return AnimalesShowActualizado;
    }
    /**
     * Elimina animal haciendo puente con la persistencia
     * @param id 
     */
    public void delete(int id) {
        persistence.delete(id);
    }
}
