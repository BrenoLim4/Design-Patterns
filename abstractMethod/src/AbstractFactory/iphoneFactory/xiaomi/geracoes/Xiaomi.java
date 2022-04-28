/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.iphoneFactory.xiaomi.geracoes;

import AbstractFactory.iphoneFactory.builder.Celular;
import AbstractFactory.iphoneFactory.countryRules.countryRulesFactory.CountryRules;

/**
 *
 * @author 99039833
 */
public abstract class Xiaomi extends Celular {
    
    public Xiaomi(CountryRules countryRules) {
        super(countryRules);
    }

    @Override
    public String toString() {
        return "Xiaomi{" + getCertificado() + " " + getEmbalagem()+'}';
    }
    
    
    
}
