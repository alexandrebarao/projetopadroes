/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author alexandrebarao
 */
public class Servidor implements Comando {

    private String parametro; 
    
    public Servidor (String parametro) {
        this.parametro = parametro;
    }
    
    @Override
    public void executa() {
        System.out.println(parametro);
    }
    
}
