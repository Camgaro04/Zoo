package co.edu.konrad.zoo.dto;

import co.edu.konrad.zoo.entities.PersonaEntity;
import co.edu.konrad.zoo.entities.TipoIdentificacionEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author windows
 */
public class PersonaDTO {

    private int idPersona;
    private String nombreCompleto;
    private String numeroIdentificacion;
    private Date fechaNacimiento;
    private String numeroCelular;
    private TipoIdentificacionEntity idTipoIdentificacion;

    public PersonaDTO() {

    }

    public PersonaDTO(PersonaEntity personaEntity) {
        this.idPersona = personaEntity.getIdPersona();
        this.nombreCompleto = personaEntity.getNombreCompleto();
        this.numeroIdentificacion = personaEntity.getNumeroIdentificacion();
        this.fechaNacimiento = personaEntity.getFechaNacimiento();
        this.numeroCelular = personaEntity.getNumeroCelular();
        this.idTipoIdentificacion = personaEntity.getIdTipoIdentificacion();
    }

    public PersonaEntity toEntity() {
        PersonaEntity personaEntity = new PersonaEntity();
        personaEntity.setIdPersona(this.idPersona);
        personaEntity.setFechaNacimiento(this.fechaNacimiento);
        personaEntity.setNombreCompleto(this.nombreCompleto);
        personaEntity.setNumeroCelular(this.numeroCelular);
        personaEntity.setNumeroIdentificacion(this.numeroIdentificacion);
        personaEntity.setIdTipoIdentificacion(this.idTipoIdentificacion);

        return personaEntity;
    }

    public static List<PersonaDTO> toPersonaList(List<PersonaEntity> persona) {

        List<PersonaDTO> listaPersonas = new ArrayList<>();
        for (PersonaEntity entity : persona) {
            listaPersonas.add(new PersonaDTO(entity));
        }
        return listaPersonas;
    }

    /**
     * @return the idPersona
     */
    public int getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * @return the nombreCompleto
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * @param nombreCompleto the nombreCompleto to set
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * @return the numeroIdentificacion
     */
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    /**
     * @param numeroIdentificacion the numeroIdentificacion to set
     */
    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the numeroCelular
     */
    public String getNumeroCelular() {
        return numeroCelular;
    }

    /**
     * @param numeroCelular the numeroCelular to set
     */
    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    /**
     * @return the idTipoIdentificacion
     */
    public TipoIdentificacionEntity getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    /**
     * @param idTipoIdentificacion the idTipoIdentificacion to set
     */
    public void setIdTipoIdentificacion(TipoIdentificacionEntity idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }
}
