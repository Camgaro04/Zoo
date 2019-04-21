package co.edu.konrad.zoo.resources;

import co.edu.konrad.zoo.dto.ShowDTO;
import co.edu.konrad.zoo.entities.ShowEntity;
import co.edu.konrad.zoo.logic.ShowLogic;
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
@Path("/show")
public class ShowResource {

    @EJB
    private ShowLogic ShowLogic;

    @GET
    public List<ShowDTO> getShowList() {
        List<ShowEntity> Show = ShowLogic.findAll();
        return ShowDTO.toShowList(Show);
    }

    @GET
    @Path("{id: \\d+}")
    public ShowDTO getShow(@PathParam("id") int id) {
        ShowEntity Showo = ShowLogic.findById(id);
        if (Showo == null) {
            throw new RuntimeException("El show no existe");
        }
        return new ShowDTO(Showo);
    }

    @POST
    public ShowDTO createShow(ShowDTO fdto) {
        return new ShowDTO(ShowLogic.insert(fdto.toEntity()));
    }

    @PUT
    @Path("{id: \\d+}")
    public ShowDTO updateShow(@PathParam("id") int id, ShowDTO Show) {
        ShowEntity entity = ShowLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El show no existe");
        }
        return new ShowDTO(ShowLogic.actualizarShow(id, Show.toEntity()));
    }

    @DELETE
    @Path("{ShowId: \\d+}")
    public void deleteShow(@PathParam("ShowId") int id) {
        ShowEntity entity = ShowLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El show no existe");
        }
        ShowLogic.delete(id);
    }
}
