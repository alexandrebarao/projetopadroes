/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author alexandrebarao
 */
public class ContactoCidadao extends ContactoDecorator {

   public ContactoCidadao(Contacto contacto) {
      super(contacto);		
   }

   @Override
   public void informacao() {
      System.out.println("\n=== CARTÃO DE CIDADÃO =====================");
      contacto.informacao();	       
      informacaoAdicional(contacto);
      System.out.println("\n===========================================");
   }

   private void informacaoAdicional(Contacto contacto){
      // ...
   }
}
