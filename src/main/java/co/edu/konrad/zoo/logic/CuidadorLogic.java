package co.edu.konrad.zoo.logic;

import co.edu.konrad.zoo.entities.CuidadorEntity;
import co.edu.konrad.zoo.persistence.CuidadorPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Grupo Zoo
 */
@Stateless
public class CuidadorLogic {

    @Inject
    private CuidadorPersistence persistence;
    /**
     * Encuentra todos los cuidadores
     * @return 
     */
    public List<CuidadorEntity> findAll() {
        return persistence.findAll();
    }
    /**
     * Encuentra por ID
     * @param id
     * @return 
     */
    public CuidadorEntity findById(int id) {
        return persistence.find(id);
    }
    /***
     * Inserta haciendo puente en la persistencia
     * @param p
     * @return 
     */
    public CuidadorEntity insert(CuidadorEntity p) {
        persistence.insert(p);
        return p;
    }
    /**
     * Actualiza por medio de id haciendo puente de persistencia
     * @param id
     * @param entity
     * @return 
     */
    public CuidadorEntity actualizarCuidador(long id, CuidadorEntity entity) {
        CuidadorEntity CuidadorActualizado = persistence.update(entity);
        return CuidadorActualizado;
    }
    /**
     * Elimina haciendo puente con persistencia
     * @param id 
     */
    public void delete(int id) {
        persistence.delete(id);
    }

}
