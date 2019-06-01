package co.edu.konrad.zoo.logic;

import co.edu.konrad.zoo.entities.PersonaEntity;
import co.edu.konrad.zoo.persistence.PersonaPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Grupo Zoo
 */
@Stateless
public class PersonaLogic {

    @Inject
    private PersonaPersistence persistence;
    /**
     * Lista las personas  todas
     * @return 
     */
    public List<PersonaEntity> findAll() {
        return persistence.findAll();
    }
    /**
     * Encuentra por id haciendo puente con la persistencia
     * @param id
     * @return 
     */
    public PersonaEntity findById(int id) {
        return persistence.find(id);
    }
    /**
     * Inserta
     * @param p
     * @return 
     */
    public PersonaEntity insert(PersonaEntity p) {
        persistence.insert(p);
        return p;
    }
    /**
     * Actualiza
     * @param id
     * @param entity
     * @return 
     */
    public PersonaEntity actualizarPersona(long id, PersonaEntity entity) {
        PersonaEntity PersonaActualizado = persistence.update(entity);
        return PersonaActualizado;
    }
    /**
     * ELimina por id
     * @param id 
     */
    public void delete(int id) {
        persistence.delete(id);
    }

}
