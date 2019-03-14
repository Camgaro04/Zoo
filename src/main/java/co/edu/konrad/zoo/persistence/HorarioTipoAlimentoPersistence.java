package co.edu.konrad.zoo.persistence;

import co.edu.konrad.zoo.entities.HorarioTipoAlimentosEntity;
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
public class HorarioTipoAlimentoPersistence {

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
    public List<HorarioTipoAlimentosEntity> findAll() {
        Query q = em.createQuery("select p from HorarioTipoAlimentosEntity p");
        return q.getResultList();
    }

    /**
     * retorna un dato
     *
     * @param id
     * @return
     */
    public HorarioTipoAlimentosEntity find(Long id) {
        return em.find(HorarioTipoAlimentosEntity.class, id);
    }

    /**
     * insert Puede ser void
     *
     * @param p
     * @return
     */
    public HorarioTipoAlimentosEntity create(HorarioTipoAlimentosEntity p) {
        em.persist(p);
        return p;
    }

    /**
     * Update
     *
     * @param p
     * @return actualizado
     */
    public HorarioTipoAlimentosEntity merge(HorarioTipoAlimentosEntity p) {
        return em.merge(p);
    }

    /**
     * Delete
     *
     * @param id
     */
    public void delete(long id) {
        HorarioTipoAlimentosEntity entity = em.find(HorarioTipoAlimentosEntity.class, id);
        em.remove(id);
    }
}
