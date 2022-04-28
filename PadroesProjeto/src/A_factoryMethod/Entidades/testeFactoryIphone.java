/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_factoryMethod.Entidades;

import A_factoryMethod.Entidades.iphone.IphoneFactory;
import A_factoryMethod.Entidades.iphone.IphoneSimpleFactory;
import static java.util.Arrays.asList;
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

        cliente1.setIphone(IphoneSimpleFactory.orderIphone(IphoneFactory.IPHONE_6));
        cliente2.setIphone(IphoneSimpleFactory.orderIphone(IphoneFactory.IPHONE_7));
        cliente3.setIphone(IphoneSimpleFactory.orderIphone(IphoneFactory.IPHONE_X));
        cliente4.setIphone(IphoneSimpleFactory.orderIphone(IphoneFactory.IPHONE_11));
        cliente5.setIphone(IphoneSimpleFactory.orderIphone(IphoneFactory.IPHONE_12));
        
        
        clientes = asList(cliente1, cliente2, cliente3, cliente4, cliente5);
        clientes.forEach(System.out::println);
        clientes.stream()
                .map(c -> c.getIphone())
                .filter(iphone -> iphone.getAno() < 2019)
                .forEach(iphone -> {
                    iphone.setProduzido(false);
                    System.out.println(iphone.getNome() + ", saiu de produção");
                });
    }
}
