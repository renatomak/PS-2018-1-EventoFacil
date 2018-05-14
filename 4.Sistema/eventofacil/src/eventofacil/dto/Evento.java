/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventofacil.dto;

import java.util.List;
import javax.xml.crypto.Data;

/**
 *
 * @author renato
 */
public class Evento {
    
    private String nomeEvento;
    private Pessoa pessoa;
    private Data dataEvento;
    private String Tipo;
    private List<Servico> servicoDTOList;

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Data getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Data dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public List<Servico> getServicoDTOList() {
        return servicoDTOList;
    }

    public void setServicoDTOList(List<Servico> servicoDTOList) {
        this.servicoDTOList = servicoDTOList;
    }
    
    
    public void criaEvento(){
        
    }
    
    public void excluiEvento(){
        
    }
    
    public void alteraEvento(){
        
    }
    
    public void atualizaEvento(){
        
    }
    
    
    public void confirmaEvento(){
        
    }
    
    public void acessarRelatorioDoEvento(){
        
    }
    
    
    
}
