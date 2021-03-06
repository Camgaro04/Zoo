package co.edu.konrad.zoo.dto;

/**
 *
 * @author Andres Correa
 */
import co.edu.konrad.zoo.entities.ShowEntity;
import co.edu.konrad.zoo.entities.PersonaEntity;
import co.edu.konrad.zoo.entities.HorarioEntity;
import co.edu.konrad.zoo.entities.LugaresEntity;
import java.util.ArrayList;
import java.util.List;

public class ShowDTO {

    private long idShow;
    private String nombreShow;
    private HorarioEntity idHorario;
    private PersonaEntity idPersonaEncargada;
    private LugaresEntity idLugaresEntity;

    /**
     * Constructor
     */
    public ShowDTO() {
    }

    /**
     *
     * @param showEntity
     */
    public ShowDTO(ShowEntity showEntity) {
        this.idShow = showEntity.getIdShow();
        this.nombreShow = showEntity.getNombre();
        this.idHorario = showEntity.getHorario();
        this.idPersonaEncargada = showEntity.getPersonaEncargada();
        this.idLugaresEntity = showEntity.getLugar();

    }

    public ShowEntity toEntity() {
        ShowEntity showEntity = new ShowEntity();
        showEntity.setIdShow(this.idShow);
        showEntity.setNombre(this.nombreShow);
        showEntity.setHorario(this.idHorario);
        showEntity.setPersonaEncargada(this.idPersonaEncargada);
        showEntity.setLugar(this.idLugaresEntity);

        return showEntity;
    }

    public static List<ShowDTO> toShowList(List<ShowEntity> show) {

        List<ShowDTO> listaShows = new ArrayList<>();
        for (ShowEntity entity : show) {
            listaShows.add(new ShowDTO(entity));
        }
        return listaShows;
    }

    /**
     *
     * @return
     */
    public long getIdShow() {
        return idShow;
    }

    public String getNombreShow() {
        return nombreShow;
    }

    public HorarioEntity getIdHorario() {
        return idHorario;
    }

    public PersonaEntity getIdPersonaEncargada() {
        return idPersonaEncargada;
    }

    public LugaresEntity getIdLugaresEntity() {
        return idLugaresEntity;
    }

    public void setIdShow(long idShow) {
        this.idShow = idShow;
    }

    public void setNombreShow(String nombreShow) {
        this.nombreShow = nombreShow;
    }

    public void setIdHorario(HorarioEntity idHorario) {
        this.idHorario = idHorario;
    }

    public void setIdPersonaEncargada(PersonaEntity idPersonaEncargada) {
        this.idPersonaEncargada = idPersonaEncargada;
    }

    public void setIdLugaresEntity(LugaresEntity idLugaresEntity) {
        this.idLugaresEntity = idLugaresEntity;
    }

}
