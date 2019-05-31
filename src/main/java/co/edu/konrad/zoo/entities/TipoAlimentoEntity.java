package co.edu.konrad.zoo.entities;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 *
 * @author andres Correa
 */
@Entity
public class TipoAlimentoEntity implements Serializable {
        /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTipoAlimento;

     /**
     * 
     */ 
   
    @JoinColumn(name = "id_tipo_Animal")
    @ManyToOne
    private TipoAnimalEntity idTipoAnimal;
    /**
     * 
     */
    @Column(name = "nombre_Alimento")
    private String nombreAlimento;
    /**
     * Constructor vacio
     */
    public TipoAlimentoEntity() {
    }
    /**
     * Constructor
     * @param idTipoAlimento
     * @param idTipoAnimal
     * @param nombreAlimento 
     */
    public TipoAlimentoEntity(long idTipoAlimento, TipoAnimalEntity idTipoAnimal, String nombreAlimento) {
        this.idTipoAlimento = idTipoAlimento;
        this.idTipoAnimal = idTipoAnimal;
        this.nombreAlimento = nombreAlimento;
    }
    /**
     * Gets and sets of the class
     * @return 
     */
    public long getIdTipoAlimento() {
        return idTipoAlimento;
    }

    public TipoAnimalEntity getIdTipoAnimal() {
        return idTipoAnimal;
    }

    public String getNombreAlimento() {
        return nombreAlimento;
    }

    public void setIdTipoAlimento(long idTipoAlimento) {
        this.idTipoAlimento = idTipoAlimento;
    }

    public void setIdTipoAnimal(TipoAnimalEntity idTipoAnimal) {
        this.idTipoAnimal = idTipoAnimal;
    }

    public void setNombreAlimento(String nombreAlimento) {
        this.nombreAlimento = nombreAlimento;
    }

   

}
