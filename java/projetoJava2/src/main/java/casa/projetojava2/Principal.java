/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package casa.projetojava2;

import Animal.Animal;
import Animal.Cachorro;
import Animal.Cavalo;
import Animal.Preguiça;
import Animal.Veterinario;
        
/**
 *
 * @author Vitória
 */
public class Principal {

    private static Animal Animal;
 
    
   public static void main(String[] args){

  Cachorro cachorro = new Cachorro();
  Cavalo cavalo = new Cavalo();
  Preguiça preguiça = new Preguiça();
  Veterinario veterinario = new Veterinario();
  

  cachorro.emiteSom();
  cavalo.emiteSom();
  preguiça.emiteSom();
  veterinario.examinar(Animal);

   }
}