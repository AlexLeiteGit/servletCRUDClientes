package br.com.javacodex.acao;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.javacodex.modelo.Banco;
import br.com.javacodex.modelo.Cliente;

public class AlteraCliente implements Acao{
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String nomeCliente = request.getParameter("nome");
		String sobrenomeCliente = request.getParameter("sobrenome");
		String idadeCliente = request.getParameter("idade");
		String celularCliente = request.getParameter("celular");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println("alterando clientes " + id);
		
		Banco banco = new Banco();
		Cliente cliente = banco.buscaClientePeloId(id);
		cliente.setNome(nomeCliente);
		cliente.setSobrenome(sobrenomeCliente);
		cliente.setIdade(idadeCliente);
		cliente.setCelular(celularCliente);
		
		return "redirect:entrada?acao=ListaCliente";
		
	}

}
