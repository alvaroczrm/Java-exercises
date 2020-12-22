package T_4;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class AwtFlow {
	//Componentes
	Frame ventana = new Frame();//contenedor
	Button btnAceptar = new Button("Aceptar");
	Button btnCerrar = new Button("Cerrar");
	Button btnGuardar = new Button("Guardar");
	Button btnAbir = new Button("Abrir");


	public AwtFlow()
	{
		ventana.setTitle("FlowLayout");
		ventana.setLayout(new FlowLayout());
		ventana.setSize(260, 200);
		//ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		
		ventana.add(btnAceptar);
		ventana.add(btnCerrar);
		ventana.add(btnGuardar);
		ventana.add(btnAbir);

		ventana.setVisible(true);
	}
	public static void main(String[] args) {
		new AwtFlow();
	}

}
