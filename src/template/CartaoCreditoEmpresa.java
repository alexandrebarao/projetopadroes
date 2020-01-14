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
public class CartaoCreditoEmpresa extends CartaoCredito {
    @Override
    boolean autorizarCartao() {
        System.out.println("CE: Pedir situação fiscal da empresa");
        System.out.println("CE: Pedir informações da empresa ao Banco de Portugal");
        System.out.println("CE: Analisar balanço de atividades do ano último ano");
        System.out.println("CE: Analisar última declaração de IRC");
        
        return true; // ok... correu tudo bem... ;) Sugere-se mudar este return para efeitos de teste...
    }

    @Override
    void ativarCartao() {
        System.out.println("CE: Emitir cartão de crédito empresa");
        System.out.println("CE: Associar cartão a conta bancária da empresa");
        System.out.println("CE: Atribuir gestor de conta empresarial");
    }
}
