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
    
    public List<HorarioTipoAlimentosEntity> findAll(){
        return persistence.findAll();
    }
    
    public HorarioTipoAlimentosEntity findById(long id){
        return persistence.find(id);
    }
    
    
     public HorarioTipoAlimentosEntity insert(HorarioTipoAlimentosEntity p){
        persistence.create(p);
        return p;
    }
     
    public HorarioTipoAlimentosEntity update(HorarioTipoAlimentosEntity p){
        persistence.merge(p);
        return p;
    }
    
    
    public void delete(int id){
        persistence.delete(id);
    }
}
