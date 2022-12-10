/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import dao.MarcaDao;
import dao.MarcaDaoImple;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import modelo.Marca;

/**
 *
 * @author User
 */
@Named(value = "mbMarca")
@ViewScoped
public class mbMarca implements Serializable {

    Marca obj_marca;
    
    
    public mbMarca() {
        obj_marca= new Marca();
    }

    public Marca getObj_marca() {
        return obj_marca;
    }

    public void setObj_marca(Marca obj_marca) {
        this.obj_marca = obj_marca;
    }
    
     public List<Marca> getLstMarca(){
         MarcaDao obj_MarcaDao = new MarcaDaoImple();
        return obj_MarcaDao.ConsultarMarca();
    }
    
}
