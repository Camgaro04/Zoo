/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoo.dto;
import co.edu.konrad.zoo.entities.EspeciesEntity;
/**
 *
 * @author Andres Hernandez
 */
public class EspeciesDTO {
 
    private long idEspecie;
    private String nombreEspecie;
    
     /**
     * @Constructor Vacio
     */
    public EspeciesDTO() {
    }
    
    
    /**
     * @param especie
     * @Inicializa la clase apartir de la entidad
     */
    public EspeciesDTO(EspeciesEntity especie) {
        this.idEspecie = especie.getIdEspecie();
        this.nombreEspecie = especie.getNombreEspecie();
    }
    
    /**
     * @return Objeto EspeciesEntity
     */
    public EspeciesEntity ToEntity () {
        EspeciesEntity especie = new  EspeciesEntity();
        especie.setIdEspecie(this.getIdEspecie());
        especie.setNombreEspecie(this.getNombreEspecie());
        return especie;     
    }

    /**
     * @return the idEspecie
     */
    public long getIdEspecie() {
        return idEspecie;
    }

    /**
     * @param idEspecie the idEspecie to set
     */
    public void setIdEspecie(long idEspecie) {
        this.idEspecie = idEspecie;
    }

    /**
     * @return the nombreEspecie
     */
    public String getNombreEspecie() {
        return nombreEspecie;
    }

    /**
     * @param nombreEspecie the nombreEspecie to set
     */
    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }
}
