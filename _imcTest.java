package imc;

import javax.swing.JOptionPane;

public class _imcTest {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Bem Vindo ao IMC!", "Boas Vindas",
				JOptionPane.INFORMATION_MESSAGE);

		_imc meuImc = new _imc();
		meuImc.entradaPeso();
		meuImc.entradaAltura();

		String result = String.format(" %.2f.", meuImc.getCalculo());

		JOptionPane
				.showMessageDialog(
						null,
						"< 17 = Muito abaixo do peso\n17 a 18,49 = Abaixo do peso\n"
								+ "18,5 a 24,99 = Normal\n25 a 29,99 = Acima do peso\n30 a 34,99 = Obesidade\n"
								+ "35 a 38,99 = Obesidade 2\n >= 40 = Obesidade3\n\n Seu IMC é de "
								+ result);

		if (meuImc.getCalculo() < 17)
			JOptionPane.showMessageDialog(null,
					"Seu IMC está muito baixo do peso!", "IMC",
					JOptionPane.INFORMATION_MESSAGE);

		else if (meuImc.getCalculo() >= 17 && meuImc.getCalculo() <= 18.49)
			JOptionPane.showMessageDialog(null, "Seu IMC está abaixo do peso!",
					"IMC", JOptionPane.INFORMATION_MESSAGE);

		else if (meuImc.getCalculo() >= 18.5 && meuImc.getCalculo() <= 24.99)
			JOptionPane.showMessageDialog(null, "Seu IMC está normal!", "IMC",
					JOptionPane.INFORMATION_MESSAGE);

		else if (meuImc.getCalculo() >= 25 && meuImc.getCalculo() <= 29.99)
			JOptionPane.showMessageDialog(null, "Seu IMC está acima do peso!",
					"IMC", JOptionPane.INFORMATION_MESSAGE);

		else if (meuImc.getCalculo() >= 30 && meuImc.getCalculo() <= 34.99)
			JOptionPane.showMessageDialog(null, "Obesidade!", "IMC",
					JOptionPane.INFORMATION_MESSAGE);

		else if (meuImc.getCalculo() >= 35 && meuImc.getCalculo() <= 39.99)
			JOptionPane.showMessageDialog(null, "Obesidade 2!", "IMC",
					JOptionPane.INFORMATION_MESSAGE);

		else if (meuImc.getCalculo() >= 40)
			JOptionPane.showMessageDialog(null, "Obesidade 3!", "IMC",
					JOptionPane.INFORMATION_MESSAGE);
	}
}