/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoejb.servicio;

import com.proyectoejb.entidades.Evaluaciones;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Imani
 */
@Stateless
public class EvaluacionesFacade extends AbstractFacade<Evaluaciones> implements EvaluacionesFacadeLocal {

    @PersistenceContext(unitName = "ProyectoEJB-Imani")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EvaluacionesFacade() {
        super(Evaluaciones.class);
    }
    
}
