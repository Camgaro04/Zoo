/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoo.dto;

import co.edu.konrad.zoo.entities.TipoIdentificacionEntity;

/**
 *
 * @author windows
 */
public class TipoIdentificacionDTO {
    
    private int idTipoIdentificacion;
    private String nombreTipoIdentificacion;
    
    public TipoIdentificacionDTO(){
    
    }
    
    public TipoIdentificacionDTO(TipoIdentificacionEntity identificacionEntity ){
        this.idTipoIdentificacion = identificacionEntity.getIdTipoIdentificacion();
        this.nombreTipoIdentificacion = identificacionEntity.getNombreIdentificacion();
    }

    
    public TipoIdentificacionEntity toEntity(){
        TipoIdentificacionEntity identificacionEntity = new TipoIdentificacionEntity();
        identificacionEntity.setIdTipoIdentificacion(this.idTipoIdentificacion);
        identificacionEntity.setNombreIdentificacion(this.nombreTipoIdentificacion);
        return identificacionEntity;
    }
    /**
     * @return the idTipoIdentificacion
     */
    public int getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    /**
     * @param idTipoIdentificacion the idTipoIdentificacion to set
     */
    public void setIdTipoIdentificacion(int idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    /**
     * @return the nombreTipoIdentificacion
     */
    public String getNombreTipoIdentificacion() {
        return nombreTipoIdentificacion;
    }

    /**
     * @param nombreTipoIdentificacion the nombreTipoIdentificacion to set
     */
    public void setNombreTipoIdentificacion(String nombreTipoIdentificacion) {
        this.nombreTipoIdentificacion = nombreTipoIdentificacion;
    }
    
    
}
