package Ciclos;

import javax.swing.JOptionPane;

public class Prob_9 {

	public static void main(String[] args) {

		int num = 0, suma = 0;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero hasta el cual quiere sumar:"));
		
		for(int i = num; i > 0; i = i - 1)
		{
			suma = suma + i;
		}
		
		JOptionPane.showMessageDialog(null, "La sumatoria desde el " + num + " hasta el 0 es: " + suma);
	}

}
