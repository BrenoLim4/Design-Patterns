/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.iphoneFactory.countryRules.countryRulesFactory;

import AbstractFactory.iphoneFactory.countryRules.certificado.TipoCelular;

/**
 *
 * @author 99039833
 */
public enum Country {
    BRASIL("Brasil"){
        @Override
        public CountryRules getCountryRules(TipoCelular marca) {
            return new CountryRulesBrasil(marca);
        }
    }, ESTADOS_UNIDOS("Estados Unidos") {
        @Override
        public CountryRules getCountryRules(TipoCelular marca) {
            return new CountryRulesEUA(marca);
        }
    }, CHINA("China") {
        @Override
        public CountryRules getCountryRules(TipoCelular marca) {
             return new CountryRulesChina(marca);
        }
    };
    
    private final String nome;
    
    Country(String nome){
        this.nome = nome;
    }
    
    public abstract CountryRules getCountryRules(TipoCelular marca);

    public String getNome() {
        return nome;
    }
    
    
}
