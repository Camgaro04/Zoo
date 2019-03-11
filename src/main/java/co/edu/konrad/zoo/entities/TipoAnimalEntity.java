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

    public TipoAnimalEntity() {
    }

    public TipoAnimalEntity(long idTipoAnimal, String nombreTipoAnimal) {
        this.idTipoAnimal = idTipoAnimal;
        this.nombreTipoAnimal = nombreTipoAnimal;
    }

    public long getIdTipoAnimal() {
        return idTipoAnimal;
    }

    public String getNombreTipoAnimal() {
        return nombreTipoAnimal;
    }

    public void setIdTipoAnimal(long idTipoAnimal) {
        this.idTipoAnimal = idTipoAnimal;
    }

    public void setNombreTipoAnimal(String nombreTipoAnimal) {
        this.nombreTipoAnimal = nombreTipoAnimal;
    }

   
    
}
