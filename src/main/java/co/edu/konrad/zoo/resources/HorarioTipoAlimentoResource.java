package co.edu.konrad.zoo.resources;

import co.edu.konrad.zoo.dto.HorarioTipoAlimentoDTO;
import co.edu.konrad.zoo.entities.HorarioTipoAlimentosEntity;
import co.edu.konrad.zoo.logic.HorarioTipoAlimentoLogic;
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
@Path("/horarioTipoAlimento")
public class HorarioTipoAlimentoResource {

    @EJB
    private HorarioTipoAlimentoLogic HorarioTipoAlimentoLogic;

    @GET
    public List<HorarioTipoAlimentoDTO> getHorarioTipoAlimentoList() {
        List<HorarioTipoAlimentosEntity> HorarioTipoAlimento = HorarioTipoAlimentoLogic.findAll();
        return HorarioTipoAlimentoDTO.toHorarioTipoAlimentoList(HorarioTipoAlimento);
    }

    @GET
    @Path("{id: \\d+}")
    public HorarioTipoAlimentoDTO getHorarioTipoAlimento(@PathParam("id") int id) {
        HorarioTipoAlimentosEntity HorarioTipoAlimentoo = HorarioTipoAlimentoLogic.findById(id);
        if (HorarioTipoAlimentoo == null) {
            throw new RuntimeException("El horarioTipoAlimento no existe");
        }
        return new HorarioTipoAlimentoDTO(HorarioTipoAlimentoo);
    }

    @POST
    public HorarioTipoAlimentoDTO createHorarioTipoAlimento(HorarioTipoAlimentoDTO fdto) {
        return new HorarioTipoAlimentoDTO(HorarioTipoAlimentoLogic.insert(fdto.toEntity()));
    }

    @PUT
    @Path("{id: \\d+}")
    public HorarioTipoAlimentoDTO updateHorarioTipoAlimento(@PathParam("id") int id, HorarioTipoAlimentoDTO HorarioTipoAlimento) {
        HorarioTipoAlimentosEntity entity = HorarioTipoAlimentoLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El horarioTipoAlimento no existe");
        }
        return new HorarioTipoAlimentoDTO(HorarioTipoAlimentoLogic.actualizarHorarioTipoAlimentos(id, HorarioTipoAlimento.toEntity()));
    }

    @DELETE
    @Path("{HorarioTipoAlimentoId: \\d+}")
    public void deleteHorarioTipoAlimento(@PathParam("HorarioTipoAlimentoId") int id) {
        HorarioTipoAlimentosEntity entity = HorarioTipoAlimentoLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El horarioTipoAlimento no existe");
        }
        HorarioTipoAlimentoLogic.delete(id);
    }
}
