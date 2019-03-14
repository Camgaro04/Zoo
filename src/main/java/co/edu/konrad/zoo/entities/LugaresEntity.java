package co.edu.konrad.zoo.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Luis
 */
public class LugaresEntity {
     /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idLugar;
    
    /**
     * 
     */
    @Column(name = "nombre_lugar")
    private String nombreLugar;

    public LugaresEntity() {
    }

    public LugaresEntity(long idLugar, String nombreLugar) {
        this.idLugar = idLugar;
        this.nombreLugar = nombreLugar;
    }

    public long getIdLugar() {
        return idLugar;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setIdLugar(long idLugar) {
        this.idLugar = idLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }
    
    
}
