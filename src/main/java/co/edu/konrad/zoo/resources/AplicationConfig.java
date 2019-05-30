/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoo.resources;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author Luis
 */
@ApplicationPath("/api")
public class AplicationConfig extends Application {

    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        addRestResouceClasses(resources);
        return resources;
    }

    private void addRestResouceClasses(Set<Class<?>> resources) {
        resources.add(AnimalesResource.class);
        resources.add(AnimalesShowResource.class);
        resources.add(CalificacionesResource.class);
        resources.add(CuidadorResource.class);
        resources.add(EspeciesResource.class);
        resources.add(HorarioResource.class);
        resources.add(HorarioTipoAlimentoResource.class);
        resources.add(LugaresResource.class);
        resources.add(PersonaResource.class);
        resources.add(ShowResource.class);
        resources.add(TipoAlimentoResource.class);
        resources.add(TipoAnimalResource.class);
        resources.add(TipoIdentificacionResource.class);
        resources.add(NewCrossOriginResourceSharingFilter.class);
    }

}
