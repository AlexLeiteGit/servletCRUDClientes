package br.com.javacodex.acao;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.javacodex.modelo.Banco;

public class RemoveCliente implements Acao{
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		System.out.println("Removendo Clientes");
		
		String paramId = (String) request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new  Banco();
		banco.removerCliente(id);

		System.out.println(id);
		
		return "redirect:entrada?acao=ListaCliente";
		
	}

}
