package co.edu.konrad.zoo.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Luis
 */
public class AnimalesShowEntity {
    
    @EmbeddedId
    private PK_AnimalesShow clave;

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

    public AnimalesShowEntity() {
    }

    public AnimalesShowEntity(PK_AnimalesShow clave, AnimalesEntity idAnimal, ShowEntity idShow) {
        this.clave = clave;
        this.idAnimal = idAnimal;
        this.idShow = idShow;
    }

    public PK_AnimalesShow getClave() {
        return clave;
    }

    public AnimalesEntity getIdAnimal() {
        return idAnimal;
    }

    public ShowEntity getIdShow() {
        return idShow;
    }

    public void setClave(PK_AnimalesShow clave) {
        this.clave = clave;
    }

    public void setIdAnimal(AnimalesEntity idAnimal) {
        this.idAnimal = idAnimal;
    }

    public void setIdShow(ShowEntity idShow) {
        this.idShow = idShow;
    }
    
    
    
    /**
     * 
     */
     public class PK_AnimalesShow {

        @Column
        private String idAnimal;
        
        @Column
        private String idShow;
    }
}
