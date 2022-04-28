/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.iphoneFactory.builder;

/**
 *
 * @author 99039833
 */
public class CelularBuilder {
    private String nome;
    private Integer ano;
    private Boolean produzido = Boolean.TRUE;
    private final Celular celular;
    
    public CelularBuilder(Celular celular){
        this.celular = celular;
    }
    
    public CelularBuilder setNome(String nome){
        celular.setNome(nome);
        return this;
    }
    
    public CelularBuilder setAno(Integer ano){
        celular.setAno(ano);
        return this;
    }
    
    public CelularBuilder notProduce(){
        celular.setProduzido(false);
        return this;
    }
    
    public Celular get(){
        return celular;
    }
}
