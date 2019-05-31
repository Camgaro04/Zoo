package co.edu.konrad.zoo.dto;

import co.edu.konrad.zoo.entities.TipoIdentificacionEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author windows
 */
public class TipoIdentificacionDTO {

    private int idTipoIdentificacion;
    private String nombreTipoIdentificacion;
    
    /**
     * Constructo vacio
     */
    public TipoIdentificacionDTO() {

    }
    /**
     * constructor
     * @param identificacionEntity 
     */
    public TipoIdentificacionDTO(TipoIdentificacionEntity identificacionEntity) {
        this.idTipoIdentificacion = identificacionEntity.getIdTipoIdentificacion();
        this.nombreTipoIdentificacion = identificacionEntity.getNombreIdentificacion();
    }
    /**
     * 
     * @return 
     */
    public TipoIdentificacionEntity toEntity() {
        TipoIdentificacionEntity identificacionEntity = new TipoIdentificacionEntity();
        identificacionEntity.setIdTipoIdentificacion(this.idTipoIdentificacion);
        identificacionEntity.setNombreIdentificacion(this.nombreTipoIdentificacion);
        return identificacionEntity;
    }
       /**
        * Listado de tipo de identificacion
        * @param tipoIdentificacion
        * @return 
        */
     public static List<TipoIdentificacionDTO> toTipoIdentificacionList(List<TipoIdentificacionEntity> tipoIdentificacion) {

        List<TipoIdentificacionDTO> listaTipoIdentificacions = new ArrayList<>();
        for (TipoIdentificacionEntity entity : tipoIdentificacion) {
            listaTipoIdentificacions.add(new TipoIdentificacionDTO(entity));
        }
        return listaTipoIdentificacions;
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
