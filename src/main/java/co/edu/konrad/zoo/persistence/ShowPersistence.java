package co.edu.konrad.zoo.persistence;

import co.edu.konrad.zoo.entities.ShowEntity;
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
public class ShowPersistence {

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
    public List<ShowEntity> findAll() {
        Query q = em.createQuery("select p from ShowEntity p");
        return q.getResultList();
    }

    /**
     * retorna un dato
     *
     * @param id
     * @return
     */
    public ShowEntity find(Long id) {
        return em.find(ShowEntity.class, id);
    }

    /**
     * insert Puede ser void
     *
     * @param p
     * @return
     */
    public ShowEntity create(ShowEntity p) {
        em.persist(p);
        return p;
    }

    /**
     * Update
     *
     * @param p
     * @return actualizado
     */
    public ShowEntity merge(ShowEntity p) {
        return em.merge(p);
    }

    /**
     * Delete
     *
     * @param id
     */
    public void delete(long id) {
        ShowEntity entity = em.find(ShowEntity.class, id);
        em.remove(id);
    }
    /**
     * Insertar 
     * @param p
     * @return 
     */
     
}