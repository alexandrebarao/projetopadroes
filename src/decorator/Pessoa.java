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
public class Pessoa extends EntidadeSocial implements Contacto {

    public Pessoa(String nome, String id) {
       super(nome, id);
    }

    
   @Override
   public void informacao() {
      System.out.println("Nome: " + getNome() + " Cartão cidadão: " + getId());
   }
}
