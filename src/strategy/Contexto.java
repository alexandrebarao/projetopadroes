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
public class Contexto {
    private Estrategia estrategia;
    
    public Contexto(Estrategia e) {
        estrategia = e; 
    }

    public Contexto() {
       
    }
    
    //    Se usarem o mesmo nome no argumento de entrada... 
    // 
    //    public Contexto(Estrategia estrategia) {
    //        this.estrategia = estrategia; 
    //    }
    
    public double executaEstrategia(int minutosConsumo) {
        
        return estrategia.calculaMensalidade(minutosConsumo);
        
    }
}
