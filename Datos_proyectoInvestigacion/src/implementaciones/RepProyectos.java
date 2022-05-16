/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import dominio.Profesor;
import dominio.Proyectos;
import interfaces.IConexionBD;
import interfaces.IRepProyectos;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author Alfredo Valenzuela
 */
public class RepProyectos implements IRepProyectos {

    private IConexionBD conexion;
    private MongoDatabase baseDatos;

    public RepProyectos(IConexionBD conexion) {
        this.conexion = conexion;
        this.baseDatos = this.conexion.crearConexion();
    }

    private MongoCollection getCollection() {
        return this.baseDatos.getCollection("proyectos", Proyectos.class);
    }
    
    private MongoCollection <Profesor>getCollectionProfesores() {
        return this.baseDatos.getCollection("profesores", Profesor.class);
    }

    @Override
    public List<Profesor> consultarTodosProfesores(){
        MongoCollection <Profesor> coleccion = this.getCollectionProfesores();
        List<Profesor> listProfesores = new LinkedList();
        coleccion.find().into(listProfesores);
        return listProfesores;
    }
    
    @Override
    public Proyectos consultarProyecto(String parametro, int index) {
        try {
            MongoCollection<Proyectos> coleccion = this.getCollection();
            List<Proyectos> lista = new LinkedList<>();
            if (index == 0) {                
                coleccion.find(new Document().append("codigo", new Document().append("$eq", parametro))).into(lista);
                return lista.get(0);
            } else if (index == 1) {                
                coleccion.find(new Document().append("nombre", new Document().append("$eq", parametro))).into(lista);
                return lista.get(0);
            } else if (index == 2) {                
                coleccion.find(new Document().append("acronimo", new Document().append("$eq", parametro))).into(lista);
                return lista.get(0);
            } else if (index == 3) {                
                coleccion.find(new Document().append("programaInvestigacion", new Document().append("$eq", parametro))).into(lista);
                return lista.get(0);
            } else if (index == 4) {                
                coleccion.find(new Document().append("desarrolloFinancia", new Document().append("$eq", parametro))).into(lista);
                return lista.get(0);
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return null;
    }

    @Override
    public boolean RegistrarProyecto(Proyectos proyecto) {
        MongoCollection<Proyectos> coleccion = this.getCollection();
        coleccion.insertOne(proyecto);
        return true;
    }
}
