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
public class ContextoEstado {
    private Estado estado; 
    
    public ContextoEstado() {
        estado = null;
    }
    
    public void alteraEstado(Estado estado) {
        this.estado = estado; 
    }

    /**
     * @return the estado
     */
    public Estado getEstado() {
        return estado;
    }
    
    
    
    
}
