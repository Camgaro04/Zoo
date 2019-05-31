package co.edu.konrad.zoo.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Grupo Zoo
 */


@Entity
public class TipoIdentificacionEntity implements Serializable{
    /**
     * Columna id de tipo de identificacion
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTipoIdentificacion;
    /**
     * Columna nombre de identificacion de la tabla
     */
    @Column(name="nombre_identificacion")  
    private String nombreIdentificacion;
    
    /**
     * Constructor vacio
     */
    public TipoIdentificacionEntity(){
    
    }
    /**
     * Consrtructor
     * @param idTipoIdentificacion
     * @param nombreIdentificacion 
     */
    public TipoIdentificacionEntity(int idTipoIdentificacion,String nombreIdentificacion){
        this.idTipoIdentificacion = idTipoIdentificacion;
        this.nombreIdentificacion = nombreIdentificacion;
    }

    /**
     * @return the idTipoIdentificacion
     */
    public int getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    /**
     * @param idTipoIdentificacion the idTipoIdentificacion to set
     */
    public void setIdTipoIdentificacion(int idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    /**
     * @return the nombreIdentificacion
     */
    public String getNombreIdentificacion() {
        return nombreIdentificacion;
    }

    /**
     * @param nombreIdentificacion the nombreIdentificacion to set
     */
    public void setNombreIdentificacion(String nombreIdentificacion) {
        this.nombreIdentificacion = nombreIdentificacion;
    }
    
}
