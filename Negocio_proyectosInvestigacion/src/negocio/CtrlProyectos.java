package negocio;

import implementaciones.FabricaProyectos;
import dominio.Proyectos;
import javax.swing.JOptionPane;

/**
 *
 * @author germa
 */
public class CtrlProyectos implements IProyectos{
    
    @Override
    public boolean verificarInformacion(String campoTexto){
        if(campoTexto.isEmpty()){
            JOptionPane.showMessageDialog(null, "Es necesario llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }else{
            return true;
        }     
    }
    
    public Proyectos consultarProyectos(String campoTexto,int index)
    {
        if(index==0){
            Proyectos proyecto = FabricaProyectos.getInstancia().ConsultarProyectos(campoTexto,index);
            if(proyecto == null)
            {
                return null;
            }

            return proyecto;
        }
        else if(index==1){
            Proyectos proyecto = FabricaProyectos.getInstancia().ConsultarProyectos(campoTexto,index);
            if(proyecto == null)
            {
                return null;
            }

            return proyecto;
        }
        else if(index==2){
            Proyectos proyecto = FabricaProyectos.getInstancia().ConsultarProyectos(campoTexto,index);
            if(proyecto == null)
            {
                return null;
            }

            return proyecto;
        }
        else if(index==3){
            Proyectos proyecto = FabricaProyectos.getInstancia().ConsultarProyectos(campoTexto,index);
            if(proyecto == null)
            {
                return null;
            }

            return proyecto;
        }
        else if(index==4){
            Proyectos proyecto = FabricaProyectos.getInstancia().ConsultarProyectos(campoTexto,index);
            if(proyecto == null)
            {
                return null;
            }

            return proyecto;
        }
        return null;
    }
    
}
