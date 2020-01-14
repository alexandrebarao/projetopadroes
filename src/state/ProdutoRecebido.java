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
public class ProdutoRecebido implements Estado {
    @Override
    public void executaAcao(ContextoEstado contexto) {
        System.out.println("O produto foi recebido e está em stock");
        contexto.alteraEstado(this);
    }
    
    public String toString() {
        return "ESTADO = EM STOCK"; 
    }
}
