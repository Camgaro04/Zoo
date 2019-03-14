package co.edu.konrad.zoo.persistence;

import co.edu.konrad.zoo.entities.CuidadorEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Grupo Zoo
 */
@Stateless
public class CuidadorPersistence {

    /**
     * Manejador
     */
    @PersistenceContext(unitName = "ZooPU")
    protected EntityManager em;

    /**
     * Obtiene todo
     *
     * @return List<CuidadorEntity>
     */
    public List<CuidadorEntity> findAll() {
        return em.createQuery("select p from CuidadorEntity p").getResultList();
    }

    /**
     * Busqueda por ID
     *
     * @param id
     * @return CuidadorEntity
     */
    public CuidadorEntity find(int id) {
        return em.find(CuidadorEntity.class, id);
    }

    public CuidadorEntity insert(CuidadorEntity p) {
        em.persist(p);
        return p;
    }

    public CuidadorEntity update(CuidadorEntity p) {
        return em.merge(p);
    }

    public void delete(int id) {
        CuidadorEntity cuidadorEntity = em.find(CuidadorEntity.class, id);
        em.remove(cuidadorEntity);
    }
}
