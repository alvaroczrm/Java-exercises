package T_4;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class ej_1 {

	Frame ventana = new Frame("Conversión de temperaturas");
	Label lblCelsius = new Label("Celsius");
	Label lblFahrenheit = new Label("Fahrenheit");
	TextField txtCelsius = new TextField(20);
	TextField txtFahrenheit = new TextField(20);
	Button btnCelsius = new Button("Celsius a Fahrenheit");
	Button btnFahrenheit = new Button("Fahrenheit a Celsius");
	
	public ej_1(){
		ventana.setLayout(new GridLayout(2,3));
        ventana.add(lblCelsius);
        ventana.add(txtCelsius);
        ventana.add(lblFahrenheit);
        ventana.add(txtFahrenheit);
        ventana.add(btnCelsius);
        ventana.add(btnFahrenheit);
        
        ventana.setSize(650,100);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		new ej_1();
	}

}
