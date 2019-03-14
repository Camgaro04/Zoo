package co.edu.konrad.zoo.persistence;

import co.edu.konrad.zoo.entities.TipoAnimalEntity;
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
public class TipoAnimalPersistence {

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
    public List<TipoAnimalEntity> findAll() {
        Query q = em.createQuery("select p from TipoAnimalEntity p");
        return q.getResultList();
    }

    /**
     * retorna un dato
     *
     * @param id
     * @return
     */
    public TipoAnimalEntity find(Long id) {
        return em.find(TipoAnimalEntity.class, id);
    }

    /**
     * insert Puede ser void
     *
     * @param p
     * @return
     */
    public TipoAnimalEntity create(TipoAnimalEntity p) {
        em.persist(p);
        return p;
    }

    /**
     * Update
     *
     * @param p
     * @return actualizado
     */
    public TipoAnimalEntity merge(TipoAnimalEntity p) {
        return em.merge(p);
    }

    /**
     * Delete
     *
     * @param id
     */
    public void delete(long id) {
        TipoAnimalEntity entity = em.find(TipoAnimalEntity.class, id);
        em.remove(id);
    }
}
