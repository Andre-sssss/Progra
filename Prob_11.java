package Ciclos;

import javax.swing.JOptionPane;

public class Prob_11 {

	public static void main(String[] args) {

		int num = 0;
		float suma = 0, n = 0;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero hasta el cual quiere la sucesion:"));
		
		for(int i = 1; i <= num; i++)
		{
			if(i % 2 == 1)
				n = (1f/i);
			else
				n = -(1f/i);
			
			suma = suma + n;
			JOptionPane.showMessageDialog(null, "El termino " + i + " de la sucesion es: " + n + "\n"
					+ "La suma hasta aqui es: " + suma);
		}
		
		JOptionPane.showMessageDialog(null, "La sumatoria de la sucesion hasta " + num + " es: " + suma);
	}

}
