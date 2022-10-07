package cl.tbd.control1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.tbd.control1.models.Habilidad;
import cl.tbd.control1.models.EmergenciaHabilidad;
import cl.tbd.control1.models.Emergencia;
import cl.tbd.control1.repository.EmergenciaHabilidadRepositoryImp;
import cl.tbd.control1.repository.HabilidadRepositoryImp;
import cl.tbd.control1.repository.EmergenciaRepositoryImp;

@Service

public class RequisitosService {
    @Autowired
    private EmergenciaHabilidadRepositoryImp emergenciaHabilidadRepositoryImp  = new EmergenciaHabilidadRepositoryImp();
    private HabilidadRepositoryImp habilidadRepositoryImp  = new HabilidadRepositoryImp();
    private EmergenciaRepositoryImp emergenciaRepositoryImp  = new EmergenciaRepositoryImp();

    public List <Habilidad> obtenerRequisitos(int id_emergencia){
        list <EmergenciaHabilidad> emergenciasHabilidades = emergenciaHabilidadRepositoryImp.getAll();
        list <EmergenciaHabilidad> Habilidades = HabilidadRepositoryImp.getAll();
        list <Habilidad vacia>;
        for(i = 0; i < emergenciasHabilidades; i++) {
            for(j=0;j<habilidades.length();j++){
                if(id_emergencia==emergenciasHabilidades[i].getId() && id_emergencia==habilidades[i].getID())
                    vacia.append(habilidad);
            }
        }
        return vacia;  
    }

}