package cl.tbd.control1.repository;
import cl.tbd.control1.models.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;

@Repository
public class TareaRepositoryImp implements TareaRepository{
@Autowired
    private Sql2o sql2o;
    
    @Override
    public int newId(){
        int id = 0;
        String sql = "SELECT MAX(id) FROM tarea";
        try (Connection conn = sql2o.open()) {
            id = conn.createQuery(sql).executeScalar(int.class);
            return id+1;
        }
    }
    
    @Override
    public List<Tarea> findAllTarea() {
        
        try (Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM tarea").executeAndFetch(Tarea.class);
        }
    }

    @Override
    public Tarea getTarea(int id) {

        try (Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM tarea WHERE id = :id").addParameter("id",id).executeAndFetchFirst(Tarea.class);
        }    
    }

    @Override
    public Tarea createTarea(Tarea tarea){
        Connection conn = sql2o.open();
        String SQL_INSERT = "INSERT INTO tarea(id, nombre, descripcion, eliminado)" + 
                            "VALUES(:id, :nombre, :descripcion, :eliminado)";

        try{
            conn.createQuery(SQL_INSERT, true)
                    .addParameter("id", newId())
                    .addParameter("nombre", tarea.getNombre())
                    .addParameter("descripcion", tarea.getDescripcion())
                    .addParameter("eliminado", tarea.getEliminado())
            
                    .executeUpdate();
            return tarea;

        } catch(Exception e) {
            System.out.println(e.getMessage() + e.getLocalizedMessage() + "No se pudo crear la tarea\n");
            return null;
        }
    }


    @Override
    public void updateTarea(Tarea tarea,int id){

        String SQL_UPDATE = "UPDATE tarea SET nombre = :nombre, descripcion = :descripcion, eliminado = :eliminado, id = :id WHERE id = :id";
        try(Connection conn = sql2o.open()) {
            conn.createQuery(SQL_UPDATE)
                    .addParameter("nombre", tarea.getNombre())
                    .addParameter("descripcion", tarea.getDescripcion())
                    .addParameter("eliminado", tarea.getEliminado())
                    .addParameter("id", id)
                    .executeUpdate();

        } catch(Exception e) {
            System.out.println(e.getMessage() + e.getLocalizedMessage() + "No se pudo actualizar la tarea\n");
        }
    }


    @Override
    public void deleteTarea(int id){
        Connection conn = sql2o.open();
        String SQL_DELETE = "DELETE FROM tarea WHERE tarea.id = :id";

        try{
            conn.createQuery(SQL_DELETE).addParameter("id", id).executeUpdate();

        } catch(Exception e) {
            System.out.println(e.getMessage() + e.getLocalizedMessage() + "No se pudo borrar la tarea\n");
        }
    }
}