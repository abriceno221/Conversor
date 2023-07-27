package conversorDeMonedas;

import javax.swing.JOptionPane;

public class TestMain {
	public static void main(String[] args) {
		int continuar = 0;
		InicializacionMoneda.inicio();
		
		do {
		String conversorEscogido = TipoDeConversor.seleccionConversor();
				
		if(conversorEscogido == TipoDeConversor.getOpcionesConversor(0)) {
			double valorIngresado = 0;
			
			do {
				valorIngresado = InicializacionMoneda.valorIngreso();
			}while(valorIngresado < 0);
			
			ConvertidorMoneda convertidor = new ConvertidorMoneda(valorIngresado);			
			
			String seleccionDeMoneda = convertidor.seleccionMonedaAConvertir();
			double valorConvertidoMoneda = convertidor.realizarConversion(valorIngresado, seleccionDeMoneda);
			JOptionPane.showMessageDialog(null, valorIngresado + " " + seleccionDeMoneda + " es"
					+ " igual a: " + String.format("%.3f", valorConvertidoMoneda));
		
		}else if(conversorEscogido == TipoDeConversor.getOpcionesConversor(1)) {
			double temperaturaIngresada = 0;
				temperaturaIngresada = InicializacionTemperatura.valorIngreso();
			
			ConvertidorTemperatura temp = new ConvertidorTemperatura(temperaturaIngresada);
			
			String seleccionTemperatura = temp.seleccionTemperaturaAConvertir();
			double valorConvertidoTemperatura = temp.realizarConversion(temperaturaIngresada, seleccionTemperatura);
			JOptionPane.showMessageDialog(null, temperaturaIngresada + " " + seleccionTemperatura 
					+ " es igual a: " + String.format("%.3f", valorConvertidoTemperatura));
			
		}else {
			double unidadIngresada;
			do {
				unidadIngresada = InicializacionUnidad.valorIngreso();
			} while(unidadIngresada < 0);
			
			ConvertidorUnidades unid = new ConvertidorUnidades(unidadIngresada);
			unid.realizarConversion();
			}
		
		continuar = JOptionPane.showConfirmDialog(null, "Desea continuar?", "Selecciona una opcion",
				JOptionPane.YES_NO_CANCEL_OPTION);
	} while(continuar == 0);
		JOptionPane.showMessageDialog(null, "Programa terminado");
	}
}
