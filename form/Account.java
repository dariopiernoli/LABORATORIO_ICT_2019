package form;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Account")
public class Account extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
  
    public Account() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String denominazione = request.getParameter("denominazione");
		String cf = request.getParameter("cf");
		String piva = request.getParameter("piva");
		
		response.setContentType( "text/html" );
		PrintWriter out = response.getWriter();
		
		/**
		 * creo oggetto dispatcher per reindirizzare al form
		 */
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/Account.jsp");
		
		
		/**
		 * se vengono rispettate le condizioni di CF e P.iva stampa le info, altrimenti ridireziona al form
		 */
		if (checkCF(cf) == true && checkPiva(piva) == true)
			out.println("<html><body>"
				+nome+" "+cognome+" "+denominazione+" "+cf+" "+piva+
				"</body></html>");
		else {
			request.setAttribute("errorCF", "INSERISCI UN CF VALIDO");
			dispatcher.forward(request, response);
		}
		
	}
	
	public boolean checkCF(String cf) {
		if(cf.length()!=16)
			return false;
		else if(Pattern.matches("[A-Z]+", cf.substring(0, 6))==true && 
				(Pattern.matches("[0-9]+", cf.substring(6, 8))==true)&& 
				(Pattern.matches("[A-Z]+", cf.substring(8, 9))==true)&& 
				(Pattern.matches("[0-9]+", cf.substring(9, 11))==true)&& 
				(Pattern.matches("[A-Z]+", cf.substring(11, 12))==true)&& 
				(Pattern.matches("[0-9]+", cf.substring(12, 15))==true)&& 
				(Pattern.matches("[A-Z]+", cf.substring(15, 16))==true)
				)
			return true;
		return false;
	}
	
	public boolean checkPiva(String piva) {
		if (piva.length()!=11)
			return false;
		else if(Pattern.matches("[0-9]+", piva) == true)
			return true;
		return false;
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	

}
