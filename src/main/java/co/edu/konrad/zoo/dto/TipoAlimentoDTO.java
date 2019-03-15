/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoo.dto;

import co.edu.konrad.zoo.entities.TipoAlimentoEntity;
import co.edu.konrad.zoo.entities.TipoAnimalEntity;

/**
 *
 * @author Andrés Correa
 */
public class TipoAlimentoDTO {
    private long idTipoAlimento;
    private TipoAnimalEntity idTipoAnimal;   
    private String nombreAlimento;

    public TipoAlimentoDTO() {
    }
    
     public TipoAlimentoDTO(TipoAlimentoEntity tipoAlimentoEntity){
        this.idTipoAlimento = tipoAlimentoEntity.getIdTipoAlimento();
        this.idTipoAnimal = tipoAlimentoEntity.getIdTipoAnimal();
        this.nombreAlimento = tipoAlimentoEntity.getNombreAlimento();
       
        
    }

    public TipoAlimentoEntity toEntity(){
        TipoAlimentoEntity tipoAlimentoEntity = new TipoAlimentoEntity();
        tipoAlimentoEntity.setIdTipoAlimento(this.idTipoAlimento);
        tipoAlimentoEntity.setIdTipoAnimal(this.idTipoAnimal);
        tipoAlimentoEntity.setNombreAlimento(this.nombreAlimento);
         
        
        return tipoAlimentoEntity;
    }

    public long getIdTipoAlimento() {
        return idTipoAlimento;
    }

    public TipoAnimalEntity getIdTipoAnimal() {
        return idTipoAnimal;
    }

    public String getNombreAlimento() {
        return nombreAlimento;
    }

    public void setIdTipoAlimento(long idTipoAlimento) {
        this.idTipoAlimento = idTipoAlimento;
    }

    public void setIdTipoAnimal(TipoAnimalEntity idTipoAnimal) {
        this.idTipoAnimal = idTipoAnimal;
    }

    public void setNombreAlimento(String nombreAlimento) {
        this.nombreAlimento = nombreAlimento;
    }
    

}
