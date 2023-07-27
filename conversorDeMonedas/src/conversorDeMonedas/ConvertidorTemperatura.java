package conversorDeMonedas;

import javax.swing.JOptionPane;

public class ConvertidorTemperatura {
	private double temperaturaIngresado;
	private String[] convertirTemperaturaA = {"De °C a °F", "De °F a °C", 
			"De K a °C", "De °C a K", "De °F a °K", "De K a °F", "De °F a K"};
	private String opcionEscogida;	
	
	public ConvertidorTemperatura(double temperaturaIngresado) {
			this.temperaturaIngresado = temperaturaIngresado;
			JOptionPane.showMessageDialog(null, "La temperatura ingresada para convertir fue: " 
					+ this.temperaturaIngresado);
	}
	
	
	public String seleccionTemperaturaAConvertir() {
		opcionEscogida = (String) JOptionPane.showInputDialog(
				null,
				"Elige la conversión de temperatura que deseas realizar",
				"Temperatura",
				JOptionPane.QUESTION_MESSAGE,
				null,
				convertirTemperaturaA,
				convertirTemperaturaA[0]);
		return opcionEscogida;
	}
	
	public double realizarConversion(double valor, String opcion) {
		switch(opcion) {
		case "De °C a °F":
			return valor*1.8+32;
		case "De °F a °C":
			return (valor-32)/1.8;
		case "De K a °C":
			return valor-273.15;
		case "De °C a K":
			return valor+273.15;
		case "De K a °F": 
			return 5/9*(valor-32)+273.15;
		case "De °F a K":
			return 1.8*(valor-273.15)+32;
		default:
			return 0;
		}
	}
}
