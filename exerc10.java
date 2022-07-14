import javax.swing.JOptionPane;
import javax.swing.*;

public class exerc10 {

    public static void main(String[] args) {

        String dia = JOptionPane.showInputDialog(null,"Digite número entre 1 e 7");

        if (dia != null) {
            try {

                int diadasemana = Integer.parseInt(dia);

                if (diadasemana == 1)
                    dia = "Domingp";

                else if (diadasemana == 2)
                    dia = "Segunda";

                else if (diadasemana == 3)
                    dia = "Tercça";

                else if (diadasemana == 4)
                    dia = "Quarta";

                else if (diadasemana == 5)
                    dia = "Quinta";

                else if (diadasemana == 6)
                    dia = "Sexta";

                else if (diadasemana == 7)
                    dia = "Sabado";

                else
                    dia = "Desconheço";
                JOptionPane.showMessageDialog(null, dia);

            }

            catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Formato inválido");
            }

        }

    }

}
