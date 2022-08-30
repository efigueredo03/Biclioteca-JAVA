package br.com.localhost.teste;

import java.io.IOException;

import br.com.localhost.bancoDeDados.BancoDeDados;
import br.com.localhost.usuario.Administrador;
import br.com.localhost.usuario.TiposDeUsuarios;
import br.com.localhost.usuario.Usuario;

public class TesteBancoDeDados {

	public static void main(String[] args) throws IOException {
		
		Usuario user = new Administrador("emanoel", "efigueredo", "wall2003", "50195382803");
		
		BancoDeDados db = new BancoDeDados();
		Usuario amd1 = db.retornarUsuario("50195382803", TiposDeUsuarios.ADMINISTRADOR);
		db.retornarListaDeUsuarios("")
		
		
	}
	
}
