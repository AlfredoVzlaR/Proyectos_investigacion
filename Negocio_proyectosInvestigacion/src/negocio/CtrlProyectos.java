package negocio;

import dominio.Doctor;
import dominio.LineaInvestigacion;
import dominio.NoDoctor;
import dominio.Profesor;
import implementaciones.FabricaProyectos;
import dominio.Proyectos;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author germa
 */
public class CtrlProyectos{
    
    public boolean verificarInformacionBuscar(String campoTexto){
        if (campoTexto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Es necesario llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public List<Doctor> consultarDoctores(){
        return FabricaProyectos.getInstanciaRep().consultarDoctores();
    }
    
    public List<NoDoctor> consultarNoDoctores(){
        return FabricaProyectos.getInstanciaRep().consultarNoDoctores();
    }
    
//    public List<Doctor> consultarDoctores(){
//        return FabricaProyectos.getInstanciaRep().;
//    }
    
    public List<LineaInvestigacion> consultarLineasInvestigacion(){
        return FabricaProyectos.getInstanciaRep().consultarLineasInvestigacion();
    }
    
    public Proyectos consultarProyectos(String campoTexto, int index) {
        if (index == 0) {
            Proyectos proyecto = FabricaProyectos.getInstancia().ConsultarProyectos(campoTexto, index);
            if (proyecto == null) {
                return null;
            }

            return proyecto;
        } else if (index == 1) {
            Proyectos proyecto = FabricaProyectos.getInstancia().ConsultarProyectos(campoTexto, index);
            if (proyecto == null) {
                return null;
            }

            return proyecto;
        } else if (index == 2) {
            Proyectos proyecto = FabricaProyectos.getInstancia().ConsultarProyectos(campoTexto, index);
            if (proyecto == null) {
                return null;
            }

            return proyecto;
        } else if (index == 3) {
            Proyectos proyecto = FabricaProyectos.getInstancia().ConsultarProyectos(campoTexto, index);
            if (proyecto == null) {
                return null;
            }

            return proyecto;
        } else if (index == 4) {
            Proyectos proyecto = FabricaProyectos.getInstancia().ConsultarProyectos(campoTexto, index);
            if (proyecto == null) {
                return null;
            }

            return proyecto;
        }
        return null;
    }

    public boolean verificarInformacionRegistrar(String programa, String linea, String nombre, String acronimo, Date fechaInicio, Date fechaFinal, float presupuesto, String descripcion, int index, List<Profesor> profesoresParticipantes) {
        if(programa.isEmpty() || linea.isEmpty() || nombre.isEmpty() || acronimo.isEmpty() || fechaInicio == null || fechaFinal == null || presupuesto <= 0 || descripcion.isEmpty()){
            JOptionPane.showMessageDialog(null, "Es necesario llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(index == 0){
            JOptionPane.showMessageDialog(null, "Seleccione un doctor", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(profesoresParticipantes.isEmpty()){
            JOptionPane.showMessageDialog(null, "Seleccione profesores/doctores", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean registrarProyecto(Proyectos proyecto) {
        if(FabricaProyectos.getInstanciaRep().RegistrarProyecto(proyecto)){
            JOptionPane.showMessageDialog(null, "El proyecto se ha agregado con éxito", "Proyecto", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        JOptionPane.showMessageDialog(null, "No fue posible agregar el proyecto", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    
}
