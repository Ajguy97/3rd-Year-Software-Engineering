/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package enterprise.web_jpa_war.entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author o_molloy
 */
@Stateless
public class ComputerFacade extends AbstractFacade<Computer> {
    @PersistenceContext(unitName = "computerPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ComputerFacade() {
        super(Computer.class);
    }
    
}
