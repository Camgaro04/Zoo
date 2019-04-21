package co.edu.konrad.zoo.resources;

import co.edu.konrad.zoo.dto.LugaresDTO;
import co.edu.konrad.zoo.entities.LugaresEntity;
import co.edu.konrad.zoo.logic.LugarLogic;
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
@Path("/lugares")
public class LugaresResource {

    @EJB
    private LugarLogic LugaresLogic;

    @GET
    public List<LugaresDTO> getLugaresList() {
        List<LugaresEntity> Lugares = LugaresLogic.findAll();
        return LugaresDTO.toLugaresList(Lugares);
    }

    @GET
    @Path("{id: \\d+}")
    public LugaresDTO getLugares(@PathParam("id") int id) {
        LugaresEntity Lugareso = LugaresLogic.findById(id);
        if (Lugareso == null) {
            throw new RuntimeException("El lugares no existe");
        }
        return new LugaresDTO(Lugareso);
    }

    @POST
    public LugaresDTO createLugares(LugaresDTO fdto) {
        return new LugaresDTO(LugaresLogic.insert(fdto.toEntity()));
    }

    @PUT
    @Path("{id: \\d+}")
    public LugaresDTO updateLugares(@PathParam("id") int id, LugaresDTO Lugares) {
        LugaresEntity entity = LugaresLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El lugares no existe");
        }
        return new LugaresDTO(LugaresLogic.actualizarLugares(id, Lugares.toEntity()));
    }

    @DELETE
    @Path("{LugaresId: \\d+}")
    public void deleteLugares(@PathParam("LugaresId") int id) {
        LugaresEntity entity = LugaresLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El lugares no existe");
        }
        LugaresLogic.delete(id);
    }
}
