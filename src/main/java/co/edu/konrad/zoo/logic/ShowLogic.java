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
    /**
     * Busca todo por medio del puente de persistencia
     * @return 
     */
    public List<ShowEntity> findAll() {
        return persistence.findAll();
    }
    /**
     * Busca por id del show
     * @param id
     * @return 
     */
    public ShowEntity findById(long id) {
        return persistence.find(id);
    }
    /**
     * Inserta
     * @param p
     * @return 
     */
    public ShowEntity insert(ShowEntity p) {
        persistence.create(p);
        return p;
    }
    /**
     * Actualiza
     * @param id
     * @param entity
     * @return 
     */
    public ShowEntity actualizarShow(long id, ShowEntity entity) {
        ShowEntity ShowActualizado = persistence.merge(entity);
        return ShowActualizado;
    }
    /**
     * Elimina
     * @param id 
     */
    public void delete(int id) {
        persistence.delete(id);
    }
}
