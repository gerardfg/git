//patata
/*
 * Too change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerospetit;

/**
 *
 * @author hp
 */
//ismportem uril arrays i scanner
import java.util.Arrays;
import java.util.Scanner;

public class NumerosPetit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner lector = new Scanner(System.in);
       
     System.out.println("Escriu 10 números i et retornaré el mes petit i el mes gran.");
      
      int[] numeros = new int[10];
      
      for (int i=0; i<numeros.length ; i++){
          numeros[i] = lector.nextInt(); 
      }
      //Ordenem l'array i imprimim el mes gran i el mes petit
      Arrays.sort(numeros); 
      System.out.println("El numero més petit és el " + numeros[0] + ".");
      System.out.println("El numero més gran és el " + numeros[9] + ".");
//Programa acabat
      
    }
    
}
