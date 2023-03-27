package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	//Los valores de las monedas son de la fecha 27/03/2023
	
	public void ConvertirSolesDolares(double valor) { 
		double monedaDolar = valor / 3.77;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, " S/ "+ valor + " equivalen a " + monedaDolar + " Dólares");
	}
	public void ConvertirSolesEuros(double valor) {
		double monedaEuro = valor / 4.07;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, " S/ "+ valor + " equivalen a " + monedaEuro + " Euros");
	}
	public void ConvertirSolesLibras(double valor) {
		double monedaLibra = valor / 4.63;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, " S/ "+ valor + " equivalen a " + monedaLibra + " Libras Esterlinas");
	}
	public void ConvertirSolesYenes(double valor) {
		double monedaYen = valor / 0.029;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, " S/ "+ valor + " equivalen a " + monedaYen + " Yen Japonés");
	}
	public void ConvertirSolesWones(double valor) {
		double monedaWon = valor / 0.0029;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, " S/ "+ valor + " equivalen a " + monedaWon + " Won Sur-Coreano");
	}
	public void ConvertirSolesPesosArgentinos(double valor) {
		double monedaPesoArgentino = valor / 0.018;
		monedaPesoArgentino = (double)Math.round(monedaPesoArgentino * 100d)/100;
		JOptionPane.showMessageDialog(null, " S/ "+ valor + " equivalen a " + monedaPesoArgentino + " Pesos Argentinos");
	}
	public void ConvertirSolesPesosChilenos(double valor) {
		double monedaPesoChileno = valor / 0.0047;
		monedaPesoChileno = (double)Math.round(monedaPesoChileno * 100d)/100;
		JOptionPane.showMessageDialog(null, " S/ "+ valor + " equivalen a " + monedaPesoChileno + " Pesos Chilenos");
	}
	public void ConvertirSolesPesosColombianos(double valor) {
		double monedaPesoColombiano = valor / 0.00079;
		monedaPesoColombiano = (double)Math.round(monedaPesoColombiano * 100d)/100;
		JOptionPane.showMessageDialog(null, " S/ "+ valor + " equivalen a " + monedaPesoColombiano + " Pesos Colombianos");
	}
	
	
	public void ConvertirDolaresSoles(double valor) {
		double monedaDolar = 3.77 * valor;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "$ " + valor +" equivalen a: " + "S/ "+ monedaDolar + " en Soles Peruanos");
	}
	public void ConvertirEurosSoles(double valor) {
		double monedaEuro = valor * 4.07;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "€" + valor +" equivalen a: " + "S/ "+ monedaEuro + " en Soles Peruanos");
	}
	public void ConvertirLibrasSoles(double valor) {
		double monedaLibra = valor * 4.63;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "£" + valor +" equivalen a: " + "S/ " + monedaLibra + " en Soles Peruanos");
	}
	public void ConvertirYenesSoles(double valor) {
		double monedaYen = valor * 0.029;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "¥" + valor +" equivalen a: " + "S/ " + monedaYen + " en Soles Peruanos");
	}
	public void ConvertirWonesSoles(double valor) {
		double monedaWon = valor * 0.0029;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "₩ " + valor +" equivalen a: " + "S/ " + monedaWon + " en Soles Peruanos");
	}
	public void ConvertirPesosArgentinosSoles(double valor) {
		double monedaPesoArgentino = valor * 0.018;
		monedaPesoArgentino = (double)Math.round(monedaPesoArgentino * 100d) /100;
		JOptionPane.showMessageDialog(null, "$ " + valor +" equivalen a: " + "S/ " + monedaPesoArgentino + " en Soles Peruanos");
	}
	public void ConvertirPesosChilenosSoles(double valor) {
		double monedaPesoChileno = valor * 0.0047;
		monedaPesoChileno = (double)Math.round(monedaPesoChileno * 100d) /100;
		JOptionPane.showMessageDialog(null, "$ " + valor +" equivalen a: " + "S/ " + monedaPesoChileno + " en Soles Peruanos");
	}
	public void ConvertirPesosColombianosSoles(double valor) {
		double monedaPesoColombiano = valor * 0.00079;
		monedaPesoColombiano = (double)Math.round(monedaPesoColombiano * 100d) /100;
		JOptionPane.showMessageDialog(null, "$ " + valor +" equivalen a: " + "S/ " + monedaPesoColombiano + " en Soles Peruanos");
	}

}
