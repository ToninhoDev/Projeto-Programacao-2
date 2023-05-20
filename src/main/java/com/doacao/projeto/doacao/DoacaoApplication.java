package com.doacao.projeto.doacao;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doacao.projeto.doacao.domain.Campanha;
import com.doacao.projeto.doacao.domain.Doacao;
import com.doacao.projeto.doacao.domain.Doador;
import com.doacao.projeto.doacao.domain.Ong;
import com.doacao.projeto.doacao.repositories.CampanhaRepository;
import com.doacao.projeto.doacao.repositories.DoacaoRepository;
import com.doacao.projeto.doacao.repositories.DoadorRepository;
import com.doacao.projeto.doacao.repositories.OngRepository;

@SpringBootApplication
public class DoacaoApplication implements CommandLineRunner {

	@Autowired
	private DoacaoRepository doacaoRepository;

	@Autowired
	private DoadorRepository doadorRepository;

	@Autowired
	private CampanhaRepository campanhaRepository;

	@Autowired
	private OngRepository ongRepository;

	public static void main(String[] args) {
		SpringApplication.run(DoacaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
		
	}

}
