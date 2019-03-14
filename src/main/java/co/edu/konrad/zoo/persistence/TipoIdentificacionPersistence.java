package co.edu.konrad.zoo.persistence;

import co.edu.konrad.zoo.entities.TipoIdentificacionEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Grupo Zoo
 */
@Stateless
public class TipoIdentificacionPersistence {
    /**
     * Manejador
     */
    @PersistenceContext(unitName = "ZooPU")
    protected EntityManager em;
    
    public List<TipoIdentificacionEntity> findAll(){ 
        return em.createQuery("select p from TipoIdentificacionEntity p").getResultList();
    }
    
    public TipoIdentificacionEntity find(int id){
        return em.find(TipoIdentificacionEntity.class, id);
    }
    
    public TipoIdentificacionEntity insert(TipoIdentificacionEntity p){
        em.persist(p);
        return p;
    }
    
    
    public TipoIdentificacionEntity update(TipoIdentificacionEntity p){
        return em.merge(p);
    }
    
    public void delete(int id){
        TipoIdentificacionEntity identificacionEntity = em.find(TipoIdentificacionEntity.class, id);
        em.remove(identificacionEntity);
    }
    
}
