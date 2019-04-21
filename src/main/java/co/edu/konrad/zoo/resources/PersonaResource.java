package co.edu.konrad.zoo.resources;

import co.edu.konrad.zoo.dto.PersonaDTO;
import co.edu.konrad.zoo.entities.PersonaEntity;
import co.edu.konrad.zoo.logic.PersonaLogic;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Luis
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/persona")
public class PersonaResource {

    @EJB
    private PersonaLogic PersonaLogic;

    @GET
    public List<PersonaDTO> getPersonaList() {
        List<PersonaEntity> Persona = PersonaLogic.findAll();
        return PersonaDTO.toPersonaList(Persona);
    }

    @GET
    @Path("{id: \\d+}")
    public PersonaDTO getPersona(@PathParam("id") int id) {
        PersonaEntity Personao = PersonaLogic.findById(id);
        if (Personao == null) {
            throw new RuntimeException("El persona no existe");
        }
        return new PersonaDTO(Personao);
    }

    @POST
    public PersonaDTO createPersona(PersonaDTO fdto) {
        return new PersonaDTO(PersonaLogic.insert(fdto.toEntity()));
    }

    @PUT
    @Path("{id: \\d+}")
    public PersonaDTO updatePersona(@PathParam("id") int id, PersonaDTO Persona) {
        PersonaEntity entity = PersonaLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El persona no existe");
        }
        return new PersonaDTO(PersonaLogic.actualizarPersona(id, Persona.toEntity()));
    }

    @DELETE
    @Path("{PersonaId: \\d+}")
    public void deletePersona(@PathParam("PersonaId") int id) {
        PersonaEntity entity = PersonaLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El persona no existe");
        }
        PersonaLogic.delete(id);
    }
}
