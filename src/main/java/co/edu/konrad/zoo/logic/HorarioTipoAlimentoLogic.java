package co.edu.konrad.zoo.logic;

import co.edu.konrad.zoo.entities.HorarioTipoAlimentosEntity;
import co.edu.konrad.zoo.persistence.HorarioTipoAlimentoPersistence;

/**
 *
 * @author Grupo Zoo
 */
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class HorarioTipoAlimentoLogic {

    @Inject
    private HorarioTipoAlimentoPersistence persistence;
    /**
     * Lista todos los horarios haciendo puente con la persistencia
     * @return 
     */
    public List<HorarioTipoAlimentosEntity> findAll() {
        return persistence.findAll();
    }
    /**
     * Encuentra por id puente persistencia
     * @param id
     * @return 
     */
    public HorarioTipoAlimentosEntity findById(long id) {
        return persistence.find(id);
    }
    /**
     * Insert
     */ 
    public HorarioTipoAlimentosEntity insert(HorarioTipoAlimentosEntity p) {
        persistence.create(p);
        return p;
    }
    /**
     * Actualiza horario 
     * @param id
     * @param entity
     * @return 
     */
    public HorarioTipoAlimentosEntity actualizarHorarioTipoAlimentos(long id, HorarioTipoAlimentosEntity entity) {
        HorarioTipoAlimentosEntity HorarioTipoAlimentosActualizado = persistence.merge(entity);
        return HorarioTipoAlimentosActualizado;
    }
    /**
     * ELimina horario
     * @param id 
     */
    public void delete(int id) {
        persistence.delete(id);
    }
}
