package br.com.javacodex.acao;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.javacodex.modelo.Banco;
import br.com.javacodex.modelo.Cliente;

public class MostraCliente implements Acao{
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("mostrando cliente");
		
		String paramId = (String) request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new  Banco();
		Cliente cliente = banco.buscaClientePeloId(id);
		
		request.setAttribute("cliente", cliente);
		
		System.out.println(cliente.getNome());
		
		return "forward:formAlteraCliente.jsp";
	}

}
