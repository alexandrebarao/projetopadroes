/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author alexandrebarao
 */
public class ProdutoEncomendado implements Estado {

    @Override
    public void executaAcao(ContextoEstado contexto) {
        System.out.println("O produto está no estado encomendado");
        contexto.alteraEstado(this);
    }
    
    public String toString() {
        return "ESTADO = ENCOMENDADO"; 
    }
}
