package T_4;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class firstWindow 
{

	Frame ventana = new Frame();
	Panel pnlPanelNorte = new Panel();
	Panel pnlPanelSur = new Panel();
	Panel pnlPanelCentro = new Panel();
	Button btnAceptar = new Button("Aceptar");
	Button btnCancelar = new Button("Cancelar");
	Button btnVolver = new Button("Volver");
	Button btnCambiar = new Button("Cambiar");
	Button btnSalir = new Button("Salir");

	// constructor de la clase
	public firstWindow() {
		ventana.setBounds(50, 50, 250, 250); //ubicacion
		ventana.setTitle("Ventana");
		ventana.setBackground(Color.red); //color de fondo
		pnlPanelNorte.setBackground(Color.yellow);
		ventana.setLayout(new GridLayout(3,3)); // importamos una nueva distribuición para que el boton no ocupe toda la pantalla
		pnlPanelNorte.add(btnAceptar);
		ventana.add(pnlPanelNorte); //añade el boton
		ventana.add(pnlPanelCentro);
		ventana.add(btnVolver);
		pnlPanelSur.add(btnSalir);
		ventana.add(pnlPanelSur);
		ventana.setResizable(true); //ajuste tamaño
		ventana.setVisible(true); //visibilidad
		
	}
	public static void main(String[] args) 
	{
		new firstWindow();
	}
}
