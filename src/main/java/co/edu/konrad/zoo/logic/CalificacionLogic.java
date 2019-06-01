package co.edu.konrad.zoo.logic;

/**
 *
 * @author Grupo Zoo
 */
import co.edu.konrad.zoo.entities.CalificacionEntity;
import co.edu.konrad.zoo.persistence.CalificacionPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class CalificacionLogic {

    @Inject
    private CalificacionPersistence persistence;
    /**
     * Retorna lista de calificacion
     * @return 
     */
    public List<CalificacionEntity> findAll() {
        return persistence.findAll();
    }
    /**
     * Encuentra calificacion por id
     * @param id
     * @return 
     */
    public CalificacionEntity findById(long id) {
        return persistence.find(id);
    }
    /**
     * Inserta por medio de puente de la persistencia
     * @param p
     * @return 
     */
    public CalificacionEntity insert(CalificacionEntity p) {
        persistence.create(p);
        return p;
    }
    /**
     * Actualiza haciendo puente a la persistencia
     * @param id
     * @param entity
     * @return 
     */
    public CalificacionEntity actualizarCalificacion(long id, CalificacionEntity entity) {
        CalificacionEntity CalificacionActualizado = persistence.merge(entity);
        return CalificacionActualizado;
    }
    /**
     * Elimina haciendo puente a la persistencia
     * @param id 
     */
    public void delete(int id) {
        persistence.delete(id);
    }

}
