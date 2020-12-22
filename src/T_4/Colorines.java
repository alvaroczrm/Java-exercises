package T_4;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Colorines {
	Frame ventana = new Frame("colorines"); // con este nuevo constructor ya aportamos un titulo
	Color[] colores = {Color.red, Color.white, Color.black, Color.blue, Color.gray, Color.cyan, Color.green, Color.magenta, Color.orange};
	public Colorines(){
		ventana.setBounds(50, 50, 250, 250);
		ventana.setLayout(new GridLayout(3,3));
		for(int i=0;i<9;i++) {
			Panel p = new Panel();
			p.setBackground(colores[i]);
			ventana.add(p);
			
		}
		ventana.setResizable(false);
		ventana.setVisible(true);
	}
	public static void main(String[] args) {
		new Colorines();
	}

}
