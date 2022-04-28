/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.iphoneFactory.builder;

import AbstractFactory.iphoneFactory.countryRules.certificado.TipoCelular;
import AbstractFactory.iphoneFactory.countryRules.countryRulesFactory.Country;
import AbstractFactory.iphoneFactory.countryRules.countryRulesFactory.CountryRules;
import AbstractFactory.iphoneFactory.xiaomi.geracoes.Xiaomi;
import AbstractFactory.iphoneFactory.xiaomi.geracoes.Xiaomi11;
import AbstractFactory.iphoneFactory.xiaomi.geracoes.Xiaomi8;
import AbstractFactory.iphoneFactory.xiaomi.geracoes.Xiaomi9;

/**
 *
 * @author 99039833
 */
public class XiaomiFactory {

    private final Country country;
    public static enum TipoXiaomi{XIAOMI_8, XIAOMI_9, XIAOMI_11};
    private CelularBuilder celBuilder;
    
    XiaomiFactory(Country country) {
        this.country = country;
        
    }
    
    /**
     * options
     * (XIAOMI_8, XIAOMI_9, XIAOMI_11)
     * Enum static TipoXiaomi
     * @param tipo TipoXiaomi
     * 
     * @return Xiaomi
     */
    public CelularBuilder createNewXiaomi(TipoXiaomi tipo){
        Celular celular;
        switch(tipo){
            case XIAOMI_8:
                celular = new Xiaomi8(getCountryRules());
                break;
            case XIAOMI_9:
                celular = new Xiaomi9(getCountryRules());
                break;
            case XIAOMI_11: 
                celular = new Xiaomi11(getCountryRules());
                break;
            default:
                return null;
        }
        return new CelularBuilder(celular);
    }
    
    public CelularBuilder createNewXiaomi8(){
        return new CelularBuilder(new Xiaomi8(getCountryRules()));
    }
    
    public CelularBuilder createNewXiaomi9(){
        return new CelularBuilder(new Xiaomi9(getCountryRules()));
    }
    
    public CelularBuilder createNewXiaomi11(){
        return new CelularBuilder(new Xiaomi11(getCountryRules()));
    }
    
    private CountryRules getCountryRules(){
        return country.getCountryRules(TipoCelular.XIAOMI);
    }
    
}
