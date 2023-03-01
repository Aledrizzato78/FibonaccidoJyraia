

package atividadesModulo2;

import javax.swing.JOptionPane;

public class AtividadeFatorial {

	public static void main(String[] args) {

		double n;

		n = Double.parseDouble(JOptionPane.showInputDialog("Favor_Informar_o_valor_de_n"));

		double f = n;
		while (n > 1) {
			f = f * (n - 1);
			n--;
			JOptionPane.showMessageDialog(null, "Resultado_do_fatorial" + "\n" + f);
			
		}

	}

}
