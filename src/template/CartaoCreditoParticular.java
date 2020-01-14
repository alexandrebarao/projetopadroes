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
public class CartaoCreditoParticular extends CartaoCredito {

    @Override
    boolean autorizarCartao() {
        System.out.println("CP: Pedir dados pessoais");
        System.out.println("CP: Pedir informações do cliente ao Banco de Portugal");
        System.out.println("CP: Analisar taxa de esforço do cliente");
        System.out.println("CP: Analisar última declaração de IRS");
        
        return true; // ok... correu tudo bem... ;) Sugere-se mudar este return para efeitos de teste...
    }

    @Override
    void ativarCartao() {
        System.out.println("CP: Emitir cartão de crédito particular");
        System.out.println("CP: Associar cartão a conta bancária");
        System.out.println("CP: Atribuir gestor de conta particular");
    }
    
}
