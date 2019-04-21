package co.edu.konrad.zoo.resources;

import co.edu.konrad.zoo.dto.TipoAlimentoDTO;
import co.edu.konrad.zoo.entities.TipoAlimentoEntity;
import co.edu.konrad.zoo.logic.TipoAlimentoLogic;
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
@Path("/tipoAlimento")
public class TipoAlimentoResource {

    @EJB
    private TipoAlimentoLogic TipoAlimentoLogic;

    @GET
    public List<TipoAlimentoDTO> getTipoAlimentoList() {
        List<TipoAlimentoEntity> TipoAlimento = TipoAlimentoLogic.findAll();
        return TipoAlimentoDTO.toTipoAlimentoList(TipoAlimento);
    }

    @GET
    @Path("{id: \\d+}")
    public TipoAlimentoDTO getTipoAlimento(@PathParam("id") int id) {
        TipoAlimentoEntity TipoAlimentoo = TipoAlimentoLogic.findById(id);
        if (TipoAlimentoo == null) {
            throw new RuntimeException("El tipoAlimento no existe");
        }
        return new TipoAlimentoDTO(TipoAlimentoo);
    }

    @POST
    public TipoAlimentoDTO createTipoAlimento(TipoAlimentoDTO fdto) {
        return new TipoAlimentoDTO(TipoAlimentoLogic.insert(fdto.toEntity()));
    }

    @PUT
    @Path("{id: \\d+}")
    public TipoAlimentoDTO updateTipoAlimento(@PathParam("id") int id, TipoAlimentoDTO TipoAlimento) {
        TipoAlimentoEntity entity = TipoAlimentoLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El tipoAlimento no existe");
        }
        return new TipoAlimentoDTO(TipoAlimentoLogic.actualizarTipoAlimento(id, TipoAlimento.toEntity()));
    }

    @DELETE
    @Path("{TipoAlimentoId: \\d+}")
    public void deleteTipoAlimento(@PathParam("TipoAlimentoId") int id) {
        TipoAlimentoEntity entity = TipoAlimentoLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El tipoAlimento no existe");
        }
        TipoAlimentoLogic.delete(id);
    }
}
