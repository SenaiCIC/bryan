
package aula05;

import java.util.Scanner;

public class Exercicio01 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite um numero inteiro:");
                int a = sc.nextInt();
            System.out.println("Digite um numero inteiro:");
                int b = sc.nextInt();
                int c = a+b;
            System.out.println("A soma dos dois numeros é igual a: "+c);
       }            
}
