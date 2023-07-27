package conversorDeMonedas;

import javax.swing.JOptionPane;

public class InicializacionTemperatura {
	public static double valorIngreso() {
		double valorIngresado = 0; 
		int bucle;
		do {
			bucle = 1;
		try {
			valorIngresado = Double.parseDouble(JOptionPane.showInputDialog("Ahora ingresa "
					+ "la temperatura que deseas convertir:"));
			} catch (IllegalArgumentException excepcion) {
				System.out.println(excepcion.getMessage());
				excepcion.printStackTrace();
				JOptionPane.showMessageDialog(null, "El valor ingresado no es valido, vuelva"
						+ " a intentarlo nuevamente (solo se aceptan valores numericos)");
				bucle = 0;
			}
		} while(bucle == 0);
		
		return valorIngresado;
	}
}
