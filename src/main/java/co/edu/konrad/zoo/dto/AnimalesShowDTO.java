/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoo.dto;

import co.edu.konrad.zoo.entities.ShowEntity;
import co.edu.konrad.zoo.entities.AnimalesShowEntity;
import co.edu.konrad.zoo.entities.AnimalesEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrés Correa
 */
public class AnimalesShowDTO {

    //private PK_AnimalesShow clave;
    private AnimalesEntity idAnimal;
    private ShowEntity idShow;

    public AnimalesShowDTO() {
    }

    public AnimalesShowDTO(AnimalesShowEntity animalesShowEntity) {
        // this.clave = animalesShowEntity.getClave();
        this.idAnimal = animalesShowEntity.getIdAnimal();
        this.idShow = animalesShowEntity.getIdShow();

    }

    public AnimalesShowEntity toEntity() {
        AnimalesShowEntity animalesShowEntity = new AnimalesShowEntity();
        animalesShowEntity.setIdShow(this.idShow);
        animalesShowEntity.setIdAnimal(this.idAnimal);
        //animalesShowEntity.setClave(this.clave);       

        return animalesShowEntity;
    }

    public static List<AnimalesShowDTO> toAnimalesShowList(List<AnimalesShowEntity> animalesShow) {

        List<AnimalesShowDTO> listaAnimalesShow = new ArrayList<>();
        for (AnimalesShowEntity entity : animalesShow) {
            listaAnimalesShow.add(new AnimalesShowDTO(entity));
        }
        return listaAnimalesShow;
    }

    public AnimalesEntity getIdAnimal() {
        return idAnimal;
    }

    public ShowEntity getIdShow() {
        return idShow;
    }

    public void setIdAnimal(AnimalesEntity idAnimal) {
        this.idAnimal = idAnimal;
    }

    public void setIdShow(ShowEntity idShow) {
        this.idShow = idShow;
    }

}
