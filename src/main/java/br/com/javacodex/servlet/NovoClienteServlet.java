package br.com.javacodex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novoCliente")
public class NovoClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeCliente = request.getParameter("nome");
		String sobrenomeCliente = request.getParameter("sobrenome");
		String idadeCliente = request.getParameter("idade");
		String celularCleinte = request.getParameter("celular");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>Cliente " + nomeCliente + " Cadastrado com sudcesso</body></html>");
		
	}

}
