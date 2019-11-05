package Ciclos;

import javax.swing.JOptionPane;

public class Prob_17 {

	public static void main(String[] args) {

		int N = 0, f1 = 0, f2 = 1, n = 0;
		
		N = Integer.parseInt(JOptionPane.showInputDialog("Hasta donde quiere llegar la sucesion: "));
		
		JOptionPane.showMessageDialog(null, "F1: " +n);
		JOptionPane.showMessageDialog(null, "F2: " +f2);
		
		for(int i = 3; i <= N; i++)
		{
			n = f1 + f2;
			f1 = f2;
			f2 = n;
			
			JOptionPane.showMessageDialog(null, "F"+ i + ": " +n);
		}
		
	}

}