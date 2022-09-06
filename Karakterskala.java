package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Karakterskala {

	public static void main(String[] args) {
		
		for (int elevnr=1; elevnr<=10; elevnr++) {
			
			String poengTxt = showInputDialog("Hvor mange poeng:");
			int karakter = parseInt(poengTxt);

			if ( karakter >= 90 && karakter <= 100) {
				System.out.println("Karakter A");
			} else if ( karakter >= 80 && karakter <= 89) {
				System.out.println("Karakter B");
			} else if ( karakter >= 60 && karakter <= 79) {
				System.out.println("Karakter C");
			} else if ( karakter >= 50 && karakter <= 59) {
				System.out.println("Karakter D");
			} else if ( karakter >= 40 && karakter <= 49) {
				System.out.println("Karakter E");
			} else if ( karakter >= 0 && karakter <= 39) {
				System.out.println("Karakter F");
			} else {
				System.out.println("Ugyldig poengsum");
				elevnr--;
			}
		}
	}

}
