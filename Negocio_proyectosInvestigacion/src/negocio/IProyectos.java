package negocio;

import dominio.Proyectos;

/**
 *
 * @author germa
 */
public interface IProyectos {
    
    boolean verificarInformacion(String campoTexto);
    Proyectos consultarProyectos(String campoTexto,int index);
}
