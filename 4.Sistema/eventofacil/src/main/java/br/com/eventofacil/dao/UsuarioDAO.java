package br.com.eventofacil.dao;
/**
 * UsuarioDAO.java
 * Versão: <versaoDoArquivo>
 * Data de Criação: 27/10/2017
 * Copyright (c) 2017 UFG - www.ufg.br
 * Todos os direitos reservados.
 *
 * Este software tem o propósito de gerir campeonatos de futebol.
 */
import java.util.List; 

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import br.com.eventofacil.model.Usuario;

@Repository
public class UsuarioDAO implements UserDetailsService {
	
    /** 
	 * Instacia do configurador do UsuarioDAO
	 */
	@PersistenceContext
	private EntityManager manager;
	
	/** 
	 * Valida se o usuário existe, e caso exista é instanciado
	 * @return instancia do usuário
	 * @throws usuário não encontrado
	 */
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		List<Usuario> usuarios = manager.createQuery("select u from Usuario u where u.email = :email", Usuario.class)
				.setParameter("email", email).getResultList();

		if (usuarios.isEmpty()) {
			throw new UsernameNotFoundException("O usuário " + email + " não foi encontrado");
		}

		return usuarios.get(0);
	}

}
