/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoo.dto;

import co.edu.konrad.zoo.entities.CuidadorEntity;
import co.edu.konrad.zoo.entities.PersonaEntity;

/**
 *
 * @author windows
 */
public class CuidadorDTO {
    
    
    private int idCuidador;
    private PersonaEntity idPersona;
    
    public CuidadorDTO(){
    
    }
    
    public CuidadorDTO(CuidadorEntity cuidador){
        this.idCuidador = cuidador.getIdCuidador();
        this.idPersona = cuidador.getIdPersona();
    
    }
    
    public CuidadorEntity toEntity(){
        CuidadorEntity cuidadorEntity = new CuidadorEntity();
        cuidadorEntity.setIdCuidador(this.idCuidador);
        cuidadorEntity.setIdPersona(this.idPersona);
        return cuidadorEntity;
    }

    /**
     * @return the idCuidador
     */
    public int getIdCuidador() {
        return idCuidador;
    }

    /**
     * @param idCuidador the idCuidador to set
     */
    public void setIdCuidador(int idCuidador) {
        this.idCuidador = idCuidador;
    }

    /**
     * @return the idPersona
     */
    public PersonaEntity getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(PersonaEntity idPersona) {
        this.idPersona = idPersona;
    }
}
