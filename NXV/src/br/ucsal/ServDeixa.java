package br.ucsal;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServDeixa")
public class ServDeixa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServDeixa() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		if(login.equals(senha)){
			
			RequestDispatcher dispatch = request.getRequestDispatcher("verificador.jsp");
			dispatch.forward(request, response);
			
		}else{
			response.sendRedirect("index.html?erro=Acesso Negado");
			
			 }
				
		response.getWriter().append("<html> <body>");

		response.getWriter().append("</body></html>");
		
		
	}

}
