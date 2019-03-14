package co.edu.konrad.zoo.persistence;

import co.edu.konrad.zoo.entities.EspeciesEntity;
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
public class EspeciePersistence {

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
    public List<EspeciesEntity> findAll() {
        Query q = em.createQuery("select p from EspeciesEntity p");
        return q.getResultList();
    }

    /**
     * retorna un dato
     *
     * @param id
     * @return
     */
    public EspeciesEntity find(Long id) {
        return em.find(EspeciesEntity.class, id);
    }

    /**
     * insert Puede ser void
     *
     * @param p
     * @return
     */
    public EspeciesEntity create(EspeciesEntity p) {
        em.persist(p);
        return p;
    }

    /**
     * Update
     *
     * @param p
     * @return actualizado
     */
    public EspeciesEntity merge(EspeciesEntity p) {
        return em.merge(p);
    }

    /**
     * Delete
     *
     * @param id
     */
    public void delete(long id) {
        EspeciesEntity entity = em.find(EspeciesEntity.class, id);
        em.remove(id);
    }

}
