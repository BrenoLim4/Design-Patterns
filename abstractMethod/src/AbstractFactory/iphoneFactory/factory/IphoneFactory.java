/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.iphoneFactory.factory;

import AbstractFactory.iphoneFactory.iphone.geracoes.Iphone;
import AbstractFactory.iphoneFactory.iphone.geracoes.Iphone11;
import AbstractFactory.iphoneFactory.iphone.geracoes.Iphone12;
import AbstractFactory.iphoneFactory.iphone.geracoes.Iphone6;
import AbstractFactory.iphoneFactory.iphone.geracoes.Iphone7;
import AbstractFactory.iphoneFactory.iphone.geracoes.IphoneX;
import AbstractFactory.iphoneFactory.countryRules.countryRulesFactory.CountryRules;

/**
 *
 * @author 99039833
 */
public enum IphoneFactory {
    IPHONE_6{
        @Override
        public Iphone factory(CountryRules rules) {
            return new Iphone6(rules);
        }
    },
    IPHONE_7{
        @Override
        public Iphone factory(CountryRules rules) {
            return new Iphone7(rules);
        }
    },
    IPHONE_X{
        @Override
        public Iphone factory(CountryRules rules) {
            return new IphoneX(rules);
        }
    },
    IPHONE_11{
        @Override
        public Iphone factory(CountryRules rules) {
            return new Iphone11(rules);
        }
    },
    IPHONE_12{
        @Override
        public Iphone factory(CountryRules rules) {
            return new Iphone12(rules);
        }
    };

    public abstract Iphone factory(CountryRules rules);
}
