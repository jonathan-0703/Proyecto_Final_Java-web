/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import dao.ProductoDao;
import dao.ProductoDaoImple;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import modelo.Producto;
import org.apache.commons.io.IOUtils;
import org.primefaces.model.file.UploadedFile;

/**
 *
 * @author User
 */
@Named(value = "mbProducto")
@ViewScoped
public class mbProducto implements Serializable{


    Producto obj_producto;
    private UploadedFile archivo;
    ProductoDao productoDao = new ProductoDaoImple();
    private List<Producto> productoAgregado;
    
    
    //ProductoDao productoDao = new ProductoDaoImple();
    
    public mbProducto() {
        obj_producto= new Producto();
        productoAgregado = new ArrayList<>();
    }

    public Producto getObj_producto() {
        return obj_producto;
    }

    public void setObj_producto(Producto obj_producto) {
        this.obj_producto = obj_producto;
    }

    public UploadedFile getArchivo() {
        return archivo;
    }

    public void setArchivo(UploadedFile archivo) {
        this.archivo = archivo;
    }

    public List<Producto> getProductoAgregado() {
        return productoAgregado;
    }

    public void setProductoAgregado(List<Producto> productoAgregado) {
        this.productoAgregado = productoAgregado;
    }

    public String actionAgregarProducto2(Producto producto){
        try{
            productoAgregado= AProducto(productoAgregado , producto);
            
            for (Producto producto1 : productoAgregado) {
                System.out.println("Producto"+producto1.getNombre());
                
            }
            
            System.out.println(productoAgregado.size());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        		return "carrito?faces-redirect=true";

    }
    
    
    public void actionAgregarProducto(Producto producto){
        try{
            productoAgregado= AProducto(productoAgregado , producto);
            
            for (Producto producto1 : productoAgregado) {
                System.out.println("Producto"+producto1.getNombre());
                
            }
            
            System.out.println(productoAgregado.size());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    
    public List<Producto>AProducto(List<Producto> productos,Producto _po){
        this.productoAgregado.add(_po);
        return productos;
    }

    
    
    public void convertirBytes(byte[] bytes, String carpeta, String nmbreImagen){
       try{
           Path path = Paths.get(carpeta, nmbreImagen);
           Files.write(path, bytes);
       }
       catch(IOException ex){
           System.out.println("error en los bytes");
       }
    }
    
    
   public List<Producto> getListProducto(){
       return productoDao.ConsultarProducto();
   }
    
   
   
   
    
    public void agregarProducto(){
       
          
        String ruta ="C:\\Users\\User\\OneDrive\\Escritorio\\Trabajos 4\\Aplicaciones web\\Segundo Parcial\\ProyectoPis\\A5_Grupo_GE_AvancePIS\\web\\resources\\imagen";
        try{
            if(archivo.getSize() > 0){

                obj_producto.setImagennombre(archivo.getFileName());
                obj_producto.setImagen(archivo.getContent());

                productoDao.agregarProducto(obj_producto);

                convertirBytes(IOUtils.toByteArray(archivo.getInputStream()), ruta, archivo.getFileName());
                
                FacesContext.getCurrentInstance().addMessage(null, 
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Msg", "Los datos ingresaron corrrectamente")); 
                
            }
            
        }
        catch(IOException e){
            FacesContext.getCurrentInstance().addMessage(null, 
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), ""));
            
        }
        
        
     }
    
    public void modificarProducto(){
       
         try{
            productoDao.modificarProducto(obj_producto);
        }
        catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,"",e.getMessage()));
        }
        obj_producto= new Producto();
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Msg","DATOS MODIFICADOS CORRECTAMENTE"));
        
    }
    public void eliminarCategoria(){
       
         try{
            productoDao.eliminarProducto(obj_producto);
        }
        catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,"",e.getMessage()));
        }
        obj_producto= new Producto();
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Msg","DATOS ELIMINADOS CORRECTAMENTE"));
    }
    
    

   
    
    
    
}
