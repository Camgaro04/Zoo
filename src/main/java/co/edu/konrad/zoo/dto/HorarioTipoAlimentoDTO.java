package co.edu.konrad.zoo.dto;

import co.edu.konrad.zoo.entities.HorarioEntity;
import co.edu.konrad.zoo.entities.HorarioTipoAlimentosEntity;
import co.edu.konrad.zoo.entities.TipoAlimentoEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrés Correa
 */
public class HorarioTipoAlimentoDTO {

    private HorarioEntity idHorario;
    private TipoAlimentoEntity idTipoAlimentos;

    public HorarioTipoAlimentoDTO() {
    }

    public HorarioTipoAlimentoDTO(HorarioTipoAlimentosEntity horarioTipoAlimentosEntity) {

        this.idHorario = horarioTipoAlimentosEntity.getIdHorario();
        this.idTipoAlimentos = horarioTipoAlimentosEntity.getIdTipoAlimentos();

    }

    public HorarioTipoAlimentosEntity toEntity() {
        HorarioTipoAlimentosEntity horarioTipoAlimentosEntity = new HorarioTipoAlimentosEntity();
        horarioTipoAlimentosEntity.setIdHorario(this.idHorario);
        horarioTipoAlimentosEntity.setIdTipoAlimentos(this.idTipoAlimentos);
        return horarioTipoAlimentosEntity;
    }

    public static List<HorarioTipoAlimentoDTO> toHorarioTipoAlimentoList(List<HorarioTipoAlimentosEntity> horarioTipoAlimento) {

        List<HorarioTipoAlimentoDTO> listaHorarioTipoAlimentos = new ArrayList<>();
        for (HorarioTipoAlimentosEntity entity : horarioTipoAlimento) {
            listaHorarioTipoAlimentos.add(new HorarioTipoAlimentoDTO(entity));
        }
        return listaHorarioTipoAlimentos;
    }

    public HorarioEntity getIdHorario() {
        return idHorario;
    }

    public TipoAlimentoEntity getIdTipoAlimentos() {
        return idTipoAlimentos;
    }

    public void setIdHorario(HorarioEntity idHorario) {
        this.idHorario = idHorario;
    }

    public void setIdTipoAlimentos(TipoAlimentoEntity idTipoAlimentos) {
        this.idTipoAlimentos = idTipoAlimentos;
    }

}
