package negocio;

/**
 *
 * @author germa
 */
public class FabricaLogica{

    public static IProyectos getInstancia(){
        return new FachadaProyectos();
    }
}
