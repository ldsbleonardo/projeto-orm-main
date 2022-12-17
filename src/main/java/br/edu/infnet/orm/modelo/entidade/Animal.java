/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
  
    private String nomeAnimal;
    private String raca;
    private Integer idade;
    private Double pesoAnimal;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }
    
    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }
   
    public String getRaca() {
        return raca;
    }
   
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
    public Double getPesoAnimal() {
        return pesoAnimal;
    }
    
    public void setPesoAnimal(Double pesoAnimal) {
        this.pesoAnimal = pesoAnimal;
    }

}
