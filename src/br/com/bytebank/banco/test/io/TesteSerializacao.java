package br.com.bytebank.banco.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Júlio Sandroni");
		cliente.setCpf("33388899944");
		cliente.setProfissao("Dev");
		
		ContaCorrente conta = new ContaCorrente(8890, 2222);
		conta.setTitular(cliente);
		conta.deposita(90000);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		
		oos.writeObject(conta);
		oos.close();
	}

}
