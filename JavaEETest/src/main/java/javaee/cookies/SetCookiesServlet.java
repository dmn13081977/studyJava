package javaee.cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


public class SetCookiesServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Cookie cookie1 = new Cookie("id", "123");
        Cookie cookie2 = new Cookie("name", "Tom");
        cookie1.setMaxAge(24 * 60 * 60);//время жизни cookie в браузере в секундах (в данном случае 1 день)
        //cookie.setMaxAge(-1); в данном случае время жизни cookie до закрытия браузера
        response.addCookie(cookie1);
        cookie2.setMaxAge(24 * 60 * 60);//время жизни cookie в браузере в секундах (в данном случае 1 день)
        response.addCookie(cookie2);

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");

        printWriter.println("<h1>" + "Set OK" + "</h1>");

        printWriter.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    }
}
