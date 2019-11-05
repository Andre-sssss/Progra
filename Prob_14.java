package Ciclos;

import javax.swing.JOptionPane;

public class Prob_14 {

	public static void main(String[] args) {

		int n1 = 0, n2 = 0, n = 0, spar = 0;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca N1:"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca N2:"));
		
		if(n2 < n1)
		{
			n = n2;
		 	n2 = n1;
		 	n1 = n;
		}
		
		if(n1 % 2 == 1)
		 	n1++;
		 		
		 if(n2 % 2 == 1)
		 	n2 = n2 - 1;
		
		for(int i = n1; i <= n2; i = i + 2)
			spar = spar + i;
	
		JOptionPane.showMessageDialog(null, "La suma de los numeros pares entre N1 y N2 es: " + spar);
	}

}
