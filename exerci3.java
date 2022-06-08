package EXERC3;

 import java.text.DecimalFormat;
import java.util.Scanner;
public class exerci3 {
 
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int a,b;
        Double c,d;

        a = 3 - 2 - 1 + 2 + 1 + 3;
        System.out.println("O valor dessa equação é " + a);

        b = 2 * 3 - 4 * 5;
        System.out.println("O valor dessa equação é " + b);

        c = 2.0 + 6.0 - 3.0 / 7.0 * 9.0;
        System.out.println("O valor dessa equação é " + df.format(c));

        d = 3.0 % 4.0 - 8.0;
        System.out.println("O valor dessa equação é " + d);





    }
}
