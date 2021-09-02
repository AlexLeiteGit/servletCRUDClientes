package br.com.javacodex.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.javacodex.modelo.Banco;
import br.com.javacodex.modelo.Cliente;

//@WebServlet("/mostraCliente")
public class MostraClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("mostrando empresas");
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new  Banco();
		Cliente cliente = banco.buscaClientePeloId(id);
		
		request.setAttribute("cliente", cliente);
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraCliente.jsp");
		
		rd.forward(request, response);
		
		System.out.println(cliente.getNome());

	}

}
