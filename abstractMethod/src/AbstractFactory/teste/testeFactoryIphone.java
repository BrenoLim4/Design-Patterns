/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.teste;

import AbstractFactory.iphoneFactory.builder.Celular;
import AbstractFactory.iphoneFactory.builder.CelularFactory;
import AbstractFactory.iphoneFactory.builder.IphoneFactory.TipoIphone;
import AbstractFactory.iphoneFactory.builder.XiaomiFactory.TipoXiaomi;
import AbstractFactory.iphoneFactory.countryRules.countryRulesFactory.Country;
import java.util.List;

/**
 *
 * @author 99039833
 */
public class testeFactoryIphone {

    public static void main(String[] args) {
        List<Cliente> clientes;

        Cliente cliente1 = new Cliente(2, "Breno"),
                cliente2 = new Cliente(1, "Robson"),
                cliente3 = new Cliente(2, "Francisco"),
                cliente4 = new Cliente(3, "Zukenberg"),
                cliente5 = new Cliente(4, "Jonas calvo");
        
        TipoIphone t = TipoIphone.IPHONE_12;
        TipoXiaomi x = TipoXiaomi.XIAOMI_11;
        
        Celular celular = CelularFactory
                .IphoneFactory(Country.BRASIL)
                .createNewIphone(TipoIphone.IPHONE_7)
                .setNome("Iphone 11")
                .setAno(2020)
                .get();
        
        Celular cel = CelularFactory
                .XiaomiFactory(Country.CHINA)
                .createNewXiaomi(TipoXiaomi.XIAOMI_8)
                .notProduce()
                .setAno(2021)
                .setNome("Xaomi")
                .get();
        
        Celular c2 = CelularFactory.XiaomiFactory(Country.ESTADOS_UNIDOS)
                .createNewXiaomi(TipoXiaomi.XIAOMI_11)
                .get();
        
        System.out.println(celular.toString() +  "\n\n" + cel.toString() + "\n\n" + c2.toString());

    }
}
