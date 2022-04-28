/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.iphoneFactory.builder;

import AbstractFactory.iphoneFactory.countryRules.certificado.TipoCelular;
import AbstractFactory.iphoneFactory.countryRules.countryRulesFactory.Country;
import AbstractFactory.iphoneFactory.countryRules.countryRulesFactory.CountryRules;
import AbstractFactory.iphoneFactory.iphone.geracoes.Iphone;
import AbstractFactory.iphoneFactory.iphone.geracoes.Iphone11;
import AbstractFactory.iphoneFactory.iphone.geracoes.Iphone12;
import AbstractFactory.iphoneFactory.iphone.geracoes.Iphone6;
import AbstractFactory.iphoneFactory.iphone.geracoes.Iphone7;
import AbstractFactory.iphoneFactory.iphone.geracoes.IphoneX;

/**
 *
 * @author 99039833
 */
public class IphoneFactory {

    private final Country country;

    public static enum TipoIphone {
        IPHONE_6, IPHONE_7, IPHONE_X, IPHONE_11, IPHONE_12
    };

    IphoneFactory(Country country) {
        this.country = country;
    }

    public CelularBuilder createNewIphone(TipoIphone tipo) {
        switch (tipo) {
            case IPHONE_6:
                return new CelularBuilder(new Iphone6(getCountryRules()));
            case IPHONE_7:
                return new CelularBuilder(new Iphone7(getCountryRules()));
            case IPHONE_X:
                return new CelularBuilder(new IphoneX(getCountryRules()));
            case IPHONE_11:
                return new CelularBuilder(new Iphone11(getCountryRules()));
            case IPHONE_12:
                return new CelularBuilder(new Iphone12(getCountryRules()));
            default:
                return null;
        }
    }

    public CelularBuilder createNewIphone6() {
        return new CelularBuilder(new Iphone6(getCountryRules()));
    }

    public CelularBuilder createNewIphone7() {
        return new CelularBuilder(new Iphone7(getCountryRules()));
    }

    public CelularBuilder createNewIphoneX() {
        return new CelularBuilder(new IphoneX(getCountryRules()));
    }

    public CelularBuilder createNewIphone11() {
       return new CelularBuilder(new Iphone11(getCountryRules()));
    }

    public CelularBuilder createNewIphone12() {
       return new CelularBuilder(new Iphone12(getCountryRules()));
    }

    private CountryRules getCountryRules() {
        return country.getCountryRules(TipoCelular.IPHONE);
    }

}
