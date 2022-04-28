/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.iphoneFactory.builder;

import AbstractFactory.iphoneFactory.countryRules.countryRulesFactory.Country;
import java.util.Locale;

/**
 *
 * @author 99039833
 */
public class CelularFactory {

    public CelularFactory() {    
    }
    
    public static IphoneFactory IphoneFactory(Country country){
        return new IphoneFactory(country);
    }
    
    public static XiaomiFactory XiaomiFactory(Country country){
        return new XiaomiFactory(country);
    }
}
