package co.edu.konrad.zoo.dto;

import co.edu.konrad.zoo.entities.TipoAlimentoEntity;
import co.edu.konrad.zoo.entities.TipoAnimalEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrés Correa
 */
public class TipoAlimentoDTO {

    private long idTipoAlimento;
    private TipoAnimalEntity idTipoAnimal;
    private String nombreAlimento;

    public TipoAlimentoDTO() {
    }

    public TipoAlimentoDTO(TipoAlimentoEntity tipoAlimentoEntity) {
        this.idTipoAlimento = tipoAlimentoEntity.getIdTipoAlimento();
        this.idTipoAnimal = tipoAlimentoEntity.getIdTipoAnimal();
        this.nombreAlimento = tipoAlimentoEntity.getNombreAlimento();

    }

    public TipoAlimentoEntity toEntity() {
        TipoAlimentoEntity tipoAlimentoEntity = new TipoAlimentoEntity();
        tipoAlimentoEntity.setIdTipoAlimento(this.idTipoAlimento);
        tipoAlimentoEntity.setIdTipoAnimal(this.idTipoAnimal);
        tipoAlimentoEntity.setNombreAlimento(this.nombreAlimento);

        return tipoAlimentoEntity;
    }

    public static List<TipoAlimentoDTO> toTipoAlimentoList(List<TipoAlimentoEntity> tipoAlimento) {

        List<TipoAlimentoDTO> listaTipoAlimentos = new ArrayList<>();
        for (TipoAlimentoEntity entity : tipoAlimento) {
            listaTipoAlimentos.add(new TipoAlimentoDTO(entity));
        }
        return listaTipoAlimentos;
    }

    public long getIdTipoAlimento() {
        return idTipoAlimento;
    }

    public TipoAnimalEntity getIdTipoAnimal() {
        return idTipoAnimal;
    }

    public String getNombreAlimento() {
        return nombreAlimento;
    }

    public void setIdTipoAlimento(long idTipoAlimento) {
        this.idTipoAlimento = idTipoAlimento;
    }

    public void setIdTipoAnimal(TipoAnimalEntity idTipoAnimal) {
        this.idTipoAnimal = idTipoAnimal;
    }

    public void setNombreAlimento(String nombreAlimento) {
        this.nombreAlimento = nombreAlimento;
    }

}
