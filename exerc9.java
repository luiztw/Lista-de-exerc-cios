import java.util.Scanner;
import javax.swing.*;
public class exerc9 {
public static void main(String[] args) {
     

Double nota1, nota2,media;

Scanner ler = new Scanner (System.in);

System.out.println("Digite a primeira nota");
nota1 = ler.nextDouble();

System.out.println("Digite a segunda nota:");
nota2 = ler.nextDouble();

media = (nota1 + nota2) / 2;

JOptionPane.showMessageDialog(null,"A média é igual a: " + media);


}





    
}
