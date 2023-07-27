package conversorDeMonedas;

import javax.swing.JOptionPane;

public class ConvertidorUnidades {
	private double unidadIngresada;
	private String opcion1;
	private double valorInicialEnMetros;
	private String opcion2;
	private double valorFinal;

	public ConvertidorUnidades(double unidadIngresada) {
			this.unidadIngresada = unidadIngresada;
			JOptionPane.showMessageDialog(null, "La temperatura ingresada para convertir fue: " 
					+ this.unidadIngresada);
	}
	
	public void realizarConversion() {
		PrimeraOpcionUnidades primera = new PrimeraOpcionUnidades();
		opcion1 = primera.seleccionUnidadInicial();
		valorInicialEnMetros = primera.realizarConversion(this.unidadIngresada, opcion1);
		SegundaOpcionUnidades segunda = new SegundaOpcionUnidades();
		opcion2 = segunda.seleccionUnidadAConvertir();
		valorFinal = segunda.realizarConversion(valorInicialEnMetros, opcion2);
		
		JOptionPane.showMessageDialog(null, unidadIngresada + " " + opcion1 + " es igual a " + 
				valorFinal + " " + opcion2);
	}
}
