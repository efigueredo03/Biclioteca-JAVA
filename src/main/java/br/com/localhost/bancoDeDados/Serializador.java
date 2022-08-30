package br.com.localhost.bancoDeDados;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializador {

	public void serializar(String path, Object obj) throws IOException {
		FileOutputStream saida = new FileOutputStream(path);
		ObjectOutputStream s = new ObjectOutputStream(saida);
		s.writeObject(obj);
		s.close();
	}
	
}
