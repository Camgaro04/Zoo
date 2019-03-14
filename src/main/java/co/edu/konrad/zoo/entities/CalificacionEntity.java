package co.edu.konrad.zoo.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Grupo Zoo
 */
public class CalificacionEntity {
     /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCalificacion;
   
     /**
     *
     */
    @JoinColumn(name = "id_show")
    @ManyToOne
    private ShowEntity idShow;
    
    /**
     *
     */
    @JoinColumn(name = "id_animal")
    @ManyToOne
    private AnimalesEntity idAnimal;

     /**
     * 
     */
    @Column(name = "calificacion")
    private int calificacion;
    
     /**
     * 
     */
    @Column(name = "onservacion")
    private String observacion;
   
}
