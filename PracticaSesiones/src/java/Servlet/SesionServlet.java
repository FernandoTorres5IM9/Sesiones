package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SesionServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        String nombre;
        String apellido;
        
        nombre = request.getParameter("Nombre");
        apellido = request.getParameter("Apellido");
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("claveSesion", nombre + apellido);
        
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        out.println("<a href= '/EjemploSession/Catalogo.jsp'>Link al catalogo del carrito </a>");
        out.println("<br>");
        out.println("ID de la sesion: " + sesion.getId());
        }
    }
