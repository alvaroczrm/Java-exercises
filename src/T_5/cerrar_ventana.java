package T_5;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class cerrar_ventana implements ActionListener, WindowListener{
	Frame ventana = new Frame("Cerrar");
	Button btnSalir = new Button("Salir");
	Button btnBoton = new Button("Boton");

	public cerrar_ventana() {
		ventana.setTitle("Cerrar");
		ventana.setSize(250, 100);
		ventana.setLayout(new FlowLayout());
		btnSalir.addActionListener(this);
		btnBoton.addActionListener(this);
		ventana.addWindowListener(this);
		ventana.add(btnBoton);
		ventana.add(btnSalir);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}// p cerrar ventana

	public static void main(String[] args) {
		new cerrar_ventana();
	}// main

	@Override
	public void actionPerformed(ActionEvent eventoGenerado) {
		if(eventoGenerado.getSource().equals(btnSalir)) {
			System.exit(0);
		}//if
		if(eventoGenerado.getSource().equals(btnBoton)) {
			System.out.println("Boton pulsado");
		}//if
	}//actionPerformed
	
	@Override
	public void windowActivated(WindowEvent arg0) {}

	@Override
	public void windowClosed(WindowEvent arg0) {}

	@Override
	public void windowClosing(WindowEvent arg0) {System.exit(0);}

	@Override
	public void windowDeactivated(WindowEvent arg0) {}

	@Override
	public void windowDeiconified(WindowEvent arg0) {}

	@Override
	public void windowIconified(WindowEvent arg0) {}

	@Override
	public void windowOpened(WindowEvent arg0) {}

	

}// cerrar ventana
