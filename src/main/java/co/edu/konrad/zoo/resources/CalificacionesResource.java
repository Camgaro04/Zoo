package co.edu.konrad.zoo.resources;

import co.edu.konrad.zoo.dto.CalificacionesDTO;
import co.edu.konrad.zoo.entities.CalificacionEntity;
import co.edu.konrad.zoo.logic.CalificacionLogic;
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
@Path("/calificaciones")
public class CalificacionesResource {
       /**
        * Conecta a logic
        */
    @EJB
    private CalificacionLogic CalificacionesLogic;
    
    /**
     * Obtiene lista de calificaciones
     * @return 
     */
    @GET
    public List<CalificacionesDTO> getCalificacionesList() {
        List<CalificacionEntity> Calificaciones = CalificacionesLogic.findAll();
        return CalificacionesDTO.toCalificacionesList(Calificaciones);
    }
    
    /**
     * Obtiene calificacion por id
     * @param id
     * @return 
     */
    @GET
    @Path("{id: \\d+}")
    public CalificacionesDTO getCalificaciones(@PathParam("id") Long id) {
        CalificacionEntity Calificacioneso = CalificacionesLogic.findById(id);
        if (Calificacioneso == null) {
            throw new RuntimeException("la calificacion no existe");
        }
        return new CalificacionesDTO(Calificacioneso);
    }
    /**
     * CRea
     * @param fdto
     * @return 
     */
    @POST
    public CalificacionesDTO createCalificaciones(CalificacionesDTO fdto) {
        return new CalificacionesDTO(CalificacionesLogic.insert(fdto.toEntity()));
    }
    /**
     * Actualizacion
     * @param id
     * @param Calificaciones
     * @return 
     */
    @PUT
    @Path("{id: \\d+}")
    public CalificacionesDTO updateCalificaciones(@PathParam("id") Long id, CalificacionesDTO Calificaciones) {
        CalificacionEntity entity = CalificacionesLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("La calificacion no existe");
        }
        return new CalificacionesDTO(CalificacionesLogic.actualizarCalificacion(id, Calificaciones.toEntity()));
    }
    
    /**
     * Eliminar
     * @param id 
     */
    @DELETE
    @Path("{CalificacionesId: \\d+}")
    public void deleteCalificaciones(@PathParam("CalificacionesId") int id) {
        CalificacionEntity entity = CalificacionesLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("La calificacion no existe");
        }
        CalificacionesLogic.delete(id);
    }
}
