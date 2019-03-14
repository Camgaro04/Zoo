package co.edu.konrad.zoo.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Grupo Zoo
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
}
