package javaee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

//счётчик количества посещений пользователем страницы
@WebServlet(name = "User", value = "/user")
public class UserServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //создаём сессию
        HttpSession session = request.getSession();

        //счётчик количества посещений пользователем страницы
        //создаём переменную
//        Integer count = (Integer) session.getAttribute("count");
//        //если пользователь зашёл первый раз - присваиваем 1, иначе увеличиваем на 1
//        if (count == null) session.setAttribute("count", count = 1);
//        else session.setAttribute("count", count += 1);

//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");
//
//        PrintWriter printWriter = response.getWriter();
//        printWriter.println("<html>");
//        printWriter.println("<h1> Hello, " + name + " " + surname + "</h1>");
//        printWriter.println("<h1> Your count is: " + count + "</h1>");
//        printWriter.println("</html>");


        //корзина покупок
//        String itemName = request.getParameter("itemname");
//        int quantity = Integer.parseInt(request.getParameter("quantity"));
//        Cart cart = (Cart) session.getAttribute("cart");
//        if (cart == null) {
//            cart = new Cart();
//            cart.setItemName(itemName);
//            cart.setQuantity(quantity);
//        }
//            session.setAttribute("cart", cart);
//            //перенаправляем на .jsp файл для показа пользователю корзины товаров
//            getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);

        //проверка аутентификация пользователя
        String user = (String) session.getAttribute("current_user");
        if (user == null) {
            //response для анонимного пользователя
            //аутентификация
            //или регистрация нового пользователя
            //session.setAttribute("current_user", Id);
        }

        //response для пользователя

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
    }

}
