/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesions;

import entities.Camisetas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author TIC-SCI
 */
@Stateless
public class CamisetasFacade extends AbstractFacade<Camisetas> {
    @PersistenceContext(unitName = "estampateFinal2-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CamisetasFacade() {
        super(Camisetas.class);
    }
    
}
