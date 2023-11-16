package multiplication;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Multiplication extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Multiplication() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        String operation = request.getParameter("operation");

        String result = Integer.toString(num1 * num2);
        // Create a JSON response object
      JsonObject jsonResponse = Json.createObjectBuilder()
              .add("result", result)
              .build();

      // Set response content type to JSON
      response.setContentType("application/json");

      // Write JSON response to the output stream
      response.getWriter().print(jsonResponse.toString());
      }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
