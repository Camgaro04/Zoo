package co.edu.konrad.zoo.resources;

import co.edu.konrad.zoo.dto.EspeciesDTO;
import co.edu.konrad.zoo.entities.EspeciesEntity;
import co.edu.konrad.zoo.logic.EspecieLogic;
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
@Path("/especies")
public class EspeciesResource {

    /**
     * hace conexion al logic
     */
    @EJB
    private EspecieLogic EspeciesLogic;
    
    /**
     * Obtiene toda la lista
     * @return 
     */
    @GET
    public List<EspeciesDTO> getEspeciesList() {
        List<EspeciesEntity> Especies = EspeciesLogic.findAll();
        return EspeciesDTO.toEspeciesList(Especies);
    }
    /**
     * obtiene especies por id
     * @param id
     * @return 
     */
    @GET
    @Path("{id: \\d+}")
    public EspeciesDTO getEspecies(@PathParam("id") int id) {
        EspeciesEntity Especieso = EspeciesLogic.findById(id);
        if (Especieso == null) {
            throw new RuntimeException("El especies no existe");
        }
        return new EspeciesDTO(Especieso);
    }
    
    /**
     * Crea especies
     * @param fdto
     * @return 
     */
    @POST
    public EspeciesDTO createEspecies(EspeciesDTO fdto) {
        return new EspeciesDTO(EspeciesLogic.insert(fdto.toEntity()));
    }
    
    /**
     * Actualiza especies
     * @param id
     * @param Especies
     * @return 
     */
    @PUT
    @Path("{id: \\d+}")
    public EspeciesDTO updateEspecies(@PathParam("id") int id, EspeciesDTO Especies) {
        EspeciesEntity entity = EspeciesLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El especies no existe");
        }
        return new EspeciesDTO(EspeciesLogic.actualizarEspecie(id, Especies.toEntity()));
    }
    
    /**
     * Elimina especies por id
     * @param id 
     */
    @DELETE
    @Path("{EspeciesId: \\d+}")
    public void deleteEspecies(@PathParam("EspeciesId") int id) {
        EspeciesEntity entity = EspeciesLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El especies no existe");
        }
        EspeciesLogic.delete(id);
    }
}
