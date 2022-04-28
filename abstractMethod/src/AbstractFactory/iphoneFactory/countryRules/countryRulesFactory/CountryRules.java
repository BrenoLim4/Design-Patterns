/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.iphoneFactory.countryRules.countryRulesFactory;

import AbstractFactory.iphoneFactory.countryRules.certificado.Certificado;
import AbstractFactory.iphoneFactory.countryRules.certificado.TipoCelular;
import AbstractFactory.iphoneFactory.countryRules.embalagem.Embalagem;

/**
 *
 * @author 99039833
 */
public abstract class CountryRules {

    protected final TipoCelular marca;
    public CountryRules(TipoCelular marca) {
        this.marca = marca;
    }
        
    public abstract Certificado getCertificado();
    public abstract Embalagem getEmbalagem();
}
