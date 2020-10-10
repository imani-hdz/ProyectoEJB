/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoejb.ejb;

import com.proyectoejb.entidades.Evaluaciones;
import com.proyectoejb.servicio.EvaluacionesFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Imani
 */

@Named("evaluacionesbean")
@RequestScoped 

public class EJBEvaluaciones implements Serializable{

    @EJB
    private Evaluaciones newevaluaciones;
    private EvaluacionesFacadeLocal evaluacionesFacade;
    
    public Evaluaciones getNewevaluaciones() {
        
        
        if (newevaluaciones==null) {
            
            newevaluaciones = new Evaluaciones();
        }
        return newevaluaciones;
    }
    
    public void setNewevaluaciones(Evaluaciones newevaluaciones) {
        this.newevaluaciones = newevaluaciones;
    }
    
    public EJBEvaluaciones () {
   
    }

    
    public List<Evaluaciones>getSalario() {
            
        return this.evaluacionesFacade.findAll();
    }
    
    public void crear(){
    
        this.evaluacionesFacade.create(newevaluaciones);
    
    }
    
    public void Eliminar(Evaluaciones evaluaciones){
    
        this.evaluacionesFacade.remove(evaluaciones);
    }
    
    
    public void Actualizar(Evaluaciones evaluaciones){
    
        this.evaluacionesFacade.edit(evaluaciones);
    
    }
    
}
