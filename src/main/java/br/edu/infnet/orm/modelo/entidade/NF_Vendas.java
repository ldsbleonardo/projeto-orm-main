/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.Entity;
import java.util.Date;

/**
 *
 * @author Leonardo
 */
@Entity
public class NF_Vendas extends NotaFiscal{
    
    private Integer idCodigoCliente;
    private Date dataVenda;
    private Double valorVenda;
    
    
    public NF_Vendas(TipoNota tipo, String tipoNota) {
        super(tipo, tipoNota);
    }

    /**
     * @return the idCodigoCliente
     */
    public Integer getIdCodigoCliente() {
        return idCodigoCliente;
    }

    /**
     * @param idCodigoCliente the idCodigoCliente to set
     */
    public void setIdCodigoCliente(Integer idCodigoCliente) {
        this.idCodigoCliente = idCodigoCliente;
    }

    /**
     * @return the dataVenda
     */
    public Date getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     * @return the valorVenda
     */
    public Double getValorVenda() {
        return valorVenda;
    }

    /**
     * @param valorVenda the valorVenda to set
     */
    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
}
