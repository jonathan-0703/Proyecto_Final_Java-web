package modelo;
// Generated Mar 6, 2022 12:08:00 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * CabezeraFactura generated by hbm2java
 */
public class CabezeraFactura  implements java.io.Serializable {


     private int idCabezeraFactura;
     private Direccion direccion;
     private Pago pago;
     private Set<DetalleFactura> detalleFacturas = new HashSet<DetalleFactura>(0);

    public CabezeraFactura() {
    }

	
    public CabezeraFactura(int idCabezeraFactura) {
        this.idCabezeraFactura = idCabezeraFactura;
    }
    public CabezeraFactura(int idCabezeraFactura, Direccion direccion, Pago pago, Set<DetalleFactura> detalleFacturas) {
       this.idCabezeraFactura = idCabezeraFactura;
       this.direccion = direccion;
       this.pago = pago;
       this.detalleFacturas = detalleFacturas;
    }
   
    public int getIdCabezeraFactura() {
        return this.idCabezeraFactura;
    }
    
    public void setIdCabezeraFactura(int idCabezeraFactura) {
        this.idCabezeraFactura = idCabezeraFactura;
    }
    public Direccion getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public Pago getPago() {
        return this.pago;
    }
    
    public void setPago(Pago pago) {
        this.pago = pago;
    }
    public Set<DetalleFactura> getDetalleFacturas() {
        return this.detalleFacturas;
    }
    
    public void setDetalleFacturas(Set<DetalleFactura> detalleFacturas) {
        this.detalleFacturas = detalleFacturas;
    }




}


