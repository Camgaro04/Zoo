package co.edu.konrad.zoo.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Luis
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

    public CalificacionEntity() {
    }

    public CalificacionEntity(long idCalificacion, ShowEntity idShow, AnimalesEntity idAnimal, int calificacion, String observacion) {
        this.idCalificacion = idCalificacion;
        this.idShow = idShow;
        this.idAnimal = idAnimal;
        this.calificacion = calificacion;
        this.observacion = observacion;
    }

    public long getIdCalificacion() {
        return idCalificacion;
    }

    public ShowEntity getIdShow() {
        return idShow;
    }

    public AnimalesEntity getIdAnimal() {
        return idAnimal;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setIdCalificacion(long idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public void setIdShow(ShowEntity idShow) {
        this.idShow = idShow;
    }

    public void setIdAnimal(AnimalesEntity idAnimal) {
        this.idAnimal = idAnimal;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
   
    
    
}
