package cl.tbd.control1.models;

public class EmergenciaHabilidad{
    private int id;
    private int id_emergencia;
    private int id_habilidad;
    private Boolean eliminado;

    //GETTERS
    public int getId(){
        return this.id;
    }

    public int getId_emergencia(){
        return this.id_emergencia;
    }

    public int getId_habilidad(){
        return this.id_habilidad;
    }

    public Boolean getEliminado(){
        return this.eliminado;
    }
    //SETTERS
    public void setId(int id_estado){
        this.id = id_estado;
    }

    public void setId_emergencia(int id_emergencia){
        this.id_emergencia=id_emergencia;
    }

    public void setId_habilidad(int id_habilidad){
        this.id_habilidad=id_habilidad;
    }

    public void setEliminado(Boolean eliminado){
        this.eliminado=eliminado;
    }
}