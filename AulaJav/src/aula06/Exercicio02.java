
package aula06;

import java.util.Scanner;


public class Exercicio02 {
     public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu nome");
            String nome = sc.next();
            System.out.println("Digite sua idade");
            int idade = sc.nextInt();
            System.out.println("Digite seu peso");
            double peso = sc.nextDouble();
            System.out.println("Digite sua altura");
            double altura = sc.nextDouble();
            double imc = peso/(altura*altura);
            System.out.printf(" Seu nome é %s, sua idade %d, seu peso %.2f e sua altura %.2f%n",nome,idade,peso,altura);
            System.out.printf("Seu IMC %3f",imc);
            
     }
}
