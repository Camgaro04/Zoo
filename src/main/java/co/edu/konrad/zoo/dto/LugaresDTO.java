package co.edu.konrad.zoo.dto;

import co.edu.konrad.zoo.entities.LugaresEntity;

/**
 *
 * @author Andres Hernandez
 */
public class LugaresDTO {
    
    private long idLugar;
    private String nombreLugar;
    
    
    /**
     * @Constructor Vacio
     */
    public LugaresDTO() {
    }
    
    
    /**
     * @Inicializa la clase apartir de la entidad
     */
    public LugaresDTO(LugaresEntity Lugar) {
        this.idLugar = Lugar.getIdLugar();
        this.nombreLugar = Lugar.getNombreLugar();
    }
    
    /**
     * @return Objeto LugaresEntity
     */
    public LugaresEntity ToEntity () {
        LugaresEntity Lugar = new  LugaresEntity();
        Lugar.setIdLugar(this.getIdLugar());
        Lugar.setNombreLugar(this.getNombreLugar());
        return Lugar;     
    }

    /**
     * @return the idLugar
     */
    public long getIdLugar() {
        return idLugar;
    }

    /**
     * @param idLugar the idLugar to set
     */
    public void setIdLugar(long idLugar) {
        this.idLugar = idLugar;
    }

    /**
     * @return the nombreLugar
     */
    public String getNombreLugar() {
        return nombreLugar;
    }

    /**
     * @param nombreLugar the nombreLugar to set
     */
    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }
    
    
    
}
