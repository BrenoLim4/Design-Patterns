/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_factoryMethod.Entidades.iphone;

/**
 *
 * @author 99039833
 */
public enum IphoneFactory {
    IPHONE_6{
        @Override
        public Iphone factory() {
            return new Iphone6("Iphone 6", 2010);
        }
    },
    IPHONE_7{
        @Override
        public Iphone factory() {
            return new Iphone7("Iphone 7", 2012);
        }
    },
    IPHONE_X{
        @Override
        public Iphone factory() {
            return new IphoneX("Iphone X", 2019);
        }
    },
    IPHONE_11{
        @Override
        public Iphone factory() {
            return new Iphone11("Iphone 11", 2020);
        }
    },
    IPHONE_12{
        @Override
        public Iphone factory() {
            return new Iphone12("Iphone 12", 2021);
        }
    };

    public abstract Iphone factory();
}
