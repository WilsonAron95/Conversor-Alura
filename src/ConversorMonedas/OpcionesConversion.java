package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor) {

		String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda que deseas convertir tu dinero ", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De Soles a Dólares", "De Soles a Euros", "De Soles a Libras Esterlinas",
						"De Soles a Yen Japonés", "De Soles a Won Sur-Coreano", "De Soles a Pesos Aregntinos","De Soles a Pesos Chilenos",
						"De Soles a Pesos Colombianos","De Dólares a Soles","De Euros a Soles", "De Libras Esterlinas a Soles", 
						"De Yen Japonés a Soles","De Won Sur-Coreano a Soles", "De Pesos Argentinos a Soles", "De Pesos Chilenos a Soles",
						"De Pesos Colombianos a Soles"},
				"Seleccion")).toString();

		switch (opcion) {
		case "De Soles a Dólares":
			monedas.ConvertirSolesDolares(valor);
			break;

		case "De Soles a Euros":
			monedas.ConvertirSolesEuros(valor);
			break;

		case "De Soles a Libras Esterlinas":
			monedas.ConvertirSolesLibras(valor);
			break;

		case "De Soles a Yen Japonés":
			monedas.ConvertirSolesYenes(valor);
			break;

		case "De Soles a Won Sur-Coreano":
			monedas.ConvertirSolesWones(valor);
			break;
			
		case "De Soles a Pesos Argntinos":
			monedas.ConvertirSolesPesosArgentinos(valor);
			break;
		
		case "De Soles a Pesos Chilenos":
			monedas.ConvertirSolesPesosChilenos(valor);
			break;
			
		case "De Soles a Pesos Colombianos":
			monedas.ConvertirSolesPesosColombianos(valor);
			break;
			
		case "De Dólares a Soles":
			monedas.ConvertirDolaresSoles(valor);
			break;

		case "De Euros a Soles":
			monedas.ConvertirEurosSoles(valor);
			break;

		case "De Libras Esterlinas a Soles":
			monedas.ConvertirLibrasSoles(valor);
			break;

		case "De Yen Japonés a Soles":
			monedas.ConvertirYenesSoles(valor);
			break;

		case "De Won Sur-Coreano a Soles":
			monedas.ConvertirWonesSoles(valor);
			break;
		
		case "De Pesos Argentinos a Soles":
			monedas.ConvertirPesosArgentinosSoles(valor);
			break;
		
		case "De Pesos Chilenos a Soles":
			monedas.ConvertirPesosChilenosSoles(valor);
			break;
		
		case "De Pesos Colombianos a Soles":
			monedas.ConvertirPesosColombianosSoles(valor);
			break;
		}
	}

}
