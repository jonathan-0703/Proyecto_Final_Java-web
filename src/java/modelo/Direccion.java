package modelo;
// Generated Mar 6, 2022 12:08:00 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Direccion generated by hbm2java
 */
public class Direccion  implements java.io.Serializable {


     private int idDireccion;
     private Usuario usuario;
     private String descripcion;
     private int codigoPostal;
     private String ciudad;
     private Set<CabezeraFactura> cabezeraFacturas = new HashSet<CabezeraFactura>(0);

    public Direccion() {
    }

	
    public Direccion(int idDireccion, String descripcion, int codigoPostal, String ciudad) {
        this.idDireccion = idDireccion;
        this.descripcion = descripcion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }
    public Direccion(int idDireccion, Usuario usuario, String descripcion, int codigoPostal, String ciudad, Set<CabezeraFactura> cabezeraFacturas) {
       this.idDireccion = idDireccion;
       this.usuario = usuario;
       this.descripcion = descripcion;
       this.codigoPostal = codigoPostal;
       this.ciudad = ciudad;
       this.cabezeraFacturas = cabezeraFacturas;
    }
   
    public int getIdDireccion() {
        return this.idDireccion;
    }
    
    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getCodigoPostal() {
        return this.codigoPostal;
    }
    
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public Set<CabezeraFactura> getCabezeraFacturas() {
        return this.cabezeraFacturas;
    }
    
    public void setCabezeraFacturas(Set<CabezeraFactura> cabezeraFacturas) {
        this.cabezeraFacturas = cabezeraFacturas;
    }




}

