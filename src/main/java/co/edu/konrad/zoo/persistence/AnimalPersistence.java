package co.edu.konrad.zoo.persistence;

import co.edu.konrad.zoo.entities.AnimalesEntity;
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
public class AnimalPersistence {

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
    public List<AnimalesEntity> findAll() {
        Query q = em.createQuery("select p from AnimalesEntity p");
        return q.getResultList();
    }

    /**
     * retorna un dato
     *
     * @param id
     * @return
     */
    public AnimalesEntity find(Long id) {
        return em.find(AnimalesEntity.class, id);
    }

    /**
     * insert Puede ser void
     *
     * @param p
     * @return
     */
    public AnimalesEntity create(AnimalesEntity p) {
        em.persist(p);
        return p;
    }

    /**
     * Update
     *
     * @param p
     * @return actualizado
     */
    public AnimalesEntity merge(AnimalesEntity p) {
        return em.merge(p);
    }

    /**
     * Delete
     *
     * @param id
     */
    public void delete(long id) {
        AnimalesEntity entity = em.find(AnimalesEntity.class, id);
        em.remove(id);
    }

}
