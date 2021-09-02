package br.com.javacodex.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import br.com.javacodex.modelo.Banco;
import br.com.javacodex.modelo.Cliente;


@WebServlet("/listaCliente")
public class ListaClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Cliente> lista = banco.getCliente();
		
//		PrintWriter out = response.getWriter();
//		
//		out.println("<html><body>");
//		out.println("<ul>");
//		
//		for(Cliente cliente : lista) {
//			out.print("<li>" + cliente.getNome() + " " + cliente.getSobrenome()
//			+ " " + cliente.getCelular() + "</li>");
//			System.out.println();
//		}
//		
//		out.println("</ul>");
//		out.println("</body></html>");
	}

}
