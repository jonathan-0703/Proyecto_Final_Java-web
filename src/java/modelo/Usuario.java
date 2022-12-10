package modelo;
// Generated Mar 6, 2022 12:08:00 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int idUsuario;
     private String nombre;
     private String apellido;
     private String correoElectronico;
     private String contrasena;
     private String tipoUsuario;
     private Set<Direccion> direccions = new HashSet<Direccion>(0);

    public Usuario() {
    }

    public Usuario(String correoElectronico, String contrasena, String tipoUsuario) {
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.tipoUsuario = tipoUsuario;
    }

    
    
	
    public Usuario(int idUsuario, String nombre, String apellido, String correoElectronico, String contrasena) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
    }
    public Usuario(int idUsuario, String nombre, String apellido, String correoElectronico, String contrasena, String tipoUsuario, Set<Direccion> direccions) {
       this.idUsuario = idUsuario;
       this.nombre = nombre;
       this.apellido = apellido;
       this.correoElectronico = correoElectronico;
       this.contrasena = contrasena;
       this.tipoUsuario = tipoUsuario;
       this.direccions = direccions;
    }
   
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCorreoElectronico() {
        return this.correoElectronico;
    }
    
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String getTipoUsuario() {
        return this.tipoUsuario;
    }
    
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    public Set<Direccion> getDireccions() {
        return this.direccions;
    }
    
    public void setDireccions(Set<Direccion> direccions) {
        this.direccions = direccions;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellido=" + apellido + ", correoElectronico=" + correoElectronico + ", contrasena=" + contrasena + ", tipoUsuario=" + tipoUsuario + ", direccions=" + direccions + '}';
    }


}


