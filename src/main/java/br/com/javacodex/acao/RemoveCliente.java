package br.com.javacodex.acao;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.javacodex.modelo.Banco;

public class RemoveCliente {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		System.out.println("removendo clientes");
		
		String paramId = (String) request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new  Banco();
		banco.removerCliente(id);
		
		// migrado pela o servlet UnicaEntradaServlet
//		response.sendRedirect("entrada?acao=ListaCliente");
		
		System.out.println(id);
		
		return "redirect:entrada?acao=ListaCliente";
		
	}

}
