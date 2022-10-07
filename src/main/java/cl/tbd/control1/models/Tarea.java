package cl.tbd.control1.models;

public class Tarea{
    private int id;
    private String nombre;
    private String descripcion;
    private Boolean eliminado;

    //GETTERS
    public int getId() {
        return this.id;
    }
     public String getNombre() {
        return this.nombre;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public Boolean getEliminado(){
        return this.eliminado;
    }
    //SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setEliminado(Boolean eliminado){
        this.eliminado = eliminado;
    }

}