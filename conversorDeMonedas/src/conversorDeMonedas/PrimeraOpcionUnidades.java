package conversorDeMonedas;

import javax.swing.JOptionPane;

public class PrimeraOpcionUnidades {
	
	
	private String[] unidades = {"Kilometro", "Hectometro", "Decametro", "Metro", 
			"Decimetro", "Centimetro", "Milimetro",};
	
	private String opcionInicial;
	
	public String seleccionUnidadInicial() {
		opcionInicial = (String) JOptionPane.showInputDialog(
				null,
				"Elige la unidad inicial",
				"Multiplos del metro",
				JOptionPane.QUESTION_MESSAGE,
				null,
				unidades,
				unidades[0]);
		return opcionInicial;
	}
	
	public double realizarConversion(double valor, String opcionInicial) {
		switch(opcionInicial) {
		case "Kilometro":
			return valor*1000;
		case "Hectometro":
			return valor*100;
		case "Decametro":
			return valor*10;
		case "Metro":
			return valor;
		case "Decimetro": 
			return valor*0.1;
		case "Centimetro":
			return valor*0.01;
		case "Milimetro":
			return valor*0.001;
		default:
			return 0;
		}
	}
}
