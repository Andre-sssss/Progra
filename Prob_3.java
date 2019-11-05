package Ciclos;

import javax.swing.JOptionPane;

public class Prob_3 {

	public static void main(String[] args) {
		
		int cant = 0, max = 0, edad = 0;
		
		cant = Integer.parseInt(JOptionPane.showInputDialog("Cuantas edades va a introducir?"));
		
		for(int i = 1; i <= cant; i++)
		{
			edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad " + i));
			
			if (i == 0)
				max = edad;
			else
			{
				if(edad > max)
					max = edad;
			}
		}
		
		JOptionPane.showMessageDialog(null, "La edad mayor es " + max);
	}

}
