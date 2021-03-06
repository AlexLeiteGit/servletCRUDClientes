package br.com.javacodex.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

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
		
		String valor = request.getHeader("Accept");
		
		if(valor.contains("xml")) {
			
			XStream xstream = new XStream();
			xstream.alias("cliente", Cliente.class);
			String xml = xstream.toXML(clientes); 
	
			response.setContentType("application/xml");
			response.getWriter().print(xml);
			
		} else if(valor.contains("json")) {
			
			Gson gson = new Gson();
			String json = gson.toJson(clientes);
			
			response.setContentType("application/json");
			response.getWriter().print(json);
			
		} else {
			
			response.setContentType("application/json");
			response.getWriter().print("{'message':'no content'}");
			
		}

	}
	
}
