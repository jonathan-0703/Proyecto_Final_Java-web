package modelo;
// Generated Mar 6, 2022 12:08:00 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pago generated by hbm2java
 */
public class Pago  implements java.io.Serializable {


     private int idPago;
     private String metodoPago;
     private String nombreTitular;
     private Date fechaExpedicion;
     private String numeroTarjeta;
     private Set<CabezeraFactura> cabezeraFacturas = new HashSet<CabezeraFactura>(0);

    public Pago() {
    }

	
    public Pago(int idPago, String metodoPago, String nombreTitular, Date fechaExpedicion, String numeroTarjeta) {
        this.idPago = idPago;
        this.metodoPago = metodoPago;
        this.nombreTitular = nombreTitular;
        this.fechaExpedicion = fechaExpedicion;
        this.numeroTarjeta = numeroTarjeta;
    }
    public Pago(int idPago, String metodoPago, String nombreTitular, Date fechaExpedicion, String numeroTarjeta, Set<CabezeraFactura> cabezeraFacturas) {
       this.idPago = idPago;
       this.metodoPago = metodoPago;
       this.nombreTitular = nombreTitular;
       this.fechaExpedicion = fechaExpedicion;
       this.numeroTarjeta = numeroTarjeta;
       this.cabezeraFacturas = cabezeraFacturas;
    }
   
    public int getIdPago() {
        return this.idPago;
    }
    
    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }
    public String getMetodoPago() {
        return this.metodoPago;
    }
    
    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    public String getNombreTitular() {
        return this.nombreTitular;
    }
    
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
    public Date getFechaExpedicion() {
        return this.fechaExpedicion;
    }
    
    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }
    public String getNumeroTarjeta() {
        return this.numeroTarjeta;
    }
    
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    public Set<CabezeraFactura> getCabezeraFacturas() {
        return this.cabezeraFacturas;
    }
    
    public void setCabezeraFacturas(Set<CabezeraFactura> cabezeraFacturas) {
        this.cabezeraFacturas = cabezeraFacturas;
    }




}

