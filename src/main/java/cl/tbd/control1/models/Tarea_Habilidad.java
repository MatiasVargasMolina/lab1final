package cl.tbd.control1.models;

public class Tarea_Habilidad{
    private int id;
    private int id_tarea;
    private int id_habilidad;
    private Boolean eliminado;

    //GETTERS
    public int getId(){
        return this.id;
    }
    public int getId_tarea(){
        return this.id_tarea;
    }
    public int getId_habilidad(){
        return this.id_habilidad;
    }
    public Boolean getEliminado(){
        return this.eliminado;
    }
    //SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setId_tarea(int id_tarea){
        this.id_tarea=id_tarea;
    }
    public void setEliminado(Boolean eliminado){
        this.eliminado = eliminado;
    }
    
}