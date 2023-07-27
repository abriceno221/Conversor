package conversorDeMonedas;

import javax.swing.JOptionPane;

public class ConvertidorMoneda {
	private double valorIngresado;
	private String[] convertirDePesosA = {"De Dolar a Peso Colombiano", 
			"De Euro a Peso Colombiano", "De Libras Esterlinas a Peso Colombiano", 
			"De Yen Japones a Peso Colombiano", "De Won coreano a Peso Colombiano", 
			"De Peso Colombiando a Dolar", "De Peso Colombiando a Euro", 
			"De Peso Colombiando a Libras Esterlinas", "De Peso Colombiando a Yen Japones",
			"De Peso Colombiando a Won coreano"};
	private String opcionEscogida;	
	
	public ConvertidorMoneda(double valorIngresado) {
			this.valorIngresado = valorIngresado;
			JOptionPane.showMessageDialog(null, "El valor ingresado para convertir fue: " 
					+ this.valorIngresado);
	}
	
	
	public String seleccionMonedaAConvertir() {
		opcionEscogida = (String) JOptionPane.showInputDialog(
				null,
				"Elige la moneda a la que deseas convertir tu dinero",
				"Monedas",
				JOptionPane.QUESTION_MESSAGE,
				null,
				convertirDePesosA,
				convertirDePesosA[0]);
		return opcionEscogida;
	}
	
	public double realizarConversion(double valor, String opcion) {
		switch(opcion) {
		case "De Dolar a Peso Colombiano":
			return valor/ValorMoneda.DOLAR.getValor();
		case "De Euro a Peso Colombiano":
			return valor/ValorMoneda.EURO.getValor();
		case "De Libras Esterlinas a Peso Colombiano":
			return valor/ValorMoneda.LIBRA.getValor();
		case "De Yen Japones a Peso Colombiano":
			return valor/ValorMoneda.YEN.getValor();
		case "De Won coreano a Peso Colombiano": 
			return valor/ValorMoneda.WON.getValor();
		case "De Peso Colombiando a Dolar":
			return valor*ValorMoneda.DOLAR.getValor();
		case "De Peso Colombiando a Euro":
			return valor*ValorMoneda.EURO.getValor();
		case "De Peso Colombiando a Libras Esterlinas":
			return valor*ValorMoneda.LIBRA.getValor();
		case "De Peso Colombiando a Yen Japones":
			return valor*ValorMoneda.YEN.getValor();
		case "De Peso Colombiando a Won coreano":
			return valor*ValorMoneda.WON.getValor();
		default:
			return 0;
		}
	}
	
}
