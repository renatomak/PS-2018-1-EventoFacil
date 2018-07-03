package br.com.eventofacil.controller;
import javax.persistence.Entity;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.eventofacil.controller.EventoController;
import br.com.eventofacil.model.Evento;
import junit.framework.Assert;
import junit.framework.Test;

@Entity
@RequestMapping("/Evento")
public class EventoControllerTeste {

	@Autowired
	private EventoController EventoController;
	/*
    public void testaListarEvento() {
    	EventoController.class.
        Assert.assertTrue(Palindromo.ehPalindromo(PALINDROMO_6));
        
    }
    public void testaPesquisarEvento() {
    	Assert.assertTrue(Palindromo.ehPalindromo(PALINDROMO_7));
    }
    
    public void testaCadastrarEvento() {
        Assert.assertFalse(Palindromo.ehPalindromo(PALINDROMO_10));
    }
    
    public void testaEditarEvento() {
    	Assert.assertFalse(Palindromo.ehPalindromo(PALINDROMO_8));
    }
	
    public void testaSalvarEvento() {
    	Assert.assertFalse(Palindromo.ehPalindromo(PALINDROMO_8));
    }
    
    public void testaExcluirEvento() {
    	Assert.assertFalse(Palindromo.ehPalindromo(PALINDROMO_8));
    }
    */
}
