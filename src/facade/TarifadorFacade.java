/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author alexandrebarao
 */
public class TarifadorFacade {
    private ClienteParticular particular;
    private ClienteEmpresa empresa;
    
    public TarifadorFacade() { 
        particular = new ClienteParticular();
        empresa = new ClienteEmpresa(); 
    }
    
    public double pagamentoMensalParticular() { 
        return particular.pagamentoMensal(); 
    }
    
     public double pagamentoMensalEmpresa() { 
        return empresa.pagamentoMensal(); 
    }
    
}
