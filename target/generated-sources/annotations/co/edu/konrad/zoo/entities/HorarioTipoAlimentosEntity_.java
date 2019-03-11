package co.edu.konrad.zoo.entities;

import co.edu.konrad.zoo.entities.HorarioEntity;
import co.edu.konrad.zoo.entities.HorarioTipoAlimentosEntity.PK_A;
import co.edu.konrad.zoo.entities.TipoAlimentoEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-11T14:25:22")
@StaticMetamodel(HorarioTipoAlimentosEntity.class)
public class HorarioTipoAlimentosEntity_ { 

    public static volatile SingularAttribute<HorarioTipoAlimentosEntity, PK_A> clave;
    public static volatile SingularAttribute<HorarioTipoAlimentosEntity, HorarioEntity> idHorario;
    public static volatile SingularAttribute<HorarioTipoAlimentosEntity, TipoAlimentoEntity> idTipoAlimentos;

}