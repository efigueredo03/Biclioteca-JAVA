package br.com.localhost.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public void rodarServer() throws IOException {
		
		ServerSocket servidor = new ServerSocket(40000);
		System.out.println("Porta 40000 aberta");
		System.out.println("Servidor esperando conexões");
		
		while (true) {
			
			Socket socket = servidor.accept();
			System.out.format("Cliente %s conectado", socket.getInetAddress().getHostAddress());
			
		}
		
	}
	
}
