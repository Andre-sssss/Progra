package Ciclos;

import javax.swing.*;

public class Prob_1 {

	public static void main(String[] args) {
		
		int n = 0;
		float nom = 0, sueldo = 0;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de empleados:"));
		
		for(int i = 1; i <=n; i++)
		{
			sueldo = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el sueldo del empleado " + i));
			nom = nom + sueldo;
		}
		
		JOptionPane.showMessageDialog(null, "La nomina de la compañia sera " + nom);
	}

}