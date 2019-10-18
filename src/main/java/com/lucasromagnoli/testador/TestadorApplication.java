package com.lucasromagnoli.testador;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lucasromagnoli.testador.resource.PessoaResource;
import com.lucasromagnoli.testador.resource.converter.PessoaConverter;

@SpringBootApplication
public class TestadorApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TestadorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		PessoaResource pessoa = new PessoaResource();
		pessoa.setCidade("Goi¿nia");
		pessoa.setNome("           Lucas               ");
		PessoaConverter.alterarNome(pessoa);
		System.out.println(pessoa);
	}

}
