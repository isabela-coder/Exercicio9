
package exercicio9;

import java.util.Scanner;


public class Exercicio9 {

   
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);
        float baseMaior;
        float baseMenor;
        float altura;
        float area;
        
        System.out.println("Digite o valor da base maior: ");
        baseMaior = entrada.nextFloat();
        System.out.println("Digite o valor da base menor: ");
        baseMenor = entrada.nextFloat();
        System.out.println("Digite a altura: ");
        altura = entrada.nextFloat();
        area = ((baseMaior+baseMenor)*altura)/2;
        
        System.out.println("A area do trapézio é de: "+area + " "+ "cm²");
 

     
 }
        
        
    }
    

