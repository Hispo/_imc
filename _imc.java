/**
 * Programa que mede o �ndice de Massa Corporal.
 * IMC = peso / (altura * altura)
 */

package imc;

import javax.swing.JOptionPane;

public class _imc {

	private String _peso, _altura;
	private double altura;
	private double peso;
	private double imc = 0;

	public double getCalculo() {
		imc = peso / (altura * altura);

		return imc;
	} // fim do m�todo getCalculo

	public double entradaPeso() {
		_peso = JOptionPane.showInputDialog("Digite o seu peso:");
		peso = Double.parseDouble(_peso.trim());

		while (peso <= 0) {
			_peso = JOptionPane
					.showInputDialog("Valor Inv�lido!\nDigite o seu peso:");
			peso = Double.parseDouble(_peso.trim());
		}
		return peso;

	} // fim do m�todo entradaPeso

	public double entradaAltura() {
		_altura = JOptionPane.showInputDialog("Digite a sua altura:");
		altura = Double.parseDouble(_altura.trim());

		while (altura <= 0) {
			_altura = JOptionPane
					.showInputDialog("Valor Inv�lido!\nDigite a sua altura:");
			altura = Double.parseDouble(_altura.trim());
		}
		return altura;

	} // fim do m�todo entradaAltura
} // fim da classe