/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composto;

/**
 *
 * @author Administrator
 */
public abstract class Elemento {
        private String nome; 
    
    public abstract void executa();

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

}
