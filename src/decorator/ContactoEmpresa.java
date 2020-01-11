/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

public class ContactoEmpresa extends ContactoDecorator {

   public ContactoEmpresa(Contacto contacto) {
      super(contacto);		
   }

   @Override
   public void informacao() {
      System.out.println("\n=== E M P R E S A =========================");
      contacto.informacao();	       
      informacaoAdicional(contacto);
      System.out.println("\n===========================================");
   }

   private void informacaoAdicional(Contacto contacto){
      // ...
   }
}
