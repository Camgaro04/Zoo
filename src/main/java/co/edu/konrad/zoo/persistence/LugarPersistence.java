package co.edu.konrad.zoo.persistence;

import co.edu.konrad.zoo.entities.LugaresEntity;
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
public class LugarPersistence {

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
    public List<LugaresEntity> findAll() {
        Query q = em.createQuery("select p from LugaresEntity p");
        return q.getResultList();
    }

    /**
     * retorna un dato
     *
     * @param id
     * @return
     */
    public LugaresEntity find(Long id) {
        return em.find(LugaresEntity.class, id);
    }

    /**
     * insert Puede ser void
     *
     * @param p
     * @return
     */
    public LugaresEntity create(LugaresEntity p) {
        em.persist(p);
        return p;
    }

    /**
     * Update
     *
     * @param p
     * @return actualizado
     */
    public LugaresEntity merge(LugaresEntity p) {
        return em.merge(p);
    }

    /**
     * Delete
     *
     * @param id
     */
    public void delete(long id) {
        LugaresEntity entity = em.find(LugaresEntity.class, id);
        em.remove(id);
    }
}
