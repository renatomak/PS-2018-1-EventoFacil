package br.com.eventofacil.model;
import java.util.ArrayList;
import java.util.List;

/**
 * Evento.java 
 * Versão: <versaoDoArquivo>
 * Data de Criação: 27/10/2017
 * Copyright (c) 2017 UFG - www.ufg.br
 * Todos os direitos reservados.
 *
 * Este software tem o propósito de gerir campeonatos de futebol.
 */
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by astr1x on 08/07/17.
 */

@Entity
public class Evento extends Entidade {
	
	/** 
	 * Instacia do serialVersionUID do Evento
	 */
	private static final long serialVersionUID = -3086085358857810874L;
	
	/** 
	 * Instacia do nome do Evento
	 */
	@Column(nullable = false)
    private String nome;
    
    /**
     * Instancia do capitao do Evento
     */
    @Column(nullable = false)
    private Long capitao;
    
	/** 
	 * Retorna o nome do Evento
	 * @return nome do Evento
	 */
    @Column(nullable = false)
    public String getNome() {
        return nome;
    }
    
    /** 
	 * Atribui o parâmetro nome como nome do Evento
	 * @param nome - nome que será atribuido ao Evento
	 */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * Retorna o capitao do Evento
     * @param capitao
     */
    public Long getCapitao() {
    	return capitao;
    }
    
    /**
     * Atribui o parâmetro capitao como capitao do Evento
     * @param idJogador - capitao que será atribuido ao Evento
     */
    public void setCapitao(Long idJogador) {
    	this.capitao = idJogador;
    }

}
