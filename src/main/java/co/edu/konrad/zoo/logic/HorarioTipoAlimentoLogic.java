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

    public List<HorarioTipoAlimentosEntity> findAll() {
        return persistence.findAll();
    }

    public HorarioTipoAlimentosEntity findById(long id) {
        return persistence.find(id);
    }

    public HorarioTipoAlimentosEntity insert(HorarioTipoAlimentosEntity p) {
        persistence.create(p);
        return p;
    }

    public HorarioTipoAlimentosEntity actualizarHorarioTipoAlimentos(long id, HorarioTipoAlimentosEntity entity) {
        HorarioTipoAlimentosEntity HorarioTipoAlimentosActualizado = persistence.merge(entity);
        return HorarioTipoAlimentosActualizado;
    }

    public void delete(int id) {
        persistence.delete(id);
    }
}
