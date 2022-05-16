package negocio;

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
public class CtrlProyectos implements IProyectos{
    
    @Override
    public boolean verificarInformacionBuscar(String campoTexto){
        if (campoTexto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Es necesario llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    @Override
    public List<Profesor> consultarTodosProfesores(){
        return FabricaLogica.getInstancia().consultarTodosProfesores();
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

    @Override
    public boolean verificarInformacionRegistrar(String programa, String linea, String nombre, String acronimo, Date fechaInicio, Date fechaFinal, float presupuesto, String descripcion) {
        if(programa.isEmpty() || linea.isEmpty() || nombre.isEmpty() || acronimo.isEmpty() || fechaInicio == null || fechaFinal == null || presupuesto <= 0 || descripcion.isEmpty()){
            JOptionPane.showMessageDialog(null, "Es necesario llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    @Override
    public boolean registrarProyecto(Proyectos proyecto) {
        if(FabricaLogica.getInstancia().registrarProyecto(proyecto)){
            JOptionPane.showMessageDialog(null, "El proyecto se ha agregado con éxito", "Proyecto", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        JOptionPane.showMessageDialog(null, "No fue posible agregar el proyecto", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
}
