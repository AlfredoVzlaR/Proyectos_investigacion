package negocio;

import dominio.Profesor;
import dominio.Proyectos;
import java.util.Date;
import java.util.List;

/**
 *
 * @author germa
 */
public interface IProyectos {
    
    boolean verificarInformacionBuscar(String campoTexto);
    boolean verificarInformacionRegistrar(String programa, String linea, String nombre, String acronimo, Date fechaInicio, Date fechaFinal, float presupuesto, String descripcion);
    Proyectos consultarProyectos(String campoTexto,int index);
    List<Profesor> consultarTodosProfesores();
    boolean registrarProyecto(Proyectos proyecto);
}
