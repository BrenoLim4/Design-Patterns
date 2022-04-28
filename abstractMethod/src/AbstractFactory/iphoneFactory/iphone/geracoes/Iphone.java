/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.iphoneFactory.iphone.geracoes;

import AbstractFactory.iphoneFactory.builder.Celular;
import AbstractFactory.iphoneFactory.countryRules.countryRulesFactory.CountryRules;


/**
 *
 * @author 99039833
 */
public abstract class Iphone extends Celular {
    
    public Iphone(CountryRules rules) {
        super(rules);
    }
          
    @Override
    public String toString() {
        return "Iphone{" + getCertificado().toString() + "\nEmbalagem: " + getEmbalagem().toString() + "}\n";
    }
    
}
