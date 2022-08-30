package br.com.localhost.bancoDeDados;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Desserializador {

	public Object desserializar(String path) throws ClassNotFoundException, IOException {
		FileInputStream input = new FileInputStream(path);
		ObjectInputStream o = new ObjectInputStream(input);
		Object lista = o.readObject();
		o.close();
		return lista;
	}
	
}
