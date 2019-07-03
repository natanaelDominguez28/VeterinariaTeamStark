/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import aplicacion.modelo.dominio.Factura;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
<<<<<<< HEAD
 * @author Miranda
=======
 * @author karina
>>>>>>> origin/master
 */
public class FacturaMain {
    public static List<Factura> listaFactura = new ArrayList<>();
  
  
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = format.parse("14/06/2019");
        Date date2 = format.parse("15/06/2019");
        Date date3 = format.parse("16/06/2019");
        Date date4 = format.parse("19/06/2019");
        
        
      listaFactura.add(new Factura(date1, "pipetas", 2, 60.00));
      listaFactura.add(new Factura(date2, "collares", 5, 300.00));
      listaFactura.add(new Factura(date3, "alimento sabrositos", 1, 90.00));
      listaFactura.add(new Factura(date4, "peceras pequeñas", 3, 900.00));
      
      
      rango();
       
    }
    
    // mtodo
    
     public static void rango() throws ParseException{
         
         
           List<Factura> resultado = new ArrayList<>();
           double total = 0.0;
           
           
         SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");        
          Scanner teclado = new Scanner(System.in);
                System.out.println("Ingrese primera fecha:");
                String fecha1 = teclado.next();
                 System.out.println("Ingrese segunda fecha:");
                String fecha2 = teclado.next();
                
                Date dato1 = format.parse(fecha1);
                Calendar cal1 = new GregorianCalendar();
              cal1.setTime(dato1);
              Date dato2 = format.parse(fecha2);
            Calendar cal2 = new GregorianCalendar();
          cal1.setTime(dato2);
        
          
        
             
         
        for (Factura test : listaFactura) { 
            
           
            if (((test.getFecha().after(dato1)) || test.getFecha().equals(dato1))&& (test.getFecha().before(dato2)|| (test.getFecha().equals(dato2)))== true) {
                resultado.add(test);
                //total+=test.getPrecio();
           }
            
        }   
        
         System.out.println("total lista"+resultado.size());
          System.out.println("precio total"+total);
       
    }


}
