package br.com.javacodex.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.javacodex.acao.AlteraCliente;
import br.com.javacodex.acao.ListaCliente;
import br.com.javacodex.acao.MostraCliente;
import br.com.javacodex.acao.NovoCliente;
import br.com.javacodex.acao.RemoveCliente;
import br.com.javacodex.modelo.Banco;
import br.com.javacodex.modelo.Cliente;


@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String paramAcao = (String) request.getParameter("acao");
		
		String nome = null;
		
		if(paramAcao.equals("ListaCliente")){
			
			ListaCliente acao = new ListaCliente();
			nome = acao.executa(request, response);
			
		} else if(paramAcao.equals("RemoveCliente")){		
			
			RemoveCliente acao = new RemoveCliente();
			nome = acao.executa(request, response);
			
			
		} else if(paramAcao.equals("MostraCliente")){			
			
			MostraCliente acao = new MostraCliente();
			acao.executa(request, response);
			
		} else if(paramAcao.equals("AlteraCliente")){		
			
			AlteraCliente acao = new AlteraCliente();
			acao.executa(request, response);
		}
			else if(paramAcao.equals("NovoCliente")){			
			
			NovoCliente acao = new NovoCliente();
			acao.executa(request, response);
		}
		
		String[] tipoEEndereco = nome.split(":");
		if(tipoEEndereco[0].equals("forward")){
			RequestDispatcher rd = request.getRequestDispatcher(tipoEEndereco[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(tipoEEndereco[1]);
		}
		
	}

}
