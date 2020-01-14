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
public class MensalidadeClienteParticularVip extends MensalidadeClienteParticular {
    @Override
    public double calculaMensalidade(int minutosConsumo, double valorMinuto) {
        
        valorMinuto/=10; // Vip só paga um décimo do valor por minuto! :) 
        
        return ( minutosConsumo * valorMinuto );
        
    }
}
