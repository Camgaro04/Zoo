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

    @Inject
    private AnimalPersistence persistence;

    public List<AnimalesEntity> findAll() {
        return persistence.findAll();
    }

    public AnimalesEntity findById(long id) {
        return persistence.find(id);
    }

    public AnimalesEntity insert(AnimalesEntity p) {
        persistence.create(p);
        return p;
    }

    public AnimalesEntity actualizarAnimales(long id, AnimalesEntity entity) {
        AnimalesEntity AnimalesActualizado = persistence.merge(entity);
        return AnimalesActualizado;
    }

    public void delete(int id) {
        persistence.delete(id);
    }
}
