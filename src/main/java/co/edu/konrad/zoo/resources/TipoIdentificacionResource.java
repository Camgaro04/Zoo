package co.edu.konrad.zoo.resources;

import co.edu.konrad.zoo.dto.TipoIdentificacionDTO;
import co.edu.konrad.zoo.entities.TipoIdentificacionEntity;
import co.edu.konrad.zoo.logic.TipoIdentificacionLogic;
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
@Path("/tipoIdentificacion")
public class TipoIdentificacionResource {

    @EJB
    private TipoIdentificacionLogic TipoIdentificacionLogic;

    @GET
    public List<TipoIdentificacionDTO> getTipoIdentificacionList() {
        List<TipoIdentificacionEntity> TipoIdentificacion = TipoIdentificacionLogic.findAll();
        return TipoIdentificacionDTO.toTipoIdentificacionList(TipoIdentificacion);
    }

    @GET
    @Path("{id: \\d+}")
    public TipoIdentificacionDTO getTipoIdentificacion(@PathParam("id") int id) {
        TipoIdentificacionEntity TipoIdentificaciono = TipoIdentificacionLogic.findById(id);
        if (TipoIdentificaciono == null) {
            throw new RuntimeException("El tipoIdentificacion no existe");
        }
        return new TipoIdentificacionDTO(TipoIdentificaciono);
    }

    @POST
    public TipoIdentificacionDTO createTipoIdentificacion(TipoIdentificacionDTO fdto) {
        return new TipoIdentificacionDTO(TipoIdentificacionLogic.insert(fdto.toEntity()));
    }

    @PUT
    @Path("{id: \\d+}")
    public TipoIdentificacionDTO updateTipoIdentificacion(@PathParam("id") int id, TipoIdentificacionDTO TipoIdentificacion) {
        TipoIdentificacionEntity entity = TipoIdentificacionLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El tipoIdentificacion no existe");
        }
        return new TipoIdentificacionDTO(TipoIdentificacionLogic.actualizarTipoIdentificacion(id, TipoIdentificacion.toEntity()));
    }

    @DELETE
    @Path("{TipoIdentificacionId: \\d+}")
    public void deleteTipoIdentificacion(@PathParam("TipoIdentificacionId") int id) {
        TipoIdentificacionEntity entity = TipoIdentificacionLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El tipoIdentificacion no existe");
        }
        TipoIdentificacionLogic.delete(id);
    }
}
