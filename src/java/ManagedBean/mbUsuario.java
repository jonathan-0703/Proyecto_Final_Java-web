/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import dao.UsuarioDao;
import dao.UsuarioDaoImple;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import modelo.Usuario;

/**
 *
 * @author User
 */
@Named(value = "mbUsuario")
@ViewScoped
public class mbUsuario implements Serializable{

    Usuario obj_Usuario = new Usuario();
    /*public mbUsuario() {
        obj_Usuario= new Usuario();
    }*/

    public Usuario getObj_Usuario() {
        return obj_Usuario;
    }

    public void setObj_Usuario(Usuario obj_Usuario) {
        this.obj_Usuario = obj_Usuario;
    }
    
    public List<Usuario> getLstUsuario(){
        UsuarioDao obj_UsuarioDao= new UsuarioDaoImple();
        return obj_UsuarioDao.ConsultarUsuario();
    }
    
    
    
    public void agregarUsuario(){
        UsuarioDao obj_UsuarioDao= new UsuarioDaoImple();
         try{
            obj_UsuarioDao.agregarUsuario(obj_Usuario);
        }
        catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,"",e.getMessage()));
        }
        obj_Usuario= new Usuario();
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Msg","DATOS INGRESADOS CORRECTAMENTE"));
    }
    public void modificarUsuario(){
        UsuarioDao obj_UsuarioDao= new UsuarioDaoImple();
         try{
            obj_UsuarioDao.modificarUsuario(obj_Usuario);
        }
        catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,"",e.getMessage()));
        }
        obj_Usuario= new Usuario();
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Msg","DATOS MODIFICADOS CORRECTAMENTE"));
        
    }
    public void eliminarUsuario(){
        UsuarioDao obj_UsuarioDao= new UsuarioDaoImple();
         try{
            obj_UsuarioDao.eliminarUsuario(obj_Usuario);
        }
        catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,"",e.getMessage()));
        }
        obj_Usuario= new Usuario();
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Msg","DATOS ELIMINADOS CORRECTAMENTE"));
    }
    
    
    public String agregarRegistro(){
        
        String ruta="";
        UsuarioDao obj_UsuarioDao= new UsuarioDaoImple();
         try{
            obj_UsuarioDao.agregarRegistro(obj_Usuario);
            ruta="indexTemplate?faces-redirect=true";
        }
        catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR",e.getMessage()));
        }
        obj_Usuario= new Usuario();
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Msg","DATOS INGRESADOS CORRECTAMENTE"));
        return ruta;
    }
    
    
    
        
    public String verificarDatos() throws Exception{
        UsuarioDao usuarioDao= new UsuarioDaoImple();
        Usuario us ;
        String resultado ="";
        try{
            us=usuarioDao.IniciarSesion(this.obj_Usuario);
            System.out.println("us: " + us);
            if( us !=null && us.getTipoUsuario().equals("Cliente")){
                
                FacesContext.getCurrentInstance().getExternalContext()
                        .getSessionMap().put("Usuario", us);
                resultado="indexTemplate";
            }else if (us !=null && us.getTipoUsuario().equals("Administrador")){
                FacesContext.getCurrentInstance().getExternalContext()
                        .getSessionMap().put("Usuario", us);
                resultado="adminUsuarios";
            }else{
                FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_WARN,"Msg","Error de sesión"));
                //resultado="/faces/Login/error";
            }
   
        }catch(Exception e){
            throw e;
        }
        return resultado;
    }
   
    public boolean verificarSession(){
        
        boolean estado;
        if(FacesContext.getCurrentInstance().getExternalContext().
                getSessionMap().get("Usuario")==null){
            estado=false;
        }
        else{
            estado = true;
        }
        return estado;
    } 
    
    /*public void verificarSesion(){
        try{
            FacesContext context = FacesContext.getCurrentInstance();
            Usuario u = (Usuario) context.getExternalContext().getSessionMap().get("Usuario");
            if(u==null){
                context.getExternalContext().redirect("/faces/Login/error");
            }
        }catch(Exception ex){
    
        }
    }*/
        
    
    
    
}
