/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author alexandrebarao
 */
public class AutomovelLigeiro implements Motor {

    @Override
    public void ligar() {
        System.out.println("Motor a gasolina ligado...");
    }
    
    
}
