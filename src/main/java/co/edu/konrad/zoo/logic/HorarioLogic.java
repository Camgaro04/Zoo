package co.edu.konrad.zoo.logic;

import co.edu.konrad.zoo.entities.HorarioEntity;
import co.edu.konrad.zoo.persistence.HorarioPersistence;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Luis
 */
public class HorarioLogic {

    @Inject
    private HorarioPersistence persistence;

    /**
     * Get All
     *
     * @return Selecciona todos los horarios
     */
    public List<HorarioEntity> findAll() {
        return persistence.findAll();
    }

    /**
     * Get
     *
     * @param id
     * @return Selecciona un horario x ID
     */
    public HorarioEntity findById(long id) {
        return persistence.find(id);
    }

    /**
     * Insert
     *
     * @param horario
     * @return Inserta Horario
     */
    public HorarioEntity insert(HorarioEntity horario) {
        persistence.create(horario);
        return horario;
    }

    public HorarioEntity actualizarHorario(long id, HorarioEntity entity) {
        HorarioEntity HorarioActualizado = persistence.merge(entity);
        return HorarioActualizado;
    }

    /**
     * Delete
     *
     * @param id
     *
     */
    public void delete(long id) {
        persistence.delete(id);
    }
}
