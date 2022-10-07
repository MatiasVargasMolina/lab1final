package cl.tbd.control1.repository;
import cl.tbd.control1.models.Tarea_Habilidad;
import java.util.List;
public interface TareaHabilidadRepository {
    public List<Tarea_Habilidad> findAllTarea_Habilidad();
    public Tarea_Habilidad getTarea_Habilidad(int id);
    public Tarea_Habilidad createTarea_Habilidad(Tarea_Habilidad ranking);
    public void updateTarea_Habilidad(Tarea_Habilidad ranking,int id);
    public void deleteTarea_Habilidad(int id);
    public int newId();
}
