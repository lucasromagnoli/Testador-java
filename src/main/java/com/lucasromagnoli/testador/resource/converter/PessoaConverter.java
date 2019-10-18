package com.lucasromagnoli.testador.resource.converter;

import com.lucasromagnoli.testador.resource.PessoaResource;

public class PessoaConverter {

	public static void alterarNome(PessoaResource pessoa) {
		pessoa.setNome(pessoa.getNome().trim()+" Convertido");
		System.out.println(pessoa);
	}
}
