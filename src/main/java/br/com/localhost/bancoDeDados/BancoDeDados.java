package br.com.localhost.bancoDeDados;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import br.com.localhost.usuario.TiposDeUsuarios;
import br.com.localhost.usuario.Usuario;

public class BancoDeDados {
	
	private Serializador serializador;
	private Desserializador desserializador;

	private ArrayList<Usuario> armazenamentoAdministradores;
	private ArrayList<Usuario> armazenamentoFuncionarios;
	private ArrayList<Usuario> armazenamentoPessoas;
	
	private Map<TiposDeUsuarios, ArrayList<Usuario>> armazenamentoUsuarios;
	
	public BancoDeDados() {
		this.serializador = new Serializador();
		this.desserializador = new Desserializador();
		
		this.armazenamentoAdministradores = new ArrayList<Usuario>();
		this.armazenamentoFuncionarios = new ArrayList<Usuario>();
		this.armazenamentoPessoas = new ArrayList<Usuario>();
		this.armazenamentoUsuarios = new HashMap<TiposDeUsuarios, ArrayList<Usuario>>();
		this.armazenamentoUsuarios.put(TiposDeUsuarios.ADMINISTRADOR, armazenamentoAdministradores);
		this.armazenamentoUsuarios.put(TiposDeUsuarios.FUNCIONARIO, armazenamentoFuncionarios);
		this.armazenamentoUsuarios.put(TiposDeUsuarios.PESSOA, armazenamentoPessoas);
	}
	
	public void adicionarUsuario(Usuario usuario, TiposDeUsuarios tipo) {
		ArrayList<Usuario> armazenamento = this.armazenamentoUsuarios.get(tipo);
		if (!armazenamento.contains(usuario)) {
			armazenamento.add(usuario);
			System.out.println("Usuario adiconado");
			return;
		}
		System.out.println("Usuário já existe no sistema");
	}
	
	public Usuario retornarUsuario(String cpf, TiposDeUsuarios tipo) {
		ArrayList<Usuario> armazenamento = this.armazenamentoUsuarios.get(tipo);
		for (Usuario usuario : armazenamento) {
			if (usuario.getCpf().equals(cpf)) {
				System.out.println("Usuário encontrado");
				return usuario;
			}
		}
		System.out.println("Usuário não existe no sistema");
		return null;
	}
	
	public void removerUsuario(Usuario usuario, TiposDeUsuarios tipo) {
		ArrayList<Usuario> armazenamento = this.armazenamentoUsuarios.get(tipo);
		if (armazenamento.contains(usuario)) {
			armazenamento.remove(usuario);
			System.out.println("Usuário removido");
			return;
		}
		System.out.println("Usuário não existe no sistema");
	}
	
	public ArrayList<Usuario> retornarListaDeUsuarios(TiposDeUsuarios tipo) {
		return (ArrayList<Usuario>) Collections.unmodifiableList(this.armazenamentoUsuarios.get(tipo));
	}
	
	public void salvarBancoDeDados() throws IOException {
		this.serializador.serializar("C:\\Users\\emano\\OneDrive\\Área de Trabalho\\Biblioteca\\src\\main\\java\\br\\com\\localhost\\bancoDeDados\\armazenamento_usuarios.dat", this.armazenamentoUsuarios);
	}
	
	public void abrirBancoDeDados() throws ClassNotFoundException, IOException {
		this.desserializador.desserializar("C:\\Users\\emano\\OneDrive\\Área de Trabalho\\Biblioteca\\src\\main\\java\\br\\com\\localhost\\bancoDeDados\\armazenamento_usuarios.dat");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
