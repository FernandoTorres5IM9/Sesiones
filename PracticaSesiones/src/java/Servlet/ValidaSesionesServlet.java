package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ValidaSesionesServlet extends HttpServlet{
    BasedeDatos conexion = new BasedeDatos("localhost8080","Sesion");
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession sesion = request.getSession();
        String titulo = null;
        
        String claveSesion = (String) sesion.getAttribute("claveSesion");
        
        conexion.
                
        PrintWriter out = response.getWriter();
        out.println("Continua sesion" + titulo);
        out.println("<br>");
        out.println("ID de la sesion:" + sesion.getId());
    }
}
