package Ciclos;

import javax.swing.JOptionPane;

public class Prob_10 {

	public static void main(String[] args) {

		int num = 0;
		float suma = 0;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero hasta el cual quiere la sucesion:"));
		
		for(int i = 1; i <= num; i++)
		{
			suma = suma + (1f/i);
			JOptionPane.showMessageDialog(null, "El termino " + i + " de la sucesion es: " + (1f/i) + "\n"
					+ "La suma hasta aqui es: " + suma);
		}
		
		JOptionPane.showMessageDialog(null, "La sumatoria de la sucesion hasta " + num + " es: " + suma);
	}

}
