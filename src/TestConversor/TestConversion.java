package TestConversor;

import javax.swing.JOptionPane;

import ConversorMonedas.OpcionesConversion;
import ConversorTemperatura.OpcionesTemperatura;

public class TestConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OpcionesConversion conversion = new OpcionesConversion();
		OpcionesTemperatura conversionT = new OpcionesTemperatura();

		while (true) {
			String opciones = JOptionPane
					.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.QUESTION_MESSAGE,
							null, new Object[] { "Conversor de Monedas", "Conversor de Temperatura" }, "Elegir").toString();

			switch (opciones) {

			case "Conversor de Monedas":
				String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConvertirMonedas(valorRecibido);

				int mensajeM = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Conversor de Monedas",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
				// 0=yes, 1=no, 2=cancel
				if (mensajeM == 1 || mensajeM == 2) {
					JOptionPane.showMessageDialog(null, "Programa Terminado, Vuelva Pronto!");
					System.exit(0);
				}
				break;

			case "Conversor de Temperatura":
				String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibidoT = Double.parseDouble(input1);
				conversionT.ConvertirTemperaturas(valorRecibidoT);

				int mensajeT = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Conversor de Temperatura",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
				// 0=yes, 1=no, 2=cancel
				if (mensajeT == 1 || mensajeT == 2) {
					JOptionPane.showMessageDialog(null, "Programa Terminado, Vuelva Pronto!");
					System.exit(0);
				}
			}
		}
	}
}


