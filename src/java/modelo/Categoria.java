package modelo;
// Generated Mar 6, 2022 12:08:00 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria  implements java.io.Serializable {


     private int idCategoria;
     private String descripcion;
     private Set<Producto> productos = new HashSet<Producto>(0);

    public Categoria() {
    }

	
    public Categoria(int idCategoria, String descripcion) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
    }
    public Categoria(int idCategoria, String descripcion, Set<Producto> productos) {
       this.idCategoria = idCategoria;
       this.descripcion = descripcion;
       this.productos = productos;
    }
   
    public int getIdCategoria() {
        return this.idCategoria;
    }
    
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set<Producto> getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }




}

