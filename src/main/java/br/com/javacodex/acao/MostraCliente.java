package br.com.javacodex.acao;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.javacodex.modelo.Banco;
import br.com.javacodex.modelo.Cliente;

public class MostraCliente {
	
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("mostrando cliente");
		
		String paramId = (String) request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new  Banco();
		Cliente cliente = banco.buscaClientePeloId(id);
		
		request.setAttribute("cliente", cliente);
		
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraCliente.jsp");
		rd.forward(request, response);
		
		System.out.println(cliente.getNome());
		
	}

}
