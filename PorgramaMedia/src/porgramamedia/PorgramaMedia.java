/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class PorgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite n1 ");
        float n1 = teclado.nextFloat();
        System.out.println("Digite n2 ");
        float n2 = teclado.nextFloat();
        System.out.println("Digite n3 ");
        float n3 = teclado.nextFloat();
        float m = (n1+n2+n3)/3;
        System.out.println("Sua média foi " +m);
        if(m>9){
            System.out.println("Parabéns, peqieno gafanhoto");
        }
            
    }
    
}
