/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.iphoneFactory.builder;

import AbstractFactory.iphoneFactory.countryRules.certificado.Certificado;
import AbstractFactory.iphoneFactory.countryRules.countryRulesFactory.CountryRules;
import AbstractFactory.iphoneFactory.countryRules.embalagem.Embalagem;

/**
 *
 * @author 99039833
 */
public abstract class Celular {
    private String nome;
    private Integer ano;
    private Boolean produzido = Boolean.TRUE;
    private final Certificado certificado;
    private final Embalagem embalagem;
    
    
    public Celular(CountryRules rules) {
        certificado = rules.getCertificado();
        embalagem   = rules.getEmbalagem();
    }

    public Celular(String nome, Integer ano, Certificado certificado, Embalagem embalagem) {
        this.nome = nome;
        this.ano = ano;
        this.certificado = certificado;
        this.embalagem = embalagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Boolean getProduzido() {
        return produzido;
    }

    public void setProduzido(Boolean produzido) {
        this.produzido = produzido;
    }

    public Certificado getCertificado() {
        return certificado;
    }

    public Embalagem getEmbalagem() {
        return embalagem;
    }
   
}
