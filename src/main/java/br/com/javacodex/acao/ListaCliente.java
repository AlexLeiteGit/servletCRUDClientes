package br.com.javacodex.acao;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.javacodex.modelo.Banco;
import br.com.javacodex.modelo.Cliente;

public class ListaCliente {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Listando Empresas");
		
		Banco banco = new Banco();
		List<Cliente> lista = banco.getCliente();
		
		request.setAttribute("cliente", lista);
		
		//Migrado para o servlet UnicaEntradaServlet
//		RequestDispatcher rd = request.getRequestDispatcher("/listaClientes.jsp");
//		rd.forward(request, response);
		
		return "forward:listaCliente.jsp";
	}
}
