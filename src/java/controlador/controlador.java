/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.productos;
import logica.metodos;

/**
 *
 * @author Cristian
 */
@WebServlet(name = "controlador", urlPatterns = {"/controlador"})
public class controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        
        
        response.setContentType("text/html;charset=UTF-8");
         ArrayList<productos>Productos= new ArrayList(); 
             
              productos producto1=new productos();
              producto1.setCodigo("1");
              producto1.setNombre("Queso");
              producto1.setMarca("Leches y quesos");
              producto1.setPrecio(4000);
              producto1.setCantidad(10);
              
              Productos.add(producto1);
              
              
              productos producto2=new productos();
              producto2.setCodigo("2");
              producto2.setNombre("Mantequilla");
              producto2.setMarca("Leches y quesos");
              producto2.setPrecio(4500);
              producto2.setCantidad(6);
              
              Productos.add(producto2);
              
              
              productos producto3=new productos();
              producto3.setCodigo("3");
              producto3.setNombre("Yogur");
              producto3.setMarca("Leches y quesos");
              producto3.setPrecio(2300);
              producto3.setCantidad(10);
              
              Productos.add(producto3);
              
              
              productos producto4=new productos();
              producto4.setCodigo("4");
              producto4.setNombre("Queso crema");
              producto4.setMarca("Leches y quesos");
              producto4.setPrecio(2850);
              producto4.setCantidad(9);
              
              Productos.add(producto4);
              
              
              productos producto5=new productos();
              producto5.setCodigo("5");
              producto5.setNombre("Leche");
              producto5.setMarca("Leches y quesos");
              producto5.setPrecio(2900);
              producto5.setCantidad(20);
              
              Productos.add(producto5);
              
              
              productos producto6=new productos();
              producto6.setCodigo("6");
              producto6.setNombre("Cuajada");
              producto6.setMarca("Leches y quesos");
              producto6.setPrecio(5200);
              producto6.setCantidad(4);
              
              Productos.add(producto6);
              
                
        
        String btnenviar=request.getParameter("btn-busqueda");
        String btcompra=request.getParameter("comprar");
        
        
        if(btnenviar!=null){
             metodos operaciones= new metodos();
             
            String codigo= request.getParameter("codigo");
            
            String cantidad=request.getParameter("cantidad");
             int cantidadin=Integer.valueOf(cantidad);
             
             double preciototal=operaciones.preciototal(cantidadin);
             int respue_b=operaciones.buscar(codigo);
             
             try(PrintWriter out= response.getWriter()){
                 out.println("el precio total es:"+preciototal);
                 out.println("lo que se busco:"+respue_b);
             
             }
             
             
            }else if(btcompra!=null) {
                String envio_p=request.getParameter("dinero");
                int envio_pin=Integer.valueOf(envio_p);
                 try(PrintWriter out= response.getWriter()){
                out.println("la plata de  envio:"+envio_p);
               
            }
            }
       
            /* TODO output your page here. You may use following sample code. */
            
              
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
