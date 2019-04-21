/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoo.resources;

import co.edu.konrad.zoo.dto.AnimalesDTO;
import co.edu.konrad.zoo.entities.AnimalesEntity;
import co.edu.konrad.zoo.logic.AnimalesLogic;
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
@Path("/animales")
public class AnimalesResource {

    @EJB
    private AnimalesLogic AnimalesLogic;

    @GET
    public List<AnimalesDTO> getAnimalesList() {
        List<AnimalesEntity> Animales = AnimalesLogic.findAll();
        return AnimalesDTO.toAnimalesList(Animales);
    }

    @GET
    @Path("{id: \\d+}")
    public AnimalesDTO getAnimales(@PathParam("id") Long id) {
        AnimalesEntity Animaleso = AnimalesLogic.findById(id);
        if (Animaleso == null) {
            throw new RuntimeException("El Animales solicitado no existe");
        }
        return new AnimalesDTO(Animaleso);
    }

    @POST
    public AnimalesDTO createAnimales(AnimalesDTO fdto) {
        return new AnimalesDTO(AnimalesLogic.insert(fdto.toEntity()));
    }

    @PUT
    @Path("{id: \\d+}")
    public AnimalesDTO updateAnimales(@PathParam("id") Long id, AnimalesDTO Animales) {
        AnimalesEntity entity = AnimalesLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El Animales solicitado no existe");
        }
        return new AnimalesDTO(AnimalesLogic.actualizarAnimales(id, Animales.toEntity()));
    }

    @DELETE
    @Path("{AnimalesId: \\d+}")
    public void deleteAnimales(@PathParam("AnimalesId") int id) {
        AnimalesEntity entity = AnimalesLogic.findById(id);
        if (entity == null) {
            throw new RuntimeException("El Animales solicitado no existe");
        }
        AnimalesLogic.delete(id);
    }
}
