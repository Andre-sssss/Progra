package Ciclos;

import javax.swing.JOptionPane;

public class Prob_13 {

	public static void main(String[] args) {

		int cantT = 0;
		float sueldo = 0;
		
		cantT = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de trabajadores:"));
		
		for(int i = 1; i <= cantT; i++)
		{
			sueldo = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el sueldo " + i + ":"));
			
			if(sueldo < 1000)
				sueldo = sueldo*1.15f;
			else
				if(sueldo <= 3000)
					sueldo = sueldo*1.12f;
				else
					sueldo = sueldo*1.1f;
			JOptionPane.showMessageDialog(null, "El nuevo sueldo es: " + sueldo);
		}
	
	}

}