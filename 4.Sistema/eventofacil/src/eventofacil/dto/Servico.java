/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventofacil.dto;

/**
 *
 * @author renato
 */
public class Servico {

    private Fornecedor fornecedor;
    private String nomeServico;
    private String descricao;
    private Double valor;
    private String tipoServiço;
    private String localizacao; //cidade

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipoServiço() {
        return tipoServiço;
    }

    public void setTipoServiço(String tipoServiço) {
        this.tipoServiço = tipoServiço;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void criaServico() {

    }

    public void excluiServico() {

    }

    public void alteraServico() {

    }

    public void atualizaServico() {

    }


}
