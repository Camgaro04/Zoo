package co.edu.konrad.zoo.persistence;

import co.edu.konrad.zoo.entities.AnimalesShowEntity;
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
public class AnimalesShowPersistence {

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
    public List<AnimalesShowEntity> findAll() {
        Query q = em.createQuery("select p from AnimalesShowEntity p");
        return q.getResultList();
    }

    /**
     * retorna un dato
     *
     * @param id
     * @return
     */
    public AnimalesShowEntity find(Long id) {
        return em.find(AnimalesShowEntity.class, id);
    }

    /**
     * insert Puede ser void
     *
     * @param p
     * @return
     */
    public AnimalesShowEntity create(AnimalesShowEntity p) {
        em.persist(p);
        return p;
    }

    /**
     * Update
     *
     * @param p
     * @return actualizado
     */
    public AnimalesShowEntity merge(AnimalesShowEntity p) {
        return em.merge(p);
    }

    /**
     * Delete
     *
     * @param id
     */
    public void delete(long id) {
        AnimalesShowEntity entity = em.find(AnimalesShowEntity.class, id);
        em.remove(id);
    }

}
