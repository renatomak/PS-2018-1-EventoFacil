package br.com.eventofacil.model;

/**
 * Evento.java 
 * Versão: <versaoDoArquivo>
 * Data de Criação: 27/10/2017
 * Copyright (c) 2017 UFG - www.ufg.br
 * Todos os direitos reservados.
 *
 * Este software tem o propósito de gerir campeonatos de futebol.
 */

import org.junit.Test;

import br.com.eventofacil.model.Evento;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Classe feita para testar objeto Evento
 */
public class EventoTeste extends TestCase {
	Evento Evento = new Evento();
	long id = 123;
	String test = "igor";
	
	/** 
	 * testa consulta do nome do Evento
	 */
	@Test
    private void defineEvento() {
		Evento.setCapitao(id);
		Evento.setId(id);
		Evento.setNome(test);
	}
	
	/** 
	 * testa consulta do nome do Evento
	 */
	@Test
    private void EventoConsultaNomeTeste() {
		defineEvento();
		Assert.assertEquals(test, Evento.getNome());
	}
	
	/** 
	 * testa consulta do id do capitao do Evento
	 */
	@Test
    private void EventoConsultaCapitaoTeste() {
		defineEvento();
		//Assert.assertEquals(123, Evento.getCapitao());
	}
	
	/** 
	 * testa consulta do id do capitao do Evento
	 */
	@Test
    private void EventoConsultaIDTeste() {
		defineEvento();
		//Assert.assertEquals(id, Evento.getId());
	}

}
