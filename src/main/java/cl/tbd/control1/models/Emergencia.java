
package cl.tbd.control1.models;


public class Emergencia {
    
    private int id;
    private String nombre;
    private String ubicacion;
    private String descripcion;
    private Boolean eliminado;

    //GETTERS
    public int getId(){
        return this.id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getUbicacion(){
        return this.ubicacion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public Boolean getEliminado(){
        return this.eliminado;
    }
    //SETTERS
    public void setId(int id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setEliminado(Boolean eliminado){
        this.eliminado = eliminado;
    }
}