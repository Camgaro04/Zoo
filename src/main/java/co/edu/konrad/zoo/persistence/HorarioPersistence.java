package co.edu.konrad.zoo.persistence;

import co.edu.konrad.zoo.entities.HorarioEntity;
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
public class HorarioPersistence {

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
    public List<HorarioEntity> findAll() {
        Query q = em.createQuery("select p from HorarioEntity p");
        return q.getResultList();
    }

    /**
     * retorna un dato
     *
     * @param id
     * @return
     */
    public HorarioEntity find(Long id) {
        return em.find(HorarioEntity.class, id);
    }

    /**
     * insert Puede ser void
     *
     * @param p
     * @return
     */
    public HorarioEntity create(HorarioEntity p) {
        em.persist(p);
        return p;
    }

    /**
     * Update
     *
     * @param p
     * @return actualizado
     */
    public HorarioEntity merge(HorarioEntity p) {
        return em.merge(p);
    }

    /**
     * Delete
     *
     * @param id
     */
    public void delete(long id) {
        HorarioEntity entity = em.find(HorarioEntity.class, id);
        em.remove(id);
    }

}
