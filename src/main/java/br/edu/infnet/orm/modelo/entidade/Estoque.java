package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.Entity;
import java.util.Date;

@Entity
public class Estoque extends Produto {

    private Long codigoEstoque;
    private Integer quantidade;
    private String localizacao;

    private Date dataEntradaProduto;
    private Date dataFabricacaoProduto;
    private Date dataVencimentoProduto;

    /**
     * @return the codigoEstoque
     */
    public Long getCodigoEstoque() {
        return codigoEstoque;
    }

    /**
     * @param codigoEstoque the codigoEstoque to set
     */
    public void setCodigoEstoque(Long codigoEstoque) {
        this.codigoEstoque = codigoEstoque;
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
     * @return the localizacao
     */
    public String getLocalizacao() {
        return localizacao;
    }

    /**
     * @param localizacao the localizacao to set
     */
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    /**
     * @return the dataEntradaProduto
     */
    public Date getDataEntradaProduto() {
        return dataEntradaProduto;
    }

    /**
     * @param dataEntradaProduto the dataEntradaProduto to set
     */
    public void setDataEntradaProduto(Date dataEntradaProduto) {
        this.dataEntradaProduto = dataEntradaProduto;
    }

    /**
     * @return the dataFabricacaoProduto
     */
    public Date getDataFabricacaoProduto() {
        return dataFabricacaoProduto;
    }

    /**
     * @param dataFabricacaoProduto the dataFabricacaoProduto to set
     */
    public void setDataFabricacaoProduto(Date dataFabricacaoProduto) {
        this.dataFabricacaoProduto = dataFabricacaoProduto;
    }

    /**
     * @return the dataVencimentoProduto
     */
    public Date getDataVencimentoProduto() {
        return dataVencimentoProduto;
    }

    /**
     * @param dataVencimentoProduto the dataVencimentoProduto to set
     */
    public void setDataVencimentoProduto(Date dataVencimentoProduto) {
        this.dataVencimentoProduto = dataVencimentoProduto;
    }

}
