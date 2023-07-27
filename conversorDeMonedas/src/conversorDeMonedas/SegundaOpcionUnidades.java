package conversorDeMonedas;

import javax.swing.JOptionPane;

public class SegundaOpcionUnidades {
	
	private String[] unidades = {"Kilometro", "Hectometro", "Decametro", "Metro", 
			"Decimetro", "Centimetro", "Milimetro",};
	
	private String segundaOpcion;
	
	public String seleccionUnidadAConvertir() {
		segundaOpcion = (String) JOptionPane.showInputDialog(
				null,
				"Ahora elije la unidad a la que deseas convertir",
				"sub-multiplos del metro",
				JOptionPane.QUESTION_MESSAGE,
				null,
				unidades,
				unidades[0]);
		return segundaOpcion;
	}
	
	public double realizarConversion(double valor, String segundaOpcion) {
		switch(segundaOpcion) {
		case "Kilometro":
			return valor*0.001;
		case "Hectometro":
			return valor*0.01;
		case "Decametro":
			return valor*0.1;
		case "Metro":
			return valor;
		case "Decimetro": 
			return valor*10;
		case "Centimetro":
			return valor*100;
		case "Milimetro":
			return valor*1000;
		default:
			return 0;
		}
	}
}
