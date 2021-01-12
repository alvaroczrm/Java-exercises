package repaso_navidad;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ventana implements ActionListener, WindowListener{ //con el actionlistener le damos la funcion al boton aceptar y windowlistener para cerrar ventana etc

		Frame ventana = new Frame("Eventos");
		Button btnAceptar = new Button("Aceptar");
		Button btnCancelar = new Button("Cancelar");
		Button btnVolver = new Button("Volver");
		Button btnSalir = new Button("Salir");

		public ventana()
		{
			ventana.setTitle("Eventos");
			ventana.setSize(230,100);
			ventana.setLayout(new FlowLayout());
			btnAceptar.addActionListener(this); //que "escucha"
			btnCancelar.addActionListener(this);
			btnVolver.addActionListener(this);
			btnSalir.addActionListener(this);
			ventana.addWindowListener(this);
			ventana.add(btnAceptar);
			ventana.add(btnCancelar);
			ventana.add(btnVolver);
			ventana.add(btnSalir);
			ventana.setResizable(false);
			ventana.setLocationRelativeTo(null);
			ventana.setVisible(true);
		}//ventana()
	public static void main(String[] args) 
	{
		new ventana();
	}//main
	@Override
	public void actionPerformed(ActionEvent eventoGenerado) 
	{
		if(eventoGenerado.getSource().equals(btnAceptar)) { //origen evento  = btnAceptar
			System.out.println("Pulsaste el botón aceptar shulo..");
		}//ifaceptar
		if(eventoGenerado.getSource().equals(btnCancelar)) {
		System.out.println("Pulsaste el botón cancelar shulo..");
		}//ifcancelar
		if(eventoGenerado.getSource().equals(btnVolver)) {
			System.out.println("Pulsaste el botón volver shulo..");
			}//ifvolver
		if(eventoGenerado.getSource().equals(btnSalir)) {
			System.exit(0); //cerrar por boton generado
			}//ifvolver
		
	}//actionPerformed
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0); //cerrar por boton de frame
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}//ventana
