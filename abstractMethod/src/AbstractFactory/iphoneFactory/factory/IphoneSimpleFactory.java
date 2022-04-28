/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.iphoneFactory.factory;

import AbstractFactory.iphoneFactory.countryRules.certificado.TipoCelular;
import AbstractFactory.iphoneFactory.countryRules.countryRulesFactory.Country;
import AbstractFactory.iphoneFactory.iphone.geracoes.Iphone;

/**
 *
 * @author 99039833
 */
public class IphoneSimpleFactory {
    
    private IphoneSimpleFactory(){        
    }
    
    public static Iphone orderIphone(IphoneFactory iphoneFactory, Country country){        
        return iphoneFactory.factory(country.getCountryRules(TipoCelular.IPHONE));
    }

}
