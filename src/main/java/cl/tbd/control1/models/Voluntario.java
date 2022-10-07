package cl.tbd.control1.models;
public class Voluntario {
    private int id;
    private String nombre;
    private String correo;
    private String contrasenia;
    private Boolean eliminado;

    //GETTERS
    public int getId(){
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getCorreo(){
        return this.correo;
    }
    public String getContrasenia(){
        return this.contrasenia;
    }
    public Boolean getEliminado(){
        return this.eliminado;
    }
    //SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCorreo(String correo){
        this.correo=correo;
    }
    public void setPassword(String contrasenia){
        this.contrasenia=contrasenia;
    }
    public void setEliminado(Boolean eliminado){
        this.eliminado = eliminado;
    }
}