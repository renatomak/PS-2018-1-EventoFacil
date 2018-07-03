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

import javax.persistence.Entity;

@Entity
public class Partida extends Entidade {
	
	/** 
	 * Instacia do serialVersionUID do Evento
	 */
	private static final long serialVersionUID = -9125277018717732648L;
    
    /** 
	 * Quantidade de gols do evento 1
	 */
    private Integer golsEvento1;
    
    /** 
	 * Quantidade de gols do evento 2
	 */
    private Integer golsEvento2;
    
	/** 
	 * Define se a partida empatou ou não
	 */
    private boolean empate = false;
    
    /** 
	 * Campeonato
	 */
    private long idDoCampeonato;
	
	/** 
	 * Retorna quantidade de gols do evento1
	 * @return nome da Partida
	 */
    public Integer getGolsEvento1() {
		return golsEvento1;
    }
    
	/** 
	 * Adiciona a quantidade de gols do evento1
	 */
    public void setGolsEvento1(Integer golsEvento) {
    	this.golsEvento1 = golsEvento;
		setConsultaEmpate();
    }
    
	/** 
	 * Retorna quantidade de gols do evento2
	 * @return nome da Partida
	 */
    public Integer getGolsEvento2() {
		return golsEvento2;
    }
    
    /** 
	 * Adiciona a quantidade de gols do evento2
	 * @return nome da Partida
	 */
    public void setGolsEvento2(Integer golsEvento) {
		this.golsEvento2 = golsEvento;
		setConsultaEmpate();
    }
    
    public void setConsultaEmpate() {
    	if(this.golsEvento1 == this.golsEvento2) {
        	this.empate = true;
        }
        else this.empate = false;
    }
    
	/** 
	 * Retorna quantidade de gols do evento1
	 * @return nome da Partida
	 */
    public long getIdCampeonato() {
		return this.idDoCampeonato;
    }
    
	/** 
	 * Adiciona a quantidade de gols do evento1
	 */
    public void setIdCampeonato(long idDoCampeonato) {
    	this.idDoCampeonato = idDoCampeonato;
    }
}
