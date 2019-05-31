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
 * @author Grupo Zoo
 */

@Entity
public class CuidadorEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCuidador;
    
    @JoinColumn(name="id_persona")
    @ManyToOne
    private PersonaEntity idPersona;
    /**
     * Constructor vacio
     */
    public CuidadorEntity(){
    
    }
    
        /**
         * Constructor
         * @param idCiudador
         * @param idPersona 
         */
    public CuidadorEntity(int idCiudador,PersonaEntity idPersona){
        this.idCuidador = idCiudador;
        this.idPersona = idPersona;
    }

    /**
     * @return the idCuidador
     */
    public int getIdCuidador() {
        return idCuidador;
    }

    /**
     * @param idCuidador the idCuidador to set
     */
    public void setIdCuidador(int idCuidador) {
        this.idCuidador = idCuidador;
    }

    /**
     * @return the idPersona
     */
    public PersonaEntity getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(PersonaEntity idPersona) {
        this.idPersona = idPersona;
    }
}
