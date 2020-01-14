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
public abstract class ContactoDecorator implements Contacto {
   protected Contacto contacto;

   public ContactoDecorator(Contacto contacto){
      this.contacto = contacto;
   }

   public void informacao(){
      contacto.informacao();
   }	
}
