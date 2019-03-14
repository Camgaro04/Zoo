package co.edu.konrad.zoo.persistence;

import co.edu.konrad.zoo.entities.CalificacionEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Luis
 */
@Stateless
public class CalificacionPersistence {

    /**
     * Manejador
     */
    @PersistenceContext(unitName = "ZooPU")
    protected EntityManager em;

    /**
     * retorna todo
     *
     * @return
     */
    public List<CalificacionEntity> findAll() {
        Query q = em.createQuery("select p from CalificacionEntity p");
        return q.getResultList();
    }

    /**
     * retorna un dato
     *
     * @param id
     * @return
     */
    public CalificacionEntity find(Long id) {
        return em.find(CalificacionEntity.class, id);
    }

    /**
     * insert Puede ser void
     *
     * @param p
     * @return
     */
    public CalificacionEntity create(CalificacionEntity p) {
        em.persist(p);
        return p;
    }

    /**
     * Update
     *
     * @param p
     * @return actualizado
     */
    public CalificacionEntity merge(CalificacionEntity p) {
        return em.merge(p);
    }

    /**
     * Delete
     *
     * @param id
     */
    public void delete(long id) {
        CalificacionEntity entity = em.find(CalificacionEntity.class, id);
        em.remove(id);
    }

}
