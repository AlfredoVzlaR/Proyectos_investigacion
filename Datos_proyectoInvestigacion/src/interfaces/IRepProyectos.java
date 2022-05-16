/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Profesor;
import dominio.Proyectos;
import java.util.List;

/**
 *
 * @author Alfredo Valenzuela
 */
public interface IRepProyectos {
    Proyectos consultarProyecto(String parametro, int index);
    List<Profesor> consultarTodosProfesores();
    boolean RegistrarProyecto(Proyectos proyecto);
}
