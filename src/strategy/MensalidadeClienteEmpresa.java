/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author alexandrebarao
 */
public class MensalidadeClienteEmpresa extends Mensalidade implements Estrategia {

    
     @Override
    public double calculaMensalidade(int minutosConsumo) {
        
        
        
        return ( getValorMinuto()/2 * minutosConsumo );
    }
}
