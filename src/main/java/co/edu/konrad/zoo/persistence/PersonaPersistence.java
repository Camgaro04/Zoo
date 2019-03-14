package co.edu.konrad.zoo.persistence;

import co.edu.konrad.zoo.entities.PersonaEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Grupo Zoo
 */
@Stateless
public class PersonaPersistence {
    /**
     * Manejador
     */
    @PersistenceContext(unitName = "ZooPU")
    protected EntityManager em;
    
    
    public List<PersonaEntity> findAll(){ 
        return em.createQuery("select p from PersonaEntity p").getResultList();
    }
    
    public PersonaEntity find(int id){
        return em.find(PersonaEntity.class, id);
    }
    
    public PersonaEntity insert(PersonaEntity p){
        em.persist(p);
        return p;
    }
    
    
    public PersonaEntity update(PersonaEntity p){
        return em.merge(p);
    }
    
    public void delete(int id){
        PersonaEntity personaEntity = em.find(PersonaEntity.class, id);
        em.remove(personaEntity);
    }
    
}
