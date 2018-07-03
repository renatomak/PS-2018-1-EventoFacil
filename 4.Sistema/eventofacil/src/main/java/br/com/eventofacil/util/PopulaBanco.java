package br.com.eventofacil.util;
/**
 * PopulaBanco.java 
 * Versão: <versaoDoArquivo>
 * Data de Criação: 27/10/2017
 * Copyright (c) 2017 UFG - www.ufg.br
 * Todos os direitos reservados.
 *
 * Este software tem o propósito de gerir campeonatos de futebol.
 */
import java.util.ArrayList; 
import java.util.List;

import javax.annotation.PostConstruct; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.com.eventofacil.model.Jogador;
import br.com.eventofacil.model.Pessoa;
import br.com.eventofacil.model.Evento;
import br.com.eventofacil.repository.MyJpaRepository;
import br.com.eventofacil.repository.EventoRepository;


@Component
public class PopulaBanco {
	/*
	/** 
	 * Instancia as consultas que vão ser usadas.
	 *
    @Autowired
    private CampeonatoRepository campeonatoRepository;
    
	/** 
	 * Instancia as consultas que vão ser usadas.
	 *
    @Autowired
    private PessoaRepository pessoaRepository;
    
	/** 
	 * Instancia as consultas que vão ser usadas.
	 *
    @Autowired
    private JogadorRepository jogadorRepository;
	*/
    
    
   	/** 
   	 * Instancia as consultas que vão ser usadas.
   	 */
       @Autowired
       private EventoRepository EventoRepository;
    
	/** 
	 * Instancia as consultas que vão ser usadas.
	 */
    @Autowired
    private MyJpaRepository myJpaRepository;
    
    /** 
	 * Instancia o configurador
	 */
    @PersistenceContext
    private EntityManager manager;
    
    @PostConstruct
    public void init() {
    	
    	for (Evento Evento : getEventos()) {
            EventoRepository.save(Evento);
        }
    	
    	/*
    	for (Campeonato campeonato : getCampeonatos()) {
            campeonatoRepository.save(campeonato);
        }
    	
    	for (Jogador jogador : getJogadores()) {
    		jogadorRepository.save(jogador);
        }
    	
    	for (Pessoa pessoa : getPessoas()) {
            pessoaRepository.save(pessoa);
        }
    	*/
    	insereDadosAdmin();
    }
    
    private List<Pessoa> getPessoas() {
    	List<Pessoa> pessoas = new ArrayList<>();
    	
    	Pessoa igor = new Pessoa();
    	igor.setNome("igor");
    	igor.setContato(982449069);
    	pessoas.add(igor);
    	
    	Pessoa junior = new Pessoa();
    	igor.setNome("junior");
    	igor.setContato(982449069);
    	pessoas.add(junior);
    	
    	return pessoas;
    }
    
    private List<Jogador> getJogadores() {
    	List<Jogador> jogadores = new ArrayList<>();
    	List<Pessoa> pessoas = getPessoas();
    	
    	Pessoa igor = pessoas.get(0);

    	Jogador jogadorDoEvento1 = new Jogador();
    	jogadorDoEvento1.setNome(igor.getNome());
    	jogadorDoEvento1.setIdPessoa(igor.getId());
    	//jogadorDoEvento1.setIdEvento(123);
    	igor.setListaJogadores(jogadorDoEvento1);
    	jogadores.add(jogadorDoEvento1);
    	
    	return jogadores;
    }
    
    private List<Evento> getEventos() {
    	List<Evento> Eventos = new ArrayList<>();
    	/*List<Jogador> jogadores = getJogadores();
        
        Jogador jogadorDoEvento1 = jogadores.get(0);
        Jogador jogadorDoEvento2 = jogadores.get(0);
        */
    	Evento Evento1 = new Evento();
    	long id = -9125277018717732648L;
        Evento1.setNome("Pelada dos Pernas de Pal");
        Evento1.setCapitao(id);
        Evento1.setId(id);
        
        //adiciona como jogador do Evento
    	/*jogadorDoEvento1.setIdEvento(Evento1.getId());
        Evento1.setCapitao(jogadorDoEvento1.getId());
        */
        Eventos.add(Evento1);
        
        /*
        Evento Evento2 = new Evento();
        Evento2.setNome("Os piratas");

        jogadorDoEvento2.setIdEvento(Evento2.getId());
        Evento2.setCapitao(jogadorDoEvento2.getId());
              
        Eventos.add(Evento2);
        */
        
    	return Eventos;
    }
    
    /*private List<Campeonato> getCampeonatos() {
    	
    	List<Campeonato> campeonatos = new ArrayList<>();
    	List<Evento> Eventos = getEventos();
    	
        Partida partida = new Partida();
        //partida.setGolsEvento1(3);
        //partida.setGolsEvento2(2);
    	
    	Evento Evento1 = Eventos.get(0);
    	Evento Evento2 = Eventos.get(1);
        
    	Campeonato desafio1 = new Campeonato();
    	//desafio1.setListaEventos(Evento1);
    	//desafio1.setListaEventos(Evento2);
    	desafio1.setNome("Primeiro Desafio");
    	desafio1.setDescricao("O melhor campeonato");
    	
    	partida.setIdCampeonato(desafio1.getId());
    	desafio1.setListaPartidas(partida);
    	
        campeonatos.add(desafio1);

    	return campeonatos;
    }*/
    
    /** 
	 * Grava os dados do usuário e a relação com a role no BD
	 */
    @Transactional
    private void insereDadosAdmin() {
        myJpaRepository.insertRole();
        myJpaRepository.insertUsuario();
        myJpaRepository.insertUsuarioRole();
    }
}
