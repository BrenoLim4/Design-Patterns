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
public abstract class Iphone {
    private String nome;
    private Integer ano;
    private Boolean produzido = Boolean.TRUE;

    public Iphone(String nome, Integer ano) {
        this.nome = nome;
        this.ano = ano;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public boolean isProduzido() {
        return produzido;
    }

    public void setProduzido(boolean produzido) {
        this.produzido = produzido;
    }

    @Override
    public String toString() {
        return "Iphone{" + "nome: " + nome + "\nano: " + ano + "}\n";
    }
    
    
   
}
