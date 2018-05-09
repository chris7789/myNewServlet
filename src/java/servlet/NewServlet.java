/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author generation
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/Controlador"})
public class NewServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario = request.getParameter("usuario");
        String pelicula[] = {request.getParameter("pelicula")};
        
        response.setContentType("text/html;charset=UTF-8");
                
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        
        out.println("<head>");
        out.println("<title> servlet </title>");
        out.println("</head>");
        
        
        out.println("<body>");
        out.println("<h1>Hola " + usuario +"</h1>");
        
        for(int i=0: pelicula){
        
        }
    
        
        out.println("</body>");
        
        out.println("</html>");
        
    }
   
    
    
    
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String usuario = request.getParameter("usuario");
        
             response.setContentType("text/html;charset=UTF-8");
                
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        
        out.println("<head>");
        out.println("<title> servlet </title>");
        out.println("</head>");
        
        
        out.println("<body>");
        out.println("<h1> Hola "+ usuario +"</h1>");
        out.println("</body>");
        
        out.println("</html>");
        

}
       
    
    
    
}


