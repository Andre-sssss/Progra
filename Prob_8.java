package Ciclos;

import javax.swing.JOptionPane;

public class Prob_8 {

	public static void main(String[] args) {
		
		int cant = 0, cantp = 0, n = 0, spar = 0, simpar = 0, ceros = 0;
		
		cant = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de numeros que quiere que se lean:"));
		
		for(int i = 0; i < cant ;i++)
		{
			n = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:"));
			
			if(n % 2 == 1)
				simpar = simpar + n;
			else
			{
				cantp++;
				spar = spar + n;
				
				if(n == 0)
					ceros++;
			}		
		}
		
		JOptionPane.showMessageDialog(null, "La suma de los impares es: " + simpar +"\n"
				+ "El promedio de los pares (incluyendo ceros) es: " + spar/cantp + "\n"
				+ "El promedio de los pares (no incluyendo ceros) es: " + spar/(cantp-ceros));
		
	}

}