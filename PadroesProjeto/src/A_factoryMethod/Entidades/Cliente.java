/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_factoryMethod.Entidades;

import A_factoryMethod.Entidades.iphone.Iphone;
import java.util.Objects;

/**
 *
 * @author 99039833
 */
public class Cliente {
    
    private final Integer identificador;
    private final String nome;
    private Iphone iphone;

    public Cliente(Integer identificador, String nome) {
        this.identificador = identificador;
        this.nome = nome;
    }
    
    //<editor-fold defaultstate="collapsed" desc=">>>>Equals e HashCode">
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.identificador);
        return hash;
    }
    
    @Override
    public boolean equals(Object other) {
        return other instanceof Cliente && Objects.equals(this.identificador, ((Cliente)other).identificador);
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome:" + nome + "; " + iphone.toString() + "}\n";
    }
    
//</editor-fold>
    
    
    public Iphone getIphone() {
        return iphone;
    }

    public void setIphone(Iphone iphone) {
        this.iphone = iphone;
    }
    
    public Integer getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }
        
}
