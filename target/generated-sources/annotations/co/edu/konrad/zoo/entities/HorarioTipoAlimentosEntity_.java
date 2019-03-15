package co.edu.konrad.zoo.entities;

import co.edu.konrad.zoo.entities.HorarioEntity;
import co.edu.konrad.zoo.entities.HorarioTipoAlimentosEntity.PK_AHorarioTipoAlimentos;
import co.edu.konrad.zoo.entities.TipoAlimentoEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-14T20:18:01")
@StaticMetamodel(HorarioTipoAlimentosEntity.class)
public class HorarioTipoAlimentosEntity_ { 

    public static volatile SingularAttribute<HorarioTipoAlimentosEntity, PK_AHorarioTipoAlimentos> clave;
    public static volatile SingularAttribute<HorarioTipoAlimentosEntity, HorarioEntity> idHorario;
    public static volatile SingularAttribute<HorarioTipoAlimentosEntity, TipoAlimentoEntity> idTipoAlimentos;

}