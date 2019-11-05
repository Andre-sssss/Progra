package Ciclos;

import javax.swing.JOptionPane;

public class Prob_16 {

	public static void main(String[] args) {

		int muestra = 0, M = 0, F = 0;
		String sexo = " ";
		float altura = 0, peso = 0, alturaF = 0, alturaM = 0, pesoF = 0, pesoM = 0;
		
		muestra = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el tamaño de la muestra:"));
		
		for(int i = 1; i <= muestra; i++)
		{
			sexo = JOptionPane.showInputDialog("Introduzca su sexo:");
			altura = Float.parseFloat(JOptionPane.showInputDialog("Introduzca su altura:"));
			peso = Float.parseFloat(JOptionPane.showInputDialog("Introduzca su peso:"));
			
			if(sexo.charAt(0) == 'M' || sexo.charAt(0) == 'm')
			{
				alturaM = alturaM + altura;
				pesoM = pesoM + peso;
				M++;
			}
			if(sexo.charAt(0) == 'F' || sexo.charAt(0) == 'f')
			{
				alturaF = alturaF + altura;
				pesoF = pesoF + peso;
				F++;
			}	
		}
		
		JOptionPane.showMessageDialog(null, "Hombres\n"
				+ "Promedio de Peso: " + pesoM/M + "\nPromedio de altura: " + alturaM/M + "\n"
				+ "Mujeres\n"
				+ "Promedio de Peso: " + pesoF/F + "\nPromedio de altura: " + alturaF/F);
	}

}
