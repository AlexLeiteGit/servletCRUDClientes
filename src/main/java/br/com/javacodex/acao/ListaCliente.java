package br.com.javacodex.acao;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.javacodex.modelo.Banco;
import br.com.javacodex.modelo.Cliente;

public class ListaCliente implements Acao{
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sessao = request.getSession();
		if(sessao.getAttribute("usuarioLogado") == null) {
			return "redirect:entrada?acao=LoginForm";
			
		}
		
		System.out.println("Listando Empresas");
		
		Banco banco = new Banco();
		List<Cliente> lista = banco.getCliente();
		
		request.setAttribute("cliente", lista);
		
		return "forward:listaCliente.jsp";
	}
}
