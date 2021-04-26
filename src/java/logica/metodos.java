package logica;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristian
 */
public class metodos {
    ArrayList<productos>Productos= new ArrayList();
     
    public int buscar( String codigo){
      int pos=-1;
        for (int i = 0; i < this.Productos.size(); i++) {
            if(this.Productos.get(i).getCodigo().equals(codigo)){
                pos=i;
                return pos;
            }
            
        }
        return pos;
    }
    
    public String buscar_producto(){
      String informacion="";
        for (int i = 0; i < this.Productos.size(); i++) {
            int posicion=this.buscar(this.Productos.get(i).getCodigo());
            if(posicion!=-1){
             informacion= this.Productos.get(posicion).getCodigo()+ this.Productos.get(posicion).getNombre()+this.Productos.get(posicion).getMarca()+this.Productos.get(posicion).getCantidad()+this.Productos.get(posicion).getPrecio();
             return informacion;
            }
        }
       return informacion;
    }
    
     public double comprar(int plata, int cantidad){
           double respuesta=0;
            for (int i = 0; i < this.Productos.size(); i++) {
               double total=this.preciototal(cantidad);
               
               if(total>plata){
                 respuesta=-1;
                 return respuesta;                   
               }else if(total<=plata){
                 respuesta=plata-total;
                 int quitar=this.Productos.get(i).getCantidad()-cantidad;
                 this.Productos.get(i).setCantidad(quitar);
                 return respuesta;
               }
               if(cantidad>this.Productos.get(i).getCantidad()){
                  respuesta=-2;                
                   return respuesta;
               }
            }
                 
         return respuesta;
     
     }
     
     
     public double preciototal(int cantidad){
         double acomulado=0;
         for (int i = 0; i < this.Productos.size(); i++) {
                int respuesta_b=this.buscar(this.Productos.get(i).getCodigo());
                if(respuesta_b!=-1){
                  acomulado= this.Productos.get(respuesta_b).getPrecio()*cantidad;
                  return acomulado;
                }
         }
         return acomulado;
     }
     
   
     
     
    
}
