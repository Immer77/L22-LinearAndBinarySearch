package soegningelevopgaver;

import java.util.ArrayList;

public class SoegningApp {

	 
	
	public static void main(String[] args) {
		Soegning s = new Soegning();
		
		// Kode til afprøvning af opgave 1
		// Opgave 1
//		talArray[2] = 15;
//		System.out.println("Er der et ulige tal i talArray ? " + s.findUlige(talArray));

		// Opgave 2
		int[] talArray1 = {7,56,34,3,7,14,13,4};
		System.out.println("Er der et ulige tal i talArray ? " + s.findHighestNumberCloseToFifteen(talArray1));

		// Opgave 3
		int[] talArray2 = {7, 9, 13, 7, 9, 13};
		System.out.println("Der er et duplicate tal lige efter hinanden " + s.twoDuplicatesInARow(talArray2));
		int[] talArray3 = {7, 9, 13, 13, 9, 7};
		System.out.println("Der er et duplicate tal lige efter hinanden " + s.twoDuplicatesInARow(talArray3));

		// Opgave 5
		System.out.println(s.calculateKvadratrodLinear(81));
		System.out.println(s.calculateKvadratRodBinary(49));
		// Her tilføjes kode til at afprøve opgaverne 2,3,5,6 og 7

		// Opgave 6
		ArrayList<Integer> randomTal = new ArrayList<>();
		randomTal.add(6);
		randomTal.add(4);
		randomTal.add(8);
		randomTal.add(13);
		randomTal.add(2);
		System.out.println(s.find(randomTal, 13));
		System.out.println(randomTal);

	}

}
