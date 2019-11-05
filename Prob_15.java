package Ciclos;

import javax.swing.JOptionPane;

public class Prob_15 {

	public static void main(String[] args) {
		
		int cantD = 0;
		float max = 0, min = 0, sueldo = 0;
		
		cantD = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de Directores:"));
		
		
		
		for(int i = 1; i <= cantD; i++)
		{
			sueldo = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el sueldo " + i + ":"));
			if(i == 1)
			{
				max = sueldo;
				min = sueldo;
			}
			
			if(sueldo > max)
				max = sueldo;
			
			if(sueldo < min)
				min = sueldo;
		}
	
		JOptionPane.showMessageDialog(null, "El sueldo maximo es $" + max + " y el minimo es $" + min);
	}

}
