package co.edu.konrad.zoo.persistence;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Grupo Zoo
 */
@Stateless
public class TipoAnimalPersistence {
    /**
     * Manejador
     */
    @PersistenceContext(unitName = "ZooPU")
    protected EntityManager em;
}
