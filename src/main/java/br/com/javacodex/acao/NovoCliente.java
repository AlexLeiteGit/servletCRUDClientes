package br.com.javacodex.acao;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.javacodex.modelo.Banco;
import br.com.javacodex.modelo.Cliente;

public class NovoCliente {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {

		System.out.println("Cadastrando Novo Cliente!");
		
		String nomeCliente = request.getParameter("nome");
		String sobrenomeCliente = request.getParameter("sobrenome");
		String idadeCliente = request.getParameter("idade");
		String celular = request.getParameter("celular");
		
//		Date dataNascimento = null;
//		
//		try {
//			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//			dataNascimento = sdf.parse(dataNascimentoCliente);
//		} catch (ParseException e) {
//			throw new ServletException(e);
//		}
		
		Cliente cliente = new Cliente();
		cliente.setNome(nomeCliente);
		cliente.setSobrenome(sobrenomeCliente);
		cliente.setIdade(idadeCliente);
		cliente.setCelular(celular);
		
		Banco banco = new Banco();
		banco.adicionar(cliente);
		
		request.setAttribute("cliente", cliente.getId());
		request.setAttribute("cliente", cliente.getNome());
		request.setAttribute("cliente", cliente.getSobrenome());
		request.setAttribute("cliente", cliente.getCelular());
		request.setAttribute("cliente", cliente.getDataCadastro());
		
//		response.sendRedirect("entrada?acao=ListaCliente");
		
		return "redirect:entrada?acao=ListaCliente";
		
	}
	
	

}
