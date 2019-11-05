package Ciclos;

import javax.swing.JOptionPane;

public class Prob_7 {

	public static void main(String[] args) {
		
		float cant = 0, interes = 0;
		
		cant = Float.parseFloat(JOptionPane.showInputDialog("Cual fue la cantidad prestada?"));
		interes = Float.parseFloat(JOptionPane.showInputDialog("De cuanto fue el interes anual?"))/12;
		for(int i = 0; i <= 12; i++)
		{			
			JOptionPane.showMessageDialog(null, "Mes " + i + ":\n"+ cant);
			cant = cant + cant*interes/100;
		}
	}

}
