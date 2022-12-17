/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author Leonardo
 */
@Entity
public class NotaFiscal extends Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idNota;

    private String numero;
    
    private Integer quantidade;
    
    private Double valorUnidade;
    
    private Double valorTotal;

    @Column(name = "tipo_nota")
    @Enumerated(EnumType.STRING)
    private TipoNota tipo;
    
    private String tipoNota;
    
    public NotaFiscal(TipoNota tipo, String tipoNota) {
		super();
		this.tipo = tipo;
		this.tipoNota = tipoNota;
	}
    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the tipo
     */
    public TipoNota getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoNota tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the tipoNota
     */
    public String getTipoNota() {
        return tipoNota;
    }

    /**
     * @param tipoNota the tipoNota to set
     */
    public void setTipoNota(String tipoNota) {
        this.tipoNota = tipoNota;
    }

    /**
     * @return the quantidade
     */
    public Integer getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valorUnidade
     */
    public Double getValorUnidade() {
        return valorUnidade;
    }

    /**
     * @param valorUnidade the valorUnidade to set
     */
    public void setValorUnidade(Double valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    /**
     * @return the valorTotal
     */
    public Double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the idNota
     */
    public Long getIdNota() {
        return idNota;
    }

    /**
     * @param idNota the idNota to set
     */
    public void setIdNota(Long idNota) {
        this.idNota = idNota;
    }

    public NotaFiscal(Long idNota, String numero, Integer quantidade, Double valorUnidade, Double valorTotal, TipoNota tipo, String tipoNota) {
        this.idNota = idNota;
        this.numero = numero;
        this.quantidade = quantidade;
        this.valorUnidade = valorUnidade;
        this.valorTotal = valorTotal;
        this.tipo = tipo;
        this.tipoNota = tipoNota;
    }

}
