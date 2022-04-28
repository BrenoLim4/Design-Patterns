/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.iphoneFactory.xiaomi.geracoes;

import AbstractFactory.iphoneFactory.countryRules.countryRulesFactory.CountryRules;

/**
 *
 * @author 99039833
 */
public class Xiaomi8 extends Xiaomi {
    
    public Xiaomi8(CountryRules countryRules) {
        super(countryRules);
    }

    @Override
    public String toString() {
        return "Xiaomi8{" + getCertificado() + " " + getEmbalagem()+'}';
    }
    
    
}
