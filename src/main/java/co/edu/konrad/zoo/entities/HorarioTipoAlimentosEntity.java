package co.edu.konrad.zoo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Andres Correa
 */
@Entity
public class HorarioTipoAlimentosEntity implements Serializable {

    /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idHorarioTipoAlimentos;
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
    /**
     * Constructor
     */
    public HorarioTipoAlimentosEntity() {
    }
    /**
     * Constructor Tipo Alimentos
     * @param idHorarioTipoAlimentos
     * @param idHorario
     * @param idTipoAlimentos 
     */
    public HorarioTipoAlimentosEntity(long idHorarioTipoAlimentos, HorarioEntity idHorario, TipoAlimentoEntity idTipoAlimentos) {
        this.idHorarioTipoAlimentos = idHorarioTipoAlimentos;
        this.idHorario = idHorario;
        this.idTipoAlimentos = idTipoAlimentos;
    }
    
    /**
     * Gets and sets of the class
     * @return 
     */
    public long getIdHorarioTipoAlimentos() {
        return idHorarioTipoAlimentos;
    }

    public void setIdHorarioTipoAlimentos(long idHorarioTipoAlimentos) {
        this.idHorarioTipoAlimentos = idHorarioTipoAlimentos;
    }

    public HorarioEntity getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(HorarioEntity idHorario) {
        this.idHorario = idHorario;
    }

    public TipoAlimentoEntity getIdTipoAlimentos() {
        return idTipoAlimentos;
    }

    public void setIdTipoAlimentos(TipoAlimentoEntity idTipoAlimentos) {
        this.idTipoAlimentos = idTipoAlimentos;
    }
}
