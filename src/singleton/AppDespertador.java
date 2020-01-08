/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Administrator
 */
public class AppDespertador {
           private static AppDespertador intanciaApp = null;
   
           private String numeroSerie;

    
           
   private AppDespertador() {
      // impede instanciação externa....
   }
   
   public static AppDespertador getIntanciaApp() {

      if(intanciaApp == null) {
         intanciaApp = new AppDespertador();
      }
      return intanciaApp;
   }
   
   public String getNumeroSerie() {
        return numeroSerie;
   }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
}
