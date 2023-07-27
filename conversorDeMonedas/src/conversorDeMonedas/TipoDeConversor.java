package conversorDeMonedas;

import javax.swing.JOptionPane;

public class TipoDeConversor {
	
	private static String[] opcionesConversor = {"Conversor de monedas", "Conversor de temperatura", 
			"Conversor de unidades de distancia"};
	
	
	
	public static String seleccionConversor() {
		String opcionEscogida = (String) JOptionPane.showInputDialog(
				null,
				"Selecciona el conversor que deseas utilizar",
				"Menu principal",
				JOptionPane.QUESTION_MESSAGE,
				null,
				opcionesConversor,
				opcionesConversor[0]);
		JOptionPane.showMessageDialog(null, "El conversor que escogiste fue: " + opcionEscogida);
		return opcionEscogida;
	}

	public static String getOpcionesConversor(int indice) {
		return opcionesConversor[indice];
	}
}
