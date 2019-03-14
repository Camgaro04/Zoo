package co.edu.konrad.zoo.persistence;

import co.edu.konrad.zoo.entities.TipoAlimentoEntity;
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
public class TipoAlimentoPersistence {

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
    public List<TipoAlimentoEntity> findAll() {
        Query q = em.createQuery("select p from TipoAlimentoEntity p");
        return q.getResultList();
    }

    /**
     * retorna un dato
     *
     * @param id
     * @return
     */
    public TipoAlimentoEntity find(Long id) {
        return em.find(TipoAlimentoEntity.class, id);
    }

    /**
     * insert Puede ser void
     *
     * @param p
     * @return
     */
    public TipoAlimentoEntity create(TipoAlimentoEntity p) {
        em.persist(p);
        return p;
    }

    /**
     * Update
     *
     * @param p
     * @return actualizado
     */
    public TipoAlimentoEntity merge(TipoAlimentoEntity p) {
        return em.merge(p);
    }

    /**
     * Delete
     *
     * @param id
     */
    public void delete(long id) {
        TipoAlimentoEntity entity = em.find(TipoAlimentoEntity.class, id);
        em.remove(id);
    }
}
