
package aula06;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite um numero inteiro:");
            int num = sc.nextInt();
            int resp = num%2;
            if (resp==0){
                System.out.println("O n° é par");
            }
            else{
                System.out.println("o n° é ímpar");
            }
                    
            
        sc.close();
    }
}
