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
public class FachadaProyectos implements IProyectos{

    CtrlProyectos ctrl = new CtrlProyectos();
    CtrlRegistrar ctrlRegistrar = new CtrlRegistrar();
    
    @Override
    public boolean verificarInformacionBuscar(String campoTexto) {
        return ctrl.verificarInformacionBuscar(campoTexto) != false;
    }

    @Override
    public Proyectos consultarProyectos(String campoTexto,int index) {
        if(index==0){
            return ctrl.consultarProyectos(campoTexto, index);
        }
        else if(index==1){
            return ctrl.consultarProyectos(campoTexto, index);
        }
        else if(index==2){
            return ctrl.consultarProyectos(campoTexto, index);
        }
        else if(index==3){
            return ctrl.consultarProyectos(campoTexto, index);
        }
        else if(index==4){
            return ctrl.consultarProyectos(campoTexto, index);
        }
        return null;
    }

    @Override
    public boolean verificarInformacionRegistrar(String programa, String linea, String nombre, String acronimo, Date fechaInicio, Date fechaFinal, float presupuesto, String descripcion, int index, List<Profesor> profesoresParticipantes) {
        return ctrlRegistrar.verificarInformacionRegistrar(programa, linea, nombre, acronimo, fechaInicio, fechaFinal, presupuesto, descripcion, index, profesoresParticipantes);
    }

    @Override
    public boolean registrarProyecto(Proyectos proyecto) {
        return ctrlRegistrar.registrarProyecto(proyecto);
    }

//    @Override
//    public List<Profesor> consultarTodosProfesores() {
//        return ctrl.consultarTodosProfesores();
//    }
    
    @Override
    public List<Doctor> consultarDoctores() {
        return ctrlRegistrar.consultarDoctores();
    }   
    

    @Override
    public List<LineaInvestigacion> consultarLineasInvestigacion() {
        return ctrlRegistrar.consultarLineasInvestigacion();
    }

    @Override
    public List<NoDoctor> consultarNoDoctores() {
        return ctrlRegistrar.consultarNoDoctores();
    }

    
}
