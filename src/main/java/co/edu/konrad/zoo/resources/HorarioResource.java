package co.edu.konrad.zoo.resources;

import co.edu.konrad.zoo.dto.HorarioDTO;
import co.edu.konrad.zoo.entities.HorarioEntity;
import co.edu.konrad.zoo.logic.HorarioLogic;
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
@Path("/horario")
public class HorarioResource {
    /**
     * Conexion a logic
     */
    @EJB
    private HorarioLogic HorarioLogic;
    /**
     * Obtiene listado de horarios
     * @return 
     */
    @GET
    public List<HorarioDTO> getHorarioList() {
        List<HorarioEntity> Horario = HorarioLogic.findAll();
        return HorarioDTO.toHorarioList(Horario);
    }
    /**
     * Obtiene horario por id
     * @param id
     * @return 
     */
    @GET
    @Path("{id: \\d+}")
    public HorarioDTO getHorario(@PathParam("id") int id) {
        HorarioEntity Horarioo = HorarioLogic.findById(id);
        if (Horarioo == null) {
            throw new RuntimeException("El horario no existe");
        }
        return new HorarioDTO(Horarioo);
    }
    /**
     * Crear horario
     * @param fdto
     * @return 
     */
    @POST
    public HorarioDTO createHorario(HorarioDTO fdto) {
        return new HorarioDTO(HorarioLogic.insert(fdto.toEntity()));
    }
    /**
     * Actualiza horario
     * @param id
     * @param Horario
     * @return 
     */
    @PUT
    @Path("{id: \\d+}")
    public HorarioDTO updateHorario(@PathParam("id") int id, HorarioDTO Horario) {
        HorarioEntity entity = HorarioLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El horario no existe");
        }
        return new HorarioDTO(HorarioLogic.actualizarHorario(id, Horario.toEntity()));
    }
    /**
     * Elimina horario
     * @param id 
     */
    @DELETE
    @Path("{HorarioId: \\d+}")
    public void deleteHorario(@PathParam("HorarioId") int id) {
        HorarioEntity entity = HorarioLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El horario no existe");
        }
        HorarioLogic.delete(id);
    }
}
