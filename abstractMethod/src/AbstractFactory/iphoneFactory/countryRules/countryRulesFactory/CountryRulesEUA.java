/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.iphoneFactory.countryRules.countryRulesFactory;

import AbstractFactory.iphoneFactory.countryRules.embalagem.Embalagem;
import AbstractFactory.iphoneFactory.countryRules.certificado.Certificado;
import AbstractFactory.iphoneFactory.countryRules.certificado.EUA.CertificadoEUA;
import AbstractFactory.iphoneFactory.countryRules.certificado.EUA.CertificadoEUAIphone;
import AbstractFactory.iphoneFactory.countryRules.certificado.EUA.CertificadoEUAXiaomi;
import AbstractFactory.iphoneFactory.countryRules.certificado.TipoCelular;
import AbstractFactory.iphoneFactory.countryRules.embalagem.EUA.EmbalagemEUA;
import AbstractFactory.iphoneFactory.countryRules.embalagem.EUA.EmbalagemEUAIphone;
import AbstractFactory.iphoneFactory.countryRules.embalagem.EUA.EmbalagemEUAXiaomi;

/**
 *
 * @author 99039833
 */
public class CountryRulesEUA extends CountryRules{

    public CountryRulesEUA(TipoCelular marca) {
        super(marca);
    }

    @Override
    public Certificado getCertificado() {
        return marca.equals(TipoCelular.IPHONE) ? new CertificadoEUAIphone() : new CertificadoEUAXiaomi();
    }

    @Override
    public Embalagem getEmbalagem() {
        return marca.equals(TipoCelular.IPHONE) ? new EmbalagemEUAIphone() : new EmbalagemEUAXiaomi();
    }
    
}
