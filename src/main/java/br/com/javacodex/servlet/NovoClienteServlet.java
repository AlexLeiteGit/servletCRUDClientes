package br.com.javacodex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.javacodex.modelo.Banco;
import br.com.javacodex.modelo.Cliente;

@WebServlet("/novoCliente")
public class NovoClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeCliente = request.getParameter("nome");
		String sobrenomeCliente = request.getParameter("sobrenome");
		String idadeCliente = request.getParameter("idade");
		String celularCliente = request.getParameter("celular");
		
		Cliente cliente = new Cliente();
		cliente.setNome(nomeCliente);
		cliente.setSobrenome(sobrenomeCliente);
		cliente.setIdade(idadeCliente);
		cliente.setCelular(celularCliente);
		
		Banco banco = new Banco();
		banco.adicionar(cliente);
		
//		PrintWriter out = response.getWriter();
//		out.println("<html><body>Cliente " + nomeCliente + " Cadastrado com sucesso</body></html>");
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaCliente");
		request.setAttribute("cliente", cliente.getId());
		request.setAttribute("cliente", cliente.getNome());
		request.setAttribute("cliente", cliente.getSobrenome());
		request.setAttribute("cliente", cliente.getIdade());
		request.setAttribute("cliente", cliente.getCelular());
//		request.setAttribute("cliente", cliente.getDataCadastro());
		
		rd.forward(request, response);
		
	}

}
