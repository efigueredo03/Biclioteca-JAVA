package br.com.localhost.interfaces;

import java.util.Scanner;

import br.com.localhost.bancoDeDados.BancoDeDados;

public abstract class Interface {

	protected BancoDeDados referenciaDataBase;
	private Scanner scan;
	
	public Interface(BancoDeDados db) {
		this.referenciaDataBase = db;
		this.scan = new Scanner(System.in);
	}
	
	public String pedirEntrada(String texto) {
		System.out.print(texto);
		return this.scan.nextLine();
	}
	
	public void printTextoFormatado(String texto) {
		int tamanhoDoTexto = texto.length();
		int adicionarDeCadaLado = 25 - (tamanhoDoTexto / 2);
		String resultado = "";
		for (int i = 0; i < adicionarDeCadaLado; i++) {
			resultado += "=";
		}
		resultado += texto;
		for (int i = 0; i < adicionarDeCadaLado; i++) {
			resultado += "=";
		}
		System.out.println("\n" + resultado);
	}
	
	// Um administrador pode adicionar qualquer usuario ao sistema
	
	
}
