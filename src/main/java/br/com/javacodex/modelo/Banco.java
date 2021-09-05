package br.com.javacodex.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.javacodex.modelo.Cliente;

public class Banco {
	
	private static List<Cliente> lista = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	
	static {
		Cliente cliente = new Cliente();
		cliente.setId(chaveSequencial++);
		cliente.setNome("Alex");
		cliente.setSobrenome("Ferreira Leite");
		cliente.setIdade("48");
		cliente.setCelular("21-988472754");
				
		Cliente cliente2 = new Cliente();
		cliente2.setId(chaveSequencial++);
		cliente2.setNome("Flávia");
		cliente2.setSobrenome("de Azevedo Ferreira Leite");
		cliente2.setIdade("43");
		cliente2.setCelular("21-988332754");	

		lista.add(cliente);
		lista.add(cliente2);
		
		Usuario u1 = new Usuario();
		u1.setLogin("Alex");
		u1.setSenha("01234");
		
		Usuario u2 = new Usuario();
		u2.setLogin("Flávia");
		u2.setSenha("56789");
		
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
		
		}
	

	public static List<Cliente> getLista() {
		return lista;
	}

	public static void setLista(List<Cliente> lista) {
		Banco.lista = lista;
	}
	
	public List<Cliente> getCliente(){
		return Banco.lista;
	}

	public void adicionar(Cliente cliente) {
		cliente.setId(chaveSequencial++);
		lista.add(cliente);
		
	}
	
	public void removerCliente(Integer id) {
		
		Iterator<Cliente> it = lista.iterator();
		
		while(it.hasNext()) {
			
			Cliente cli = it.next();
			
			if(cli.getId() == id) {
				it.remove();
			}
			
		}
	}

	public Cliente buscaClientePeloId(Integer id) {
		for(Cliente cliente : lista) {
			if(cliente.getId() == id) {
				return cliente;
			}
		}
		return null;
	}

	public Usuario existeUsuario(String login, String senha) {
		for (Usuario usuario: listaUsuarios) {
			if(usuario.heIgual(login, senha)) {
				return usuario;
			}
		}
		return null;
	}


}
