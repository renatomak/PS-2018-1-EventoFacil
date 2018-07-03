package br.com.eventofacil.repository;
/**
 * EventoRepository.java 
 * Versão: <versaoDoArquivo>
 * Data de Criação: 27/10/2017
 * Copyright (c) 2017 UFG - www.ufg.br
 * Todos os direitos reservados.
 *
 * Este software tem o propósito de gerir campeonatos de futebol.
 */
import org.springframework.stereotype.Repository;

import br.com.eventofacil.model.Evento;

@Repository
public interface EventoRepository extends MyJpaRepository<Evento> {

}
