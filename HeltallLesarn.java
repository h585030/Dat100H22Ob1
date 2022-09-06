package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class HeltallLesarn {

	public static void main(String[] args) {
		
		String oppgiHeltall = showInputDialog("Oppgi et heltall");
		int n = parseInt(oppgiHeltall);
		
		if ( n > 0) {
			int i = 1;
			int sum = i;
			do {
				sum *= i;
				i++;
			} while (i <= n);
			System.out.println(sum);
		} else {
			System.out.println("prøv igjen");
		}

	}

}
