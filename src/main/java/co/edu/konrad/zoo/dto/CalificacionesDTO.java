package co.edu.konrad.zoo.dto;

import co.edu.konrad.zoo.entities.AnimalesEntity;
import co.edu.konrad.zoo.entities.CalificacionEntity;
import co.edu.konrad.zoo.entities.ShowEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andres Correa
 */
public class CalificacionesDTO {

    private long idCalificacion;
    private ShowEntity idShows;
    private AnimalesEntity idAnimal;
    private int Calificacion;
    private String Observacion;

    public CalificacionesDTO() {
    }

    public CalificacionesDTO(CalificacionEntity calificacionEntity) {
        this.idCalificacion = calificacionEntity.getIdCalificacion();
        this.idShows = calificacionEntity.getIdShow();
        this.idAnimal = calificacionEntity.getIdAnimal();
        this.Calificacion = calificacionEntity.getCalificacion();
        this.Observacion = calificacionEntity.getObservacion();

    }

    public CalificacionEntity toEntity() {
        CalificacionEntity calificacionEntity = new CalificacionEntity();
        calificacionEntity.setIdCalificacion(this.idCalificacion);
        calificacionEntity.setIdShow(this.idShows);
        calificacionEntity.setIdAnimal(this.idAnimal);
        calificacionEntity.setCalificacion(this.Calificacion);
        calificacionEntity.setObservacion(this.Observacion);

        return calificacionEntity;
    }

    public static List<CalificacionesDTO> toCalificacionesList(List<CalificacionEntity> calificaciones) {

        List<CalificacionesDTO> listaSalificaciones = new ArrayList<>();
        for (CalificacionEntity entity : calificaciones) {
            listaSalificaciones.add(new CalificacionesDTO(entity));
        }
        return listaSalificaciones;
    }

    public long getIdCalificacion() {
        return idCalificacion;
    }

    public ShowEntity getIdShows() {
        return idShows;
    }

    public AnimalesEntity getIdAnimal() {
        return idAnimal;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setIdCalificacion(long idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public void setIdShows(ShowEntity idShows) {
        this.idShows = idShows;
    }

    public void setIdAnimal(AnimalesEntity idAnimal) {
        this.idAnimal = idAnimal;
    }

    public void setCalificacion(int Calificacion) {
        this.Calificacion = Calificacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

}
