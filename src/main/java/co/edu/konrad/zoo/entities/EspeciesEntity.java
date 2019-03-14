package co.edu.konrad.zoo.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Luis
 */
public class EspeciesEntity {
     /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEspecie;
    
    /**
     * 
     */
    @Column(name = "nombre_especie")
    private String nombreEspecie;

    public EspeciesEntity() {
    }

    public EspeciesEntity(long idEspecie, String nombreEspecie) {
        this.idEspecie = idEspecie;
        this.nombreEspecie = nombreEspecie;
    }

    public long getIdEspecie() {
        return idEspecie;
    }

    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public void setIdEspecie(long idEspecie) {
        this.idEspecie = idEspecie;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }
    
    
}
