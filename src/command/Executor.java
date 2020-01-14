/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import java.util.List;

/**
 *
 * @author alexandrebarao
 */
public class Executor {
    
    public void executa(List<Comando> comandos) {
        for (Comando comando : comandos) {
            comando.executa();
        }
    }
    
}
