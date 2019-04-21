package co.edu.konrad.zoo.logic;

import co.edu.konrad.zoo.entities.EspeciesEntity;
import co.edu.konrad.zoo.persistence.EspeciePersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Andres Hernandez
 */
@Stateless
public class EspecieLogic {

    @Inject
    private EspeciePersistence persistence;

    /**
     * Get All
     *
     * @return Selecciona todos los lugares
     */
    public List<EspeciesEntity> findAll() {
        return persistence.findAll();
    }

    /**
     * Get
     *
     * @param id
     * @return Selecciona una especie x ID
     */
    public EspeciesEntity findById(long id) {
        return persistence.find(id);
    }

    /**
     * Insert
     *
     * @param especie
     * @return Inserta Especie
     */
    public EspeciesEntity insert(EspeciesEntity especie) {
        persistence.create(especie);
        return especie;
    }

    public EspeciesEntity actualizarEspecie(long id, EspeciesEntity entity) {
        EspeciesEntity EspecieActualizado = persistence.merge(entity);
        return EspecieActualizado;
    }

    /**
     * Delete
     *
     * @param id
     * @return Eliminacion
     */
    public void delete(long id) {
        persistence.delete(id);
    }
}
