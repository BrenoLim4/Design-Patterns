/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.iphoneFactory.countryRules.countryRulesFactory;

import AbstractFactory.iphoneFactory.countryRules.embalagem.Embalagem;
import AbstractFactory.iphoneFactory.countryRules.certificado.Certificado;
import AbstractFactory.iphoneFactory.countryRules.certificado.TipoCelular;
import AbstractFactory.iphoneFactory.countryRules.certificado.brasil.CertificadoBrasilIphone;
import AbstractFactory.iphoneFactory.countryRules.certificado.brasil.CertificadoBrasilXiaomi;
import AbstractFactory.iphoneFactory.countryRules.embalagem.brasil.EmbalagemBrasilIphone;
import AbstractFactory.iphoneFactory.countryRules.embalagem.brasil.EmbalagemBrasilXiaomi;

/**
 *
 * @author 99039833
 */
public class CountryRulesBrasil extends CountryRules{

    public CountryRulesBrasil(TipoCelular marca) {
        super(marca);
    }

    @Override
    public Certificado getCertificado() {
        return marca.equals(TipoCelular.IPHONE) ? new CertificadoBrasilIphone() : new CertificadoBrasilXiaomi();
    }

    @Override
    public Embalagem getEmbalagem() {
        return marca.equals(TipoCelular.IPHONE) ? new EmbalagemBrasilIphone() : new EmbalagemBrasilXiaomi();
    }
    
}
