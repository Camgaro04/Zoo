package co.edu.konrad.zoo.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

/**
 *
 * @author Luis
 */
public class ShowEntity {
    /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idShow;
    
    /**
     * 
     */
    @Column(name = "nombre")
    private String nombre;
    
    /**
     * 
     */
    @JoinColumn(name = "horario")
    @ManyToMany
    private HorarioEntity horario;
    
    /**
     * 
     */
    @JoinColumn(name = "persona_encargada")
    @ManyToMany
    private PersonaEntity personaEncargada;
    
    /**
     * 
     */
    @JoinColumn(name = "lugar")
    @ManyToMany
    private LugaresEntity lugar;

    public ShowEntity() {
    }

    public ShowEntity(long idShow, String nombre, HorarioEntity horario, PersonaEntity personaEncargada, LugaresEntity lugar) {
        this.idShow = idShow;
        this.nombre = nombre;
        this.horario = horario;
        this.personaEncargada = personaEncargada;
        this.lugar = lugar;
    }

    public long getIdShow() {
        return idShow;
    }

    public void setIdShow(long idShow) {
        this.idShow = idShow;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HorarioEntity getHorario() {
        return horario;
    }

    public void setHorario(HorarioEntity horario) {
        this.horario = horario;
    }

    public PersonaEntity getPersonaEncargada() {
        return personaEncargada;
    }

    public void setPersonaEncargada(PersonaEntity personaEncargada) {
        this.personaEncargada = personaEncargada;
    }

    public LugaresEntity getLugar() {
        return lugar;
    }

    public void setLugar(LugaresEntity lugar) {
        this.lugar = lugar;
    }
    
    
}
