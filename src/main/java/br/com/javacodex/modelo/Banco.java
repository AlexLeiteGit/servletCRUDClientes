package br.com.javacodex.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Cliente> lista = new ArrayList<>();

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
		lista.add(cliente);
		
	}

}
