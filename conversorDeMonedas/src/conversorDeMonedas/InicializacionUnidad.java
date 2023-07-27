package conversorDeMonedas;

import javax.swing.JOptionPane;

public class InicializacionUnidad {
	public static double valorIngreso() {
		double valorIngresado = 0; 
		do {
		try {
			valorIngresado = Double.parseDouble(JOptionPane.showInputDialog("Ahora ingresa "
					+ "la unidad que deseas convertir:"));
			} catch (IllegalArgumentException excepcion) {
				System.out.println(excepcion.getMessage());
				excepcion.printStackTrace();
				JOptionPane.showMessageDialog(null, "El valor ingresado no es valido, vuelva"
						+ " a intentarlo nuevamente (solo se aceptan numeros mayores o iguales a 0)");
				valorIngresado = -1;
			}
		} while(valorIngresado < 0);
		
		return valorIngresado;
	}
}
