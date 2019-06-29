/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaion.modelo.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * clase de testeo para probar si se carga una lista de facturas
 * @author pc
 */
public class Test1 implements Serializable{
    
    private List<Test> listaFactura = new ArrayList<>();
    
    public Test1(){ // agregamos una lista predeterminada de facturas
      listaFactura.add(new Test("05/04/2019", "pipetas", 2, 60.00));
      listaFactura.add(new Test("05/04/2019", "collares", 5, 300.00));
      listaFactura.add(new Test("05/04/2019", "alimento sabrositos", 1, 90.00));
      listaFactura.add(new Test("05/04/2019", "peceras pequeñas", 3, 900.00));
      
        
    }
    

  

    public List<Test> getListaFactura() {
        return listaFactura;
    }

    public void setListaFactura(List<Test> listaFactura) {
        this.listaFactura = listaFactura;
    }
    //aqui calculamos el total de las facturas cargadas 
    public Double totalFacturas(){
        double total=0.0;
        
        for (Test elemento : listaFactura) {
           total= elemento.getPrecio();
        }
        return total;
    }
    
    
   
    
    
    
}


    

