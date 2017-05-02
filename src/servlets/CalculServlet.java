package servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejb.CalculatriceLocal;
import ejb.CalculatriceRemote;

/**
 * Servlet implementation class CalculServlet
 */
@WebServlet("/CalculServlet")
public class CalculServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private CalculatriceLocal calculatriceRemote;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		String action = request.getParameter("action");
		
		int resultatAdddition = 0;
		int resultatSoustraction = 0;
		int resultatDivision = 0;
		int resultatMultiplication = 0;
		
		if(action.equals("ajouter")){
			resultatAdddition = calculatriceRemote.addition(x, y);
			resultatSoustraction = calculatriceRemote.soustraction(x, y);
			resultatDivision = calculatriceRemote.division(x, y);
			resultatMultiplication = calculatriceRemote.multiplication(x, y);
			request.setAttribute("resultatAddition", resultatAdddition);
			request.setAttribute("resultatSoustraction", resultatSoustraction);
			request.setAttribute("resultatDivision", resultatDivision);
			request.setAttribute("resultatMultiplication", resultatMultiplication);
			request.setAttribute("action", action);
			request.getRequestDispatcher("index.jsp").forward(request, response);;
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
