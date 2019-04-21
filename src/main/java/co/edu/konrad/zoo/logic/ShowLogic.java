package co.edu.konrad.zoo.logic;

/**
 *
 * @author ZOO
 */
import co.edu.konrad.zoo.entities.ShowEntity;
import co.edu.konrad.zoo.persistence.ShowPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class ShowLogic {

    @Inject
    private ShowPersistence persistence;

    public List<ShowEntity> findAll() {
        return persistence.findAll();
    }

    public ShowEntity findById(long id) {
        return persistence.find(id);
    }

    public ShowEntity insert(ShowEntity p) {
        persistence.create(p);
        return p;
    }

    public ShowEntity actualizarShow(long id, ShowEntity entity) {
        ShowEntity ShowActualizado = persistence.merge(entity);
        return ShowActualizado;
    }

    public void delete(int id) {
        persistence.delete(id);
    }
}
