package co.edu.konrad.zoo.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Andres Correa
 */
@Entity
public class HorarioTipoAlimentosEntity implements Serializable {

    @EmbeddedId
    private PK_A clave;

    /**
     *
     */
    @JoinColumn(name = "id_Horario")
    @ManyToOne
    private HorarioEntity idHorario;

    /**
     *
     */
    @JoinColumn(name = "id_tipo_Alimentos")
    @ManyToOne
    private TipoAlimentoEntity idTipoAlimentos;

    public HorarioTipoAlimentosEntity() {
    }

    public HorarioTipoAlimentosEntity(HorarioEntity idHorario, TipoAlimentoEntity idTipoAlimentos) {
        this.idHorario = idHorario;
        this.idTipoAlimentos = idTipoAlimentos;
    }

    public void setIdHorario(HorarioEntity idHorario) {
        this.idHorario = idHorario;
    }

    public void setIdTipoAlimentos(TipoAlimentoEntity idTipoAlimentos) {
        this.idTipoAlimentos = idTipoAlimentos;
    }

    public HorarioEntity getIdHorario() {
        return idHorario;
    }

    public TipoAlimentoEntity getIdTipoAlimentos() {
        return idTipoAlimentos;
    }

    public class PK_A {

        @Column
        private String idHorario;
        
        @Column
        private String idTipoAlimentos;
    }

}
