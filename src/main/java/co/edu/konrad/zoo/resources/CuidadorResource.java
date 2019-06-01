package co.edu.konrad.zoo.resources;

import co.edu.konrad.zoo.dto.CuidadorDTO;
import co.edu.konrad.zoo.entities.CuidadorEntity;
import co.edu.konrad.zoo.logic.CuidadorLogic;
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
@Path("/cuidador")
public class CuidadorResource {
    
    /**
     * 
     * Conexion a logic
     */
    @EJB
    private CuidadorLogic CuidadorLogic;
    
    /**
     * Obtiene toda la lista de los cuidadores
     * @return 
     */
    @GET
    public List<CuidadorDTO> getCuidadorList() {
        List<CuidadorEntity> Cuidador = CuidadorLogic.findAll();
        return CuidadorDTO.toCuidadorList(Cuidador);
    }
    
    /**
     * Obtiene el cuidador por id servicios
     * @param id
     * @return 
     */
    @GET
    @Path("{id: \\d+}")
    public CuidadorDTO getCuidador(@PathParam("id") int id) {
        CuidadorEntity Cuidadoro = CuidadorLogic.findById(id);
        if (Cuidadoro == null) {
            throw new RuntimeException("El cuidador no existe");
        }
        return new CuidadorDTO(Cuidadoro);
    }
    
    /**
     * Crea un cuidador
     * @param fdto
     * @return 
     */
    @POST
    public CuidadorDTO createCuidador(CuidadorDTO fdto) {
        return new CuidadorDTO(CuidadorLogic.insert(fdto.toEntity()));
    }

    @PUT
    @Path("{id: \\d+}")
    public CuidadorDTO updateCuidador(@PathParam("id") int id, CuidadorDTO Cuidador) {
        CuidadorEntity entity = CuidadorLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El cuidador no existe");
        }
        return new CuidadorDTO(CuidadorLogic.actualizarCuidador(id, Cuidador.toEntity()));
    }
    
    /**
     * Elimnar
     * @param id 
     */
    @DELETE
    @Path("{CuidadorId: \\d+}")
    public void deleteCuidador(@PathParam("CuidadorId") int id) {
        CuidadorEntity entity = CuidadorLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El cuidador no existe");
        }
        CuidadorLogic.delete(id);
    }
}
