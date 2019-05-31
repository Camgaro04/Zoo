package co.edu.konrad.zoo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author andres Correa
 */
@Entity
public class TipoAnimalEntity  implements Serializable{
    /**     
    * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTipoAnimal;

   
    /**
     * 
     */
    @Column(name = "nombre_Tipo_Animal")
    private String nombreTipoAnimal;
    /**
     * Constructo vacio
     */
    public TipoAnimalEntity() {
    }
    /**
     * Constructor
     * @param idTipoAnimal
     * @param nombreTipoAnimal 
     */
    public TipoAnimalEntity(long idTipoAnimal, String nombreTipoAnimal) {
        this.idTipoAnimal = idTipoAnimal;
        this.nombreTipoAnimal = nombreTipoAnimal;
    }
    /**
     * Gets and set of the class
     * @return 
     */
    public long getIdTipoAnimal() {
        return idTipoAnimal;
    }
    /**
     * 
     * @return 
     */
    public String getNombreTipoAnimal() {
        return nombreTipoAnimal;
    }
    /**
     * 
     * @param idTipoAnimal 
     */
    public void setIdTipoAnimal(long idTipoAnimal) {
        this.idTipoAnimal = idTipoAnimal;
    }
    /**
     * 
     * @param nombreTipoAnimal 
     */
    public void setNombreTipoAnimal(String nombreTipoAnimal) {
        this.nombreTipoAnimal = nombreTipoAnimal;
    }

   
    
}
