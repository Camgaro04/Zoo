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
}
