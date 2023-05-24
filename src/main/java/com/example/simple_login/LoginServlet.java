package com.example.simple_login;

import java.io.*;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("user") && password.equals("123")) {
            request.setAttribute("loginTime", new Date());
            request.setAttribute("username", "Lâm đẹp trai");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("login/admin.jsp");
            requestDispatcher.forward(request,response);
        }
        else if(username.equals("admin") && password.equals("admin")){
          request.setAttribute("onTime", new Date());
          RequestDispatcher requestDispatcher = request.getRequestDispatcher("login/user.jsp");
          requestDispatcher.forward(request,response);
        }
        else {
            response.sendRedirect("login");
        }
    }


}