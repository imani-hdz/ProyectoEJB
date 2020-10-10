/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoejb.servicio;

import com.proyectoejb.entidades.Evaluaciones;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Imani
 */
@Local
public interface EvaluacionesFacadeLocal {

    void create(Evaluaciones evaluaciones);

    void edit(Evaluaciones evaluaciones);

    void remove(Evaluaciones evaluaciones);

    Evaluaciones find(Object id);

    List<Evaluaciones> findAll();

    List<Evaluaciones> findRange(int[] range);

    int count();
    
}
