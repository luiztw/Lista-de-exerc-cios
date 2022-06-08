package EXERC1;

import java.util.Scanner;

public class exerci1 {

 public static void main(String[] args) {
     
    Scanner ler = new Scanner(System.in);

    int A=0, h=0, b=0, B=0;

    System.out.println("Digite a altura do trapézio");
    h = ler.nextInt();

    System.out.println("Digite o valor da base menor");
    b = ler.nextInt();

    System.out.println("Digite a base maior");
    B = ler.nextInt();

    A = (h * (b + B)) / 2;

    System.out.println("A Área do trapézio é igual " + A);




    

 }   
    
}
