package br.com.bytebank.banco.test.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestDesiarizacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		
		ContaCorrente cc = (ContaCorrente) ois.readObject();
		
		System.out.println(cc.getAgencia());
		System.out.println(cc.getNumero());
		System.out.println(cc.getTitular());
	}

}
