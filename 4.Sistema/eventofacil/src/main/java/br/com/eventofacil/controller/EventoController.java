package br.com.eventofacil.controller;
/**
 * EventoController.java 
 * Versão: <versaoDoArquivo>
 * Data de Criação: 27/10/2017
 * Copyright (c) 2017 UFG - www.ufg.br
 * Todos os direitos reservados.
 *
 * Este software tem o propósito de gerir campeonatos de futebol.
 */
import org.springframework.beans.factory.annotation.Autowired;   
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.eventofacil.model.Evento;
import br.com.eventofacil.service.EventoService;

@Controller
@RequestMapping("/Evento")
public class EventoController {
    
	@Autowired
	private EventoService EventoService;
	
	@RequestMapping("/")
    public ModelAndView listarEvento() {
    	ModelAndView modelAndView = new ModelAndView("Evento/listar-Evento", "command", new Evento());
    	modelAndView.addObject("titulo", "Eventos");
		modelAndView.addObject("Eventos", EventoService.listarEventos());
		return modelAndView;
    }

	@RequestMapping("/pesquisar")
    public ModelAndView pesquisarEvento(Evento Evento) {
		ModelAndView modelAndView = new ModelAndView("Evento/listar-Evento", "command", Evento);
    	modelAndView.addObject("titulo", "Eventos");
    	modelAndView.addObject("Eventos", EventoService.pesquisarEventos(Evento));
    	return modelAndView;
    }

	@RequestMapping("/cadastro")
    public ModelAndView cadastrarEvento() {
		ModelAndView modelAndView = new ModelAndView("Evento/cadastrar-Evento", "command", new Evento());
		modelAndView.addObject("titulo", "Cadastrar Evento");
		//modelAndView.addObject("generos", Genero.values()); - Exemplo para add outro atributo
		return modelAndView;
    }
	
	@RequestMapping("/editar")
    public ModelAndView editarEvento(Long id) {
		Evento Evento = EventoService.consultarEvento(id);
		ModelAndView modelAndView = new ModelAndView("Evento/cadastrar-Evento", "command", Evento);
		return modelAndView;
    }

	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public ModelAndView salvarEvento(Evento Evento) {
		EventoService.salvarEvento(Evento);

    	return listarEvento();
    }
	
	/*
	 * Exemplo de como chamar outra função
	 */
	@RequestMapping("/exibir")
    public ModelAndView exibirNumeros(Long id) {
    	ModelAndView modelAndView = new ModelAndView("Evento/exibir-numeros");
    	modelAndView.addObject("titulo", "Exibir numeros");
		modelAndView.addObject("Eventos", EventoService.pesquisarJogadores(id));
    	return modelAndView;
    }

	@RequestMapping(value = "/excluir")
	public ModelAndView excluirEvento(Long id) {
		Evento Evento = EventoService.consultarEvento(id);
		EventoService.deletarEvento(Evento);

		return listarEvento();
	}
	
}
