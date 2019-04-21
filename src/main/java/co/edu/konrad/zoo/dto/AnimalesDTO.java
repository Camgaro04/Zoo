/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoo.dto;

import co.edu.konrad.zoo.entities.AnimalesEntity;
import co.edu.konrad.zoo.entities.CuidadorEntity;
import co.edu.konrad.zoo.entities.EspeciesEntity;
import co.edu.konrad.zoo.entities.TipoAnimalEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrés Correa
 */
public class AnimalesDTO {

    private long idAnimal;
    private String nombre;
    private String nombreCientifico;
    private String descripcion;
    private EspeciesEntity especie;
    private TipoAnimalEntity tipoAnimal;
    private CuidadorEntity cuidador;

    public AnimalesDTO() {
    }

    public AnimalesDTO(AnimalesEntity animalesEntity) {
        this.idAnimal = animalesEntity.getIdAnimal();
        this.nombre = animalesEntity.getNombre();
        this.nombreCientifico = animalesEntity.getNombreCientifico();
        this.descripcion = animalesEntity.getDescripcion();
        this.especie = animalesEntity.getEspecie();
        this.tipoAnimal = animalesEntity.getTipoAnimal();
        this.cuidador = animalesEntity.getCuidador();
    }

    public AnimalesEntity toEntity() {
        AnimalesEntity animalesEntity = new AnimalesEntity();
        animalesEntity.setIdAnimal(this.idAnimal);
        animalesEntity.setNombre(this.nombre);
        animalesEntity.setNombreCientifico(this.nombreCientifico);
        animalesEntity.setDescripcion(this.descripcion);
        animalesEntity.setEspecie(this.especie);
        animalesEntity.setTipoAnimal(this.tipoAnimal);
        animalesEntity.setCuidador(this.cuidador);
        return animalesEntity;
    }

    public static List<AnimalesDTO> toAnimalesList(List<AnimalesEntity> animales) {

        List<AnimalesDTO> listaAnimaless = new ArrayList<>();
        for (AnimalesEntity entity : animales) {
            listaAnimaless.add(new AnimalesDTO(entity));
        }
        return listaAnimaless;
    }

    public long getIdAnimal() {
        return idAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public EspeciesEntity getEspecie() {
        return especie;
    }

    public TipoAnimalEntity getTipoAnimal() {
        return tipoAnimal;
    }

    public CuidadorEntity getCuidador() {
        return cuidador;
    }

    public void setIdAnimal(long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEspecie(EspeciesEntity especie) {
        this.especie = especie;
    }

    public void setTipoAnimal(TipoAnimalEntity tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public void setCuidador(CuidadorEntity cuidador) {
        this.cuidador = cuidador;
    }

}
