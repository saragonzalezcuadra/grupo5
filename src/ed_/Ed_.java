/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_;

import java.util.Scanner;

/**
 *
 * @author numer
 */
public class Ed_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       int op;
       do{
           System.out.println("Introduce una opcion: ");
           System.out.println("1: ");
           System.out.println("2: ");
           System.out.println("3: ");
           op=teclado.nextInt();
           switch(op){
               case 1 //Laura:
               break;
               case 2:
               break;
               case 3:
               break;
               default:
               System.out.println("Se ha confundido de opcion. ");
               break;
               
           }
       }while(op!=3);
    }
    
}
