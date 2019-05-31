package co.edu.konrad.zoo.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Grupo Zoo
 */
@Entity
public class PersonaEntity implements Serializable{
    /**
     * Id persona columna
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPersona;
    /**
     * Nombre Completo columna de tabla
     */
    @Column(name="nombre_completo")
    private String nombreCompleto;
   
    @Column(name="numero_identificacion")
    private String numeroIdentificacion;
    
    @Column(name="fecha_nacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    
    @Column(name="numero_celular")
    private String numeroCelular;
    
    @JoinColumn(name="tipo_identificacion")
    @ManyToOne
    private TipoIdentificacionEntity idTipoIdentificacion; 
    /**
     * Constructor vacio
     */
    public PersonaEntity(){
    
    }    
    /**
     * Constructor
     * @param idPersona
     * @param nombreCompleto
     * @param numeroIdentificacion
     * @param idTipoIdentificacion
     * @param fechaNacimiento
     * @param numeroCelular 
     */
    public PersonaEntity(int idPersona,String nombreCompleto,String numeroIdentificacion,
            TipoIdentificacionEntity idTipoIdentificacion, Date fechaNacimiento,String numeroCelular ){
        
        this.idPersona = idPersona;
        this.nombreCompleto = nombreCompleto;
        this.numeroIdentificacion = numeroIdentificacion;
        this.idTipoIdentificacion = idTipoIdentificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroCelular = numeroCelular;
    }
    
    /**
     * @return the idPersona
     */
    public int getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * @return the nombreCompleto
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * @param nombreCompleto the nombreCompleto to set
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * @return the idTipoIdentificacion
     */
    public TipoIdentificacionEntity getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    /**
     * @param idTipoIdentificacion the idTipoIdentificacion to set
     */
    public void setIdTipoIdentificacion(TipoIdentificacionEntity idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    /**
     * @return the numeroIdentificacion
     */
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    /**
     * @param numeroIdentificacion the numeroIdentificacion to set
     */
    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the numeroCelular
     */
    public String getNumeroCelular() {
        return numeroCelular;
    }

    /**
     * @param numeroCelular the numeroCelular to set
     */
    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
}