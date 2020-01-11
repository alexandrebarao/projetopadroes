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
public class Fabrica {
    public Motor getAutomovel(String tipoMotor) {
        
        if ( tipoMotor == null ) {
            return null;
        }
        
        if ( tipoMotor.equalsIgnoreCase("GASOLINA")  ) {
            return new AutomovelLigeiro();
        }
        
        if ( tipoMotor.equalsIgnoreCase("GASOLEO")  ) {
            return new AutomovelComercial();
        }
        
        if ( tipoMotor.equalsIgnoreCase("ELETRICO")  ) {
            return new AutomovelEcologico();
        }
        
        return null;
    }
}
