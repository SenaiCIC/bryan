
package aula03;

public class VariaveisPrimitivas {
   public static void main(String[] args){
       String nome="Bryan";
       int idade=21;
       boolean escolha=true;           //true our false
       char sexo ='M';                 //caracter
       char letra ='\u0059';           //codigo Unicode
       byte n1=126;                    //N°
       int n2=1000;                    //inteiro
       long n4= 1234567891011121314L;  //inteiro>
       float n5=25.08f ;                //decimais
       double n6=25.5 ;                //decimais>
       System.out.println(escolha);
       System.out.println(sexo);
       System.out.println(letra);
       System.out.println(n1);
       System.out.println(n2);
       System.out.println(n4);
       System.out.println(n5);
       System.out.println(n6);
       System.out.println("==========");
       System.out.printf("%.2f%n",n5);
       System.out.printf("%.5f%n",n6);
       System.out.println("Bryan");
       System.out.printf("%s tem %d anos",nome,idade);
   } 
}
