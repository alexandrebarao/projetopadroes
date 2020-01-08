/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable; 


/**
 *
 * @author Administrator
 */
public class Professor extends Observable {
    private String tituloConteudo;

    public void publicacaoNovoConteudo(String tituloConteudo) {
        
        this.tituloConteudo = tituloConteudo;
        
        setChanged(); // flag interna a true
        notifyObservers(); // se flag == true, notifica todos os observadores (executa o update deles...)
    }

    public String getTituloConteudo() {
        return tituloConteudo;
    }

}
