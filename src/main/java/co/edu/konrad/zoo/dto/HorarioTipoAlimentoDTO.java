/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoo.dto;

import co.edu.konrad.zoo.entities.HorarioEntity;
import co.edu.konrad.zoo.entities.HorarioTipoAlimentosEntity;
import co.edu.konrad.zoo.entities.TipoAlimentoEntity;

/**
 *
 * @author Andrés Correa
 */
public class HorarioTipoAlimentoDTO {
     
    private HorarioEntity idHorario;   
    private TipoAlimentoEntity idTipoAlimentos;
    
    

    public HorarioTipoAlimentoDTO() {
    }
    
     public HorarioTipoAlimentoDTO(HorarioTipoAlimentosEntity horarioTipoAlimentosEntity){
       
        this.idHorario = horarioTipoAlimentosEntity.getIdHorario();
        this.idTipoAlimentos = horarioTipoAlimentosEntity.getIdTipoAlimentos();
        
        
    }
     
     public HorarioTipoAlimentosEntity toEntity(){
        HorarioTipoAlimentosEntity horarioTipoAlimentosEntity = new HorarioTipoAlimentosEntity();
        horarioTipoAlimentosEntity.setIdHorario(this.idHorario);
        horarioTipoAlimentosEntity.setIdTipoAlimentos(this.idTipoAlimentos);      
        return horarioTipoAlimentosEntity;
    }

    public HorarioEntity getIdHorario() {
        return idHorario;
    }

    public TipoAlimentoEntity getIdTipoAlimentos() {
        return idTipoAlimentos;
    }

    public void setIdHorario(HorarioEntity idHorario) {
        this.idHorario = idHorario;
    }

    public void setIdTipoAlimentos(TipoAlimentoEntity idTipoAlimentos) {
        this.idTipoAlimentos = idTipoAlimentos;
    }
     
     
}
