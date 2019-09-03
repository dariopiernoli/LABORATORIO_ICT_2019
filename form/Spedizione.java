package form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Spedizione")
public class Spedizione extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Spedizione() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String spedizione = request.getParameter("spedizione");
		String descrizione = request.getParameter("descrizione");
		
		response.setContentType( "text/html" );
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>"+spedizione+"<br>"+descrizione+"</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
