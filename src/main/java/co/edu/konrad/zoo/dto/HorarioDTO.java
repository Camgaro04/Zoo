/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoo.dto;

import co.edu.konrad.zoo.entities.HorarioEntity;
import java.util.Date;

/**
 *
 * @author Andrés Correa
 */
public class HorarioDTO {
    private long idHorario;
    private String horarioNombre;
    private Date FechaInicio;
    private Date FechaFin;

    public HorarioDTO() {
    }
    
    public HorarioDTO(HorarioEntity horarioEntity){
        this.idHorario = horarioEntity.getIdHorario();
        this.horarioNombre = horarioEntity.getHorarioNombre();
        this.FechaInicio = horarioEntity.getFechaInicio();
        this.FechaFin = horarioEntity.getFechaFin();
    
    }
    
    public HorarioEntity toEntity(){
        HorarioEntity horarioEntity = new HorarioEntity();
        horarioEntity.setIdHorario(this.idHorario);
        horarioEntity.setHorarioNombre(this.horarioNombre);
         horarioEntity.setFechaInicio(this.FechaInicio);
          horarioEntity.setFechaFin(this.FechaFin);
        return horarioEntity;
    }

    public long getIdHorario() {
        return idHorario;
    }

    public String getHorarioNombre() {
        return horarioNombre;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setIdHorario(long idHorario) {
        this.idHorario = idHorario;
    }

    public void setHorarioNombre(String horarioNombre) {
        this.horarioNombre = horarioNombre;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }
    

}
