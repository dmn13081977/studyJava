package javaee.javaeetest;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Servlet", value = "/servlet")
public class Hello extends HttpServlet {
    private String message;
    String name;

    public void init() {
        message = "Servlet!" + name;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        name = request.getParameter("name");
        response.setContentType("text/html");
        // Hello
        PrintWriter pw = response.getWriter();
        pw.println("<html><body>");
        pw.println("<h1>" + message + "</h1>");
        pw.println("</body></html>");
    }

    public void destroy() {
    }
}