package cl.tbd.control1.models;


public class EstadoTarea {
    
    private int id;
    private String estado;
    private Boolean eliminado;
    
    //GETTERS
    public int getId(){
        return this.id;
    }

    public String getEstado(){
        return this.estado;
    }

    public Boolean getEliminado(){
        return this.eliminado;
    }
    //SETTERS
    public void setId(int id){
        this.id=id;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public void setEliminado(Boolean eliminado){
        this.eliminado = eliminado;
    }
    




}