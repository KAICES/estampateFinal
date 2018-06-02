/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesions;

import entities.Estampas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author TIC-SCI
 */
@Stateless
public class EstampasFacade extends AbstractFacade<Estampas> {
    @PersistenceContext(unitName = "estampateFinal2-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstampasFacade() {
        super(Estampas.class);
    }
    
}
