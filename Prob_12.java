package Ciclos;

import javax.swing.JOptionPane;

public class Prob_12 {

	public static void main(String[] args) {

		int cantT = 0;
		float sueldo = 0;
		
		cantT = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de trabajadores:"));
		
		for(int i = 1; i <= cantT; i++)
		{
			sueldo = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el sueldo " + i + ":"));
			
			if(sueldo < 8000)
			{
				sueldo = sueldo*1.15f;
				JOptionPane.showMessageDialog(null, "El nuevo sueldo es: " + sueldo);
			}
			else
				JOptionPane.showMessageDialog(null, "El sueldo se mantiene en: " + sueldo);
		}
	
	}

}
