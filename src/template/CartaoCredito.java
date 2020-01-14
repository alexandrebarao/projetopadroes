/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

/**
 *
 * @author alexandrebarao
 */
public abstract class CartaoCredito {
    
    abstract boolean autorizarCartao();
    abstract void ativarCartao();
    
    public final void entregarCartao() { 
        
        if ( autorizarCartao() ) {
            ativarCartao();
        } else {
            System.out.println("Não é possível entregar este cartão");
        }
        
        
    }
    
}
