package co.edu.konrad.zoo.resources;

import co.edu.konrad.zoo.dto.TipoAnimalDTO;
import co.edu.konrad.zoo.entities.TipoAnimalEntity;
import co.edu.konrad.zoo.logic.TipoAnimalLogic;
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
@Path("/tipoAnimal")
public class TipoAnimalResource {

    @EJB
    private TipoAnimalLogic TipoAnimalLogic;

    @GET
    public List<TipoAnimalDTO> getTipoAnimalList() {
        List<TipoAnimalEntity> TipoAnimal = TipoAnimalLogic.findAll();
        return TipoAnimalDTO.toAnimalesList(TipoAnimal);
    }

    @GET
    @Path("{id: \\d+}")
    public TipoAnimalDTO getTipoAnimal(@PathParam("id") int id) {
        TipoAnimalEntity TipoAnimalo = TipoAnimalLogic.findById(id);
        if (TipoAnimalo == null) {
            throw new RuntimeException("El tipoAnimal no existe");
        }
        return new TipoAnimalDTO(TipoAnimalo);
    }

    @POST
    public TipoAnimalDTO createTipoAnimal(TipoAnimalDTO fdto) {
        return new TipoAnimalDTO(TipoAnimalLogic.insert(fdto.toEntity()));
    }

    @PUT
    @Path("{id: \\d+}")
    public TipoAnimalDTO updateTipoAnimal(@PathParam("id") int id, TipoAnimalDTO TipoAnimal) {
        TipoAnimalEntity entity = TipoAnimalLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El tipoAnimal no existe");
        }
        return new TipoAnimalDTO(TipoAnimalLogic.actualizarTipoAnimal(id, TipoAnimal.toEntity()));
    }

    @DELETE
    @Path("{TipoAnimalId: \\d+}")
    public void deleteTipoAnimal(@PathParam("TipoAnimalId") int id) {
        TipoAnimalEntity entity = TipoAnimalLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El tipoAnimal no existe");
        }
        TipoAnimalLogic.delete(id);
    }
}
