package operations;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Operations")
public class Operations extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Operations() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        String operation = request.getParameter("operation");
        
        if("add".equals(operation)) {
        	RequestDispatcher dispatcher = request.getRequestDispatcher("/Addition");
        	dispatcher.forward(request, response);
        }else if("mult".equals(operation)){
        	RequestDispatcher dispatcher = request.getRequestDispatcher("/Multiplication");
        	dispatcher.forward(request, response);
        }
    }
}
