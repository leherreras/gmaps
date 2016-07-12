/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corralitosjys.gmap.Beans;

import com.corralitosjys.gmap.Entity.Ubicaciones;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Luis Herrera
 */
@Stateless
public class UbicacionesFacade extends AbstractFacade<Ubicaciones> {

    @PersistenceContext(unitName = "com.mycompany_gmap_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UbicacionesFacade() {
        super(Ubicaciones.class);
    }
    
}
