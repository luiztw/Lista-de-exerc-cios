
public class exerc1_pag33 {

    public static void main(String[] args) {

        Integer num;
        Integer soma = 0;
        long par = 1;

        for (num = 0; num <= 30; num++) {

            if (num % 2 == 1) {
                soma += num;

            } else {
                if (num > 0)
                    par *= num;

            }

        }
        System.out.println("Soma dos números ímpares:" + soma);
        System.out.println("A multiplicação entre os pares é:" + par);

    }

}
