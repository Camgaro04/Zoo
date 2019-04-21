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

    public AnimalesShowEntity findById(long id) {
        return persistence.find(id);
    }

    public AnimalesShowEntity insert(AnimalesShowEntity p) {
        persistence.create(p);
        return p;
    }

    public AnimalesShowEntity actualizarAnimalesShow(long id, AnimalesShowEntity entity) {
        AnimalesShowEntity AnimalesShowActualizado = persistence.merge(entity);
        return AnimalesShowActualizado;
    }

    public void delete(int id) {
        persistence.delete(id);
    }
}
