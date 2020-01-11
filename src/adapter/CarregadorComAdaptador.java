/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author alexandrebarao
 */
public class CarregadorComAdaptador extends CarregadorUSB {
    
    private CaboMicroUSB microUSB;
    
    
    public CarregadorComAdaptador(CaboMicroUSB microUSB) {
        super();
        this.microUSB = microUSB;
    }
    
    public void ligar() {
        
        microUSB.usar();
        super.ligar();
    }
    
}
