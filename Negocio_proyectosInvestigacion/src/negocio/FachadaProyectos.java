package negocio;

import dominio.Proyectos;

/**
 *
 * @author germa
 */
public class FachadaProyectos implements IProyectos{

    CtrlProyectos ctrl = new CtrlProyectos();
    
    @Override
    public boolean verificarInformacion(String campoTexto) {
        return ctrl.verificarInformacion(campoTexto) != false;
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
    
}
