package Ciclos;

import javax.swing.JOptionPane;

public class Prob_2 {
	
	public static void main(String[] args) {

		int numeros = 0, ceros = 0;
		float num = 0;
		
		numeros = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de numeros:"));
		
		for(int i = 1; i <= numeros; i++)
		{
			num = Float.parseFloat(JOptionPane.showInputDialog("Introduzca un numero:"));
			
			if(num == 0)
				ceros++;
		}
		
		JOptionPane.showMessageDialog(null, "Hay " + ceros + " cero(s)");
	}

}
