package pole_info;

import java.io.IOException;
import java.util.HashMap;
import service.ListeContenu;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Preferences
 */
@WebServlet("/Preferences")
public class Preferences extends HttpServlet {
	public static final String ATT_MESSAGES = "messages";
	public static final String VUE          = "/WEB-INF/Preferences.jsp";
	private static final long serialVersionUID = 1L;
	@Inject
	private ListeContenu listeContenu;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Preferences() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HashMap<Integer,String> messages = listeContenu.getListeContenu();
		
		request.setAttribute( ATT_MESSAGES, messages );
		this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
