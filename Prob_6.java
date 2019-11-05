package Ciclos;

import javax.swing.JOptionPane;

public class Prob_6 {

	public static void main(String[] args) {

		int fact = 0, total = 0;
		
		fact = Integer.parseInt(JOptionPane.showInputDialog("Factorial de:"));
		total = fact;
		
		for(int i = fact - 1; i > 0; i = i - 1)
		{			
			total = total * i;
		}
		
		if(fact == 0)
			total = 1;
		
		JOptionPane.showMessageDialog(null, "El factorial de " + fact + " es " + total);
	}

}
