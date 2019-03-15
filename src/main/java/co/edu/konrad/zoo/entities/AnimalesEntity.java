package co.edu.konrad.zoo.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author Luis
 */
@Entity
public class AnimalesEntity  implements Serializable {
     /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idAnimal;
    
    /**
     * 
     */
    @Column(name = "nombre")
    private String nombre;
    
    /**
     * 
     */
    @Column(name = "nombre_cientifico")
    private String nombreCientifico;
    
    /**
     * 
     */
    @Column(name = "descripcion")
    private String descripcion;
    
    @JoinColumn(name = "especie")
    @ManyToOne
    private EspeciesEntity especie;
    
    @JoinColumn(name = "tipo_animal")
    @ManyToOne
    private TipoAnimalEntity tipoAnimal;
    
    @JoinColumn(name = "cuidador")
    @ManyToOne
    private CuidadorEntity cuidador;

    public AnimalesEntity() {
    }

    public AnimalesEntity(long idAnimal, String nombre, String nombreCientifico, String descripcion, EspeciesEntity especie, TipoAnimalEntity tipoAnimal, CuidadorEntity cuidador) {
        this.idAnimal = idAnimal;
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.especie = especie;
        this.tipoAnimal = tipoAnimal;
        this.cuidador = cuidador;
    }

    public void setIdAnimal(long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEspecie(EspeciesEntity especie) {
        this.especie = especie;
    }

    public void setTipoAnimal(TipoAnimalEntity tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public void setCuidador(CuidadorEntity cuidador) {
        this.cuidador = cuidador;
    }

    public long getIdAnimal() {
        return idAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public EspeciesEntity getEspecie() {
        return especie;
    }

    public TipoAnimalEntity getTipoAnimal() {
        return tipoAnimal;
    }

    public CuidadorEntity getCuidador() {
        return cuidador;
    }
    
    

}
