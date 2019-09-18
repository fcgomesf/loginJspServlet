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

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		Usuario user = new Usuario();
		user.setLogin(login);
		user.setSenha(senha);

		if (this.autenticado(user)) {
			request.setAttribute("usuario", user);
			RequestDispatcher dispatch = request.getRequestDispatcher("dashboard.jsp");
			dispatch.forward(request, response);

		} else {
			request.setAttribute("erro", "Acesso Negado");
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);

		}
	}

	private boolean autenticado(Usuario usuario) {
		boolean resultado = false;
		if (usuario != null && usuario.getLogin() != null && usuario.getSenha() != null
				&& usuario.getLogin().equals(usuario.getSenha())) {
			resultado = true;
		}
		return resultado;
	}

}
