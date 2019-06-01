package co.edu.konrad.zoo.resources;

import co.edu.konrad.zoo.dto.AnimalesShowDTO;
import co.edu.konrad.zoo.entities.AnimalesShowEntity;
import co.edu.konrad.zoo.logic.AnimalesShowLogic;
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
@Path("/animalesShow")
public class AnimalesShowResource {
/**
 * Conexion a logic
 */
    @EJB
    private AnimalesShowLogic AnimalesShowLogic;
    
    /**
     * Obtiene todos los animales consume el servicio
     * @return 
     */
    @GET
    public List<AnimalesShowDTO> getAnimalesShowList() {
        List<AnimalesShowEntity> AnimalesShow = AnimalesShowLogic.findAll();
        return AnimalesShowDTO.toAnimalesShowList(AnimalesShow);
    }
    /**
     * obtiene el animal por id consumiendo 
     * @param id
     * @return 
     */
    @GET
    @Path("{id: \\d+}")
    public AnimalesShowDTO getAnimalesShow(@PathParam("id") Long id) {
        AnimalesShowEntity AnimalesShowo = AnimalesShowLogic.findById(id);
        if (AnimalesShowo == null) {
            throw new RuntimeException("El Show de animales solicitado no existe");
        }
        return new AnimalesShowDTO(AnimalesShowo);
    }
    /**
     * Crea
     * @param fdto
     * @return 
     */
    @POST
    public AnimalesShowDTO createAnimalesShow(AnimalesShowDTO fdto) {
        return new AnimalesShowDTO(AnimalesShowLogic.insert(fdto.toEntity()));
    }
    /**
     * Actualizaion
     * @param id
     * @param AnimalesShow
     * @return 
     */
    @PUT
    @Path("{id: \\d+}")
    public AnimalesShowDTO updateAnimalesShow(@PathParam("id") Long id, AnimalesShowDTO AnimalesShow) {
        AnimalesShowEntity entity = AnimalesShowLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El show de animales solicitado no existe");
        }
        return new AnimalesShowDTO(AnimalesShowLogic.actualizarAnimalesShow(id, AnimalesShow.toEntity()));
    }
    
    /**
     * Eliminar 
     * @param id 
     */
    @DELETE
    @Path("{AnimalesShowId: \\d+}")
    public void deleteAnimalesShow(@PathParam("AnimalesShowId") int id) {
        AnimalesShowEntity entity = AnimalesShowLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El show de animales solicitado no existe");
        }
        AnimalesShowLogic.delete(id);
    }
}
