package cl.tbd.control1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.tbd.control1.models.Tarea_Habilidad;
import cl.tbd.control1.repository.TareaHabilidadRepositoryImp;

@Service

public class TareaHabilidadService{
    @Autowired
    private TareaHabilidadRepositoryImp tarea_HabilidadRepository  = new TareaHabilidadRepositoryImp();

    public List <Tarea_Habilidad> getAll(){
    return tarea_HabilidadRepository.findAllTarea_Habilidad();  
    }
    public Tarea_Habilidad select(int id){
        return tarea_HabilidadRepository.getTarea_Habilidad(id);
    }
    public Tarea_Habilidad crearTarea_Habilidad(Tarea_Habilidad tarea_Habilidad){
        return  tarea_HabilidadRepository.createTarea_Habilidad(tarea_Habilidad);
    }
    public void actualizarTarea_Habilidad(Tarea_Habilidad tarea_Habilidad,int id) {

        tarea_HabilidadRepository.updateTarea_Habilidad(tarea_Habilidad, id);
    }
    public void deleteVoluntario(int id){
        tarea_HabilidadRepository.deleteTarea_Habilidad(id);
    }
}