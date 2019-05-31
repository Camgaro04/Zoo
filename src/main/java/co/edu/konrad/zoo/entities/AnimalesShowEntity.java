package co.edu.konrad.zoo.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Luis
 */
@Entity
public class AnimalesShowEntity  implements Serializable {
    
   /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idAnimalesShow;
    /**
     *
     */
    @JoinColumn(name = "id_animal")
    @ManyToOne
    private AnimalesEntity idAnimal;

    /**
     *
     */
    @JoinColumn(name = "id_show")
    @ManyToOne
    private ShowEntity idShow;
    
    /**
     * Constructor
     */
    public AnimalesShowEntity() {
    }
    /**
     * Constructor
     * @param idAnimalesShow
     * @param idAnimal
     * @param idShow 
     */
    public AnimalesShowEntity(long idAnimalesShow, AnimalesEntity idAnimal, ShowEntity idShow) {
        this.idAnimalesShow = idAnimalesShow;
        this.idAnimal = idAnimal;
        this.idShow = idShow;
    }
    /**
     * Gets and sets of the class
     * @return 
     */
    public long getIdAnimalesShow() {
        return idAnimalesShow;
    }

    public void setIdAnimalesShow(long idAnimalesShow) {
        this.idAnimalesShow = idAnimalesShow;
    }

    public AnimalesEntity getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(AnimalesEntity idAnimal) {
        this.idAnimal = idAnimal;
    }

    public ShowEntity getIdShow() {
        return idShow;
    }

    public void setIdShow(ShowEntity idShow) {
        this.idShow = idShow;
    }

    
   
}
