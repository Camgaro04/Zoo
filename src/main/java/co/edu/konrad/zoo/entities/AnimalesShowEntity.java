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
