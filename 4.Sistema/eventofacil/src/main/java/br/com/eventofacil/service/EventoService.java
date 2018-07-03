package br.com.eventofacil.service;

import java.text.SimpleDateFormat; 
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eventofacil.model.Jogador;
import br.com.eventofacil.model.Evento;
import br.com.eventofacil.repository.EventoRepository;

/**
 * Created by astr1x on 08/07/17.
 */

@Service
public class EventoService {

    @Autowired
    private EventoRepository EventoRepository;
    
    @PersistenceContext
	private EntityManager manager;
    
    private static final SimpleDateFormat FORMATO_DATA = new SimpleDateFormat("yyyy-MM-dd");

    public Evento salvarEvento(Evento Evento) {
        Evento = EventoRepository.save(Evento);
        return Evento;
    }

    public List<Evento> listarEventos() {
        return EventoRepository.findAll();
    }

    public void deletarEvento(Evento Evento) {
        EventoRepository.delete(Evento);
    }

    public Evento consultarEvento(Long id) {
        return EventoRepository.findOne(id);
    }
    
    public List<Evento> pesquisarEventos(Evento Evento) {
    	StringBuilder query = new StringBuilder();
		query.append("select * from Evento where 1=1");
    	
    	if (!Evento.getNome().isEmpty()) {
    		query.append(" and LOWER(nome) like LOWER('%")
    		.append(Evento.getNome())
    		.append("%')");
    	}
    	
    	if (Evento.getCapitao() != null) {
    		query.append(" and capitao = ")
    		.append(Evento.getCapitao());
    	}
    	
    	Query typeQuery = manager.createNativeQuery(query.toString(), Evento.class);
    	List<Evento> Eventos = typeQuery.getResultList();
    	
		return Eventos;
    }
    
    public List<Jogador> pesquisarJogadores(Long idEvento) {
    	StringBuilder query = new StringBuilder();
		query.append("select * from jogador where 1=1");
    	query.append(" and LOWER(idEvento) like LOWER('%")
    		 .append(idEvento)
    		 .append("%')");
    	
    	Query typeQuery = manager.createNativeQuery(query.toString(), Jogador.class);
    	List<Jogador> jogadores = typeQuery.getResultList();
    	
		return jogadores;
    }
}
