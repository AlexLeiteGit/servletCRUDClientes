package br.com.javacodex.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.com.javacodex.modelo.Banco;
import br.com.javacodex.modelo.Cliente;

/**
 * Servlet implementation class ClientesService
 */
@WebServlet("/clientes")
public class ClientesService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		List<Cliente> clientes = new Banco().getCliente();
		
		Gson gson = new Gson();
		String json = gson.toJson(clientes);
		
		response.setContentType("application/json");
		response.getWriter().print(json);

	}
	
}
