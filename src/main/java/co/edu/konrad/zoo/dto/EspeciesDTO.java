package co.edu.konrad.zoo.dto;

import co.edu.konrad.zoo.entities.EspeciesEntity;
import java.util.ArrayList;
import java.util.List;

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
    public EspeciesEntity toEntity() {
        EspeciesEntity especie = new EspeciesEntity();
        especie.setIdEspecie(this.getIdEspecie());
        especie.setNombreEspecie(this.getNombreEspecie());
        return especie;
    }

    public static List<EspeciesDTO> toEspeciesList(List<EspeciesEntity> especies) {

        List<EspeciesDTO> listaEspeciess = new ArrayList<>();
        for (EspeciesEntity entity : especies) {
            listaEspeciess.add(new EspeciesDTO(entity));
        }
        return listaEspeciess;
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
