package co.edu.konrad.zoo.logic;

import co.edu.konrad.zoo.entities.TipoAlimentoEntity;
import co.edu.konrad.zoo.persistence.TipoAlimentoPersistence;

/**
 *
 * @author Grupo Zoo
 */
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class TipoAlimentoLogic {
     @Inject
    private TipoAlimentoPersistence persistence;
    
    public List<TipoAlimentoEntity> findAll(){
        return persistence.findAll();
    }
    
    public TipoAlimentoEntity findById(long id){
        return persistence.find(id);
    }
    
    
     public TipoAlimentoEntity insert(TipoAlimentoEntity p){
        persistence.create(p);
        return p;
    }
     
    public TipoAlimentoEntity update(TipoAlimentoEntity p){
        persistence.merge(p);
        return p;
    }
    
    
    public void delete(int id){
        persistence.delete(id);
    }
}
