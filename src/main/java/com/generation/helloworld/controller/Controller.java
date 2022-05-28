package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {
		
	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Orientação ao Futuro<br/>"
				+ "Responsabilidade Pessoal<br/>"
				+ "Mentalidade de Crescimento<br/>"
				+ "Persistência<br/>"
				+ "Trabalho em Equipe<br/>"
				+ "Atenção aos Detalhes<br/>"
				+ "Proatividade<br/>"
				+ "Comunicação";
	}
	
	@GetMapping("/obj")
	public String obj() {
		
		return "Aprender a mexer no MySQL sem levar uma surra<br/>"
				+ "Ler sobre e assistir vídeos de STS<br/>"
				+ "Entregar minhas atividades dentro do prazo determinado<br/>"
				+ "Ser mais ativa nas aulas técnicas";
	}
}
	