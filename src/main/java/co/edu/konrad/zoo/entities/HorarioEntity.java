package co.edu.konrad.zoo.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Andres Correa
 */
@Entity
public class HorarioEntity implements Serializable{
    
     /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idHorario;

    /**
     * 
     */
    @Column(name = "horario_nombre")
    private String horarioNombre;

    /**
     * 
     */
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date FechaInicio;

    /**
     * 
     */
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date FechaFin;
/**
 * Constructor vacio
 */
    public HorarioEntity() {
    }
    /**
     * Constructor
     * @param idHorario
     * @param horarioNombre
     * @param FechaInicio
     * @param FechaFin 
     */
    public HorarioEntity(long idHorario, String horarioNombre, Date FechaInicio, Date FechaFin) {
        this.idHorario = idHorario;
        this.horarioNombre = horarioNombre;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
    }
    /**
     * Gets and sets of the class
     * @return 
     */
    public long getIdHorario() {
        return idHorario;
    }

    public String getHorarioNombre() {
        return horarioNombre;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setIdHorario(long idHorario) {
        this.idHorario = idHorario;
    }

    public void setHorarioNombre(String horarioNombre) {
        this.horarioNombre = horarioNombre;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }
    
    
    
   
}
