package br.com.javacodex.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.javacodex.modelo.Banco;
import br.com.javacodex.modelo.Cliente;

//@WebServlet("/alteraCliente")
public class AlteraClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Alterando um Cliente!");
		
		String nomeCliente = request.getParameter("nome");
		String sobrenomeCliente = request.getParameter("sobrenome");
		String idadeCliente = request.getParameter("idadeCliente");
		String celular = request.getParameter("celular");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println(id);
		
		Banco banco = new Banco();
		Cliente cliente = banco.buscaClientePeloId(id);
		cliente.setNome(nomeCliente);
		cliente.setSobrenome(sobrenomeCliente);
		cliente.setIdade(idadeCliente);
		cliente.setCelular(celular);
		
		response.sendRedirect("listaCliente");
		
	}

}
