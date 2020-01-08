/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composto;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Composto extends Elemento {
    ArrayList lista; 
    
    public Composto() {
        lista = new ArrayList();
    }
    
    @Override

    public void executa() {

        System.out.println("\nComposto: " + getNome());

        for (int i=0 ; i < lista.size() ; i++ ) {

            Elemento e = (Elemento) lista.get(i);
            e.executa();
        }
    }
    
    public void adiciona(Elemento e){
        lista.add(e);
    }

}
