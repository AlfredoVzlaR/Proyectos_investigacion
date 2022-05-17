package negocio;

import dominio.Doctor;
import dominio.LineaInvestigacion;
import dominio.NoDoctor;
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
    boolean verificarInformacionRegistrar(String programa, String linea, String nombre, String acronimo, Date fechaInicio, Date fechaFinal, float presupuesto, String descripcion, int index, List<Profesor> profesoresParticipantes);
    Proyectos consultarProyectos(String campoTexto,int index);
    List<LineaInvestigacion> consultarLineasInvestigacion();
    List<Doctor> consultarDoctores();
    public List<NoDoctor> consultarNoDoctores();
    boolean registrarProyecto(Proyectos proyecto);
}
