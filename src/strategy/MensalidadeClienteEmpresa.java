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
public class MensalidadeClienteEmpresa implements Estrategia {
     @Override
    public double calculaMensalidade(int minutosConsumo, double valorMinuto) {
        
        valorMinuto/=2; // empresa só paga metade do valor por minuto! :) 
        
        return ( minutosConsumo * valorMinuto );
    }
}
