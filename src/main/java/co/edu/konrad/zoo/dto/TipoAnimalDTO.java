package co.edu.konrad.zoo.dto;

import co.edu.konrad.zoo.entities.TipoAnimalEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andres Hernandez
 */
public class TipoAnimalDTO {

    private long idTipoAnimal;
    private String nombreTipoAnimal;

    /**
     * @Constructor Vacio
     */
    public TipoAnimalDTO() {
    }

    /**
     * @Inicializa la clase apartir de la entidad
     */
    public TipoAnimalDTO(TipoAnimalEntity TipoA) {
        this.idTipoAnimal = TipoA.getIdTipoAnimal();
        this.nombreTipoAnimal = TipoA.getNombreTipoAnimal();
    }

    /**
     * @return Objeto TipoAnimalEntity
     */
    public TipoAnimalEntity toEntity() {
        TipoAnimalEntity TipoA = new TipoAnimalEntity();
        TipoA.setIdTipoAnimal(this.getIdTipoAnimal());
        TipoA.setNombreTipoAnimal(this.getNombreTipoAnimal());
        return TipoA;
    }

    public static List<TipoAnimalDTO> toAnimalesList(List<TipoAnimalEntity> tipoAnimal) {

        List<TipoAnimalDTO> listaTipoAnimal = new ArrayList<>();
        for (TipoAnimalEntity entity : tipoAnimal) {
            listaTipoAnimal.add(new TipoAnimalDTO(entity));
        }
        return listaTipoAnimal;
    }

    /**
     * @return the getIdTipoAnimal
     */
    public long getIdTipoAnimal() {
        return idTipoAnimal;
    }

    /**
     * @param idTipoAnimal the idTipoAnimal to set
     */
    public void setIdTipoAnimal(long idTipoAnimal) {
        this.idTipoAnimal = idTipoAnimal;
    }

    /**
     * @return the nombreTipoAnimal
     */
    public String getNombreTipoAnimal() {
        return nombreTipoAnimal;
    }

    /**
     * @param nombreTipoAnimal the nombreTipoAnimal to set
     */
    public void setNombreTipoAnimal(String nombreTipoAnimal) {
        this.nombreTipoAnimal = nombreTipoAnimal;
    }

}
