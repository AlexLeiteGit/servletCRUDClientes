package br.com.javacodex.acao;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.javacodex.modelo.Banco;
import br.com.javacodex.modelo.Cliente;

public class NovoClienteForm implements Acao{

	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		return "forward:formNovoCliente.jsp";
		
	}
	
	

}
