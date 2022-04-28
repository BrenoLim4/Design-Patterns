/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.iphoneFactory.countryRules.countryRulesFactory;

import AbstractFactory.iphoneFactory.countryRules.certificado.Certificado;
import AbstractFactory.iphoneFactory.countryRules.certificado.TipoCelular;
import AbstractFactory.iphoneFactory.countryRules.certificado.china.CertificadoChinaIphone;
import AbstractFactory.iphoneFactory.countryRules.certificado.china.CertificadoChinaXiaomi;
import AbstractFactory.iphoneFactory.countryRules.embalagem.Embalagem;
import AbstractFactory.iphoneFactory.countryRules.embalagem.china.EmbalagemChinaIphone;
import AbstractFactory.iphoneFactory.countryRules.embalagem.china.EmbalagemChinaXiaomi;


public class CountryRulesChina extends CountryRules {

    public CountryRulesChina(TipoCelular marca) {
        super(marca);
    }
    
    
    @Override
    public Certificado getCertificado() {
        return marca.equals(TipoCelular.IPHONE) ? new CertificadoChinaIphone() : new CertificadoChinaXiaomi();
    }

    @Override
    public Embalagem getEmbalagem() {
        return marca.equals(TipoCelular.IPHONE) ? new EmbalagemChinaIphone() : new EmbalagemChinaXiaomi();
    }
    
}
