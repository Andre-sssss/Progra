package Ciclos;

import javax.swing.JOptionPane;

public class Prob_4 {

	public static void main(String[] args) {
		
		int cant = 0, pares = 0, neutros = 0, impares = 0, num = 0;
		
		cant = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros va a introducir?"));
		
		for(int i = 1; i <= cant; i++)
		{
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el siguiente numero"));
			
			if (num % 2 == 1)
				impares++;
			else
			{
				if(num == 0)
					neutros++;
				else
					pares++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Hay " + pares + " numeros pares\n"
				+ "Hay " + impares + " numeros impares\nHay " + neutros +" numeros neutros (ceros)");
	}

}
