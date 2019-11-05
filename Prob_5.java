package Ciclos;

import javax.swing.JOptionPane;

public class Prob_5 {

	public static void main(String[] args) {
		
		int cant = 0, calif = 0, total = 0;
		
		cant = Integer.parseInt(JOptionPane.showInputDialog("Cuantas calificaciones va a introducir?"));
		
		for(int i = 1; i <= cant; i++)
		{
			calif = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la calificacion del alumno " + i));
			
			total = total + calif;
		}
		
		JOptionPane.showMessageDialog(null, "La calificacion final es " + total/cant);
	}

}
