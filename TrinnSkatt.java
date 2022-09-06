package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class TrinnSkatt {

	public static void main(String[] args) {
		
		String bruttoloennTxt = showInputDialog("Bruttolønn:");
		double bruttoloenn = parseInt(bruttoloennTxt);
		double skatt = 0;
		
		if ( bruttoloenn >= 0 && bruttoloenn <= 190349) {
			System.out.println("Ingen trinnskatt");
		}
		
		if ( bruttoloenn >= 190350 && bruttoloenn <= 267899) {
			System.out.println("1,7% trinnskatt");
			skatt = (bruttoloenn-190350)*0.017;
			System.out.println("Etter trinn 1: " + skatt);
		} else if (bruttoloenn >= 267900) {
			System.out.println("1,7% trinnskatt");
			skatt = (267899-190350)*0.017;
			System.out.println("Etter trinn 1: " + skatt);
		}
		
		if ( bruttoloenn >= 267900 && bruttoloenn <= 643799) {
			System.out.println("4,0% trinnskatt");
			skatt += (bruttoloenn-267900)*0.040;
			System.out.println("Etter trinn 2: " + skatt);
		} else if (bruttoloenn >= 643800) {
			System.out.println("4,0% trinnskatt");
			skatt += (643799-267900)*0.040;
			System.out.println("Etter trinn 2: " + skatt);
		}
		
		if ( bruttoloenn >= 643800 && bruttoloenn <= 969199) {
			int Bosettelse = showConfirmDialog(null, "Er du bosatt i Troms eller Finnmark?", "Bosettelse", YES_NO_OPTION);
			if ( Bosettelse == YES_OPTION) {
				System.out.println("Det blir 11,4% i trinnskatt, så summen etter trinn 3, blir da:");
				skatt += (bruttoloenn-643800)*0.114;
				System.out.println(skatt);
			} else {
				System.out.println("13,4% trinnskatt");
				skatt += (bruttoloenn-643800)*0.134;
				System.out.println("Etter trinn 3: " + skatt);
			}
		} else if ( bruttoloenn >= 969200) {
			int Bosettelse = showConfirmDialog(null, "Er du bosatt i Troms eller Finnmark?", "Bosettelse", YES_NO_OPTION);
			if ( Bosettelse == YES_OPTION) {
				System.out.println("Det blir 11,4% i trinnskatt, så summen etter trinn 3, blir da:");
				skatt += (969199-643800)*0.114;
				System.out.println(skatt);
			} else {
				System.out.println("13,4% trinnskatt");
				skatt += (969199-643800)*0.134;
				System.out.println("Etter trinn 3: " + skatt);
			}
		}
		
		if ( bruttoloenn >= 969200 && bruttoloenn <= 1999999) {
			System.out.println("16,4% trinnskatt");
			skatt += (bruttoloenn-969200)*0.164;
			System.out.println("Etter trinn 4: " + skatt);
		} else if (bruttoloenn >= 2000000) {
			System.out.println("16,4% trinnskatt");
			skatt += (1999999-969200)*0.164;
			System.out.println("Etter trinn 4: " + skatt);
			System.out.println("17,4% trinnskatt");
			skatt += (bruttoloenn-2000000)*0.174;
			System.out.println("Etter trinn 5: " + skatt);
		}
	}
}