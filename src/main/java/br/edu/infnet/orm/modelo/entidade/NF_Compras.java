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
public class NF_Compras extends NotaFiscal{
    
    private String descricaoProduto;
    private Date dataCompra;
    private int codigoFornecedor;
    
    
    
    public NF_Compras(TipoNota tipo, String tipoNota) {
        super(tipo, tipoNota);
    }

    /**
     * @return the descricaoProduto
     */
    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    /**
     * @param descricaoProduto the descricaoProduto to set
     */
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    /**
     * @return the dataCompra
     */
    public Date getDataCompra() {
        return dataCompra;
    }

    /**
     * @param dataCompra the dataCompra to set
     */
    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    /**
     * @return the codigoFornecedor
     */
    public int getCodigoFornecedor() {
        return codigoFornecedor;
    }

    /**
     * @param codigoFornecedor the codigoFornecedor to set
     */
    public void setCodigoFornecedor(int codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    public NF_Compras(String descricaoProduto, Date dataCompra, int codigoFornecedor, Long idNota, String numero, Integer quantidade, Double valorUnidade, Double valorTotal, TipoNota tipo, String tipoNota) {
        super(idNota, numero, quantidade, valorUnidade, valorTotal, tipo, tipoNota);
        this.descricaoProduto = descricaoProduto;
        this.dataCompra = dataCompra;
        this.codigoFornecedor = codigoFornecedor;
    }
    
    
    
}
