package conversorDeMonedas;

import javax.swing.JOptionPane;

public class InicializacionMoneda {
	
	public static void inicio() {
		JOptionPane.showMessageDialog(
				null,
				"Hola!\n" +
				"Es un gusto tenerte aquí :)\n" +
				"Este programa te permite realizar algunas conversiones.\n" +
				"¿Te parece si empezamos?");
	}
	
	public static double valorIngreso() {
		double valorIngresado = 0; 
		try {
			valorIngresado = Double.parseDouble(JOptionPane.showInputDialog("Ahora ingresa "
					+ "la cantidad de dinero que deseas convertir:"));
			if(valorIngresado < 0) {
				throw new IllegalArgumentException("El numero debe ser mayor a 0");
			}
			} catch (IllegalArgumentException excepcion) {
				System.out.println(excepcion.getMessage());
				excepcion.printStackTrace();
				JOptionPane.showMessageDialog(null, "El valor ingresado no es valido, vuelva"
						+ " a intentarlo nuevamente (solo se aceptan numeros mayores o iguales a 0)");
				valorIngresado = -1;
			}
		
		return valorIngresado;
	}
}
