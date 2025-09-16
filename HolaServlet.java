package com.lahuerta;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HolaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Hola desde Java Servlet!</h2>");
        out.println("<a href='/' style='font-size:20px'>Volver a inicio</a>");
    }
}