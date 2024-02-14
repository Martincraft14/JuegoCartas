package es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Programa;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Pruebas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		
//		boolean check = true;
//		do {
//			System.out.print("Cuantas cartas quieres repartir (1-4): ");
//			try {
//				int numCartRep = (Integer.parseInt(sc.nextLine()));
//				if(numCartRep >= 1 && numCartRep <=4) {
//					System.out.println(numCartRep);
//				}else {
//					System.out.println("Por favor elija un numero valido");
//				}
//			} catch (Exception e) {
//				System.out.println("Por favor elija un numero valido");
//			}
//		} while (check);
		
		
		
		ArrayList<Integer> arListInt = new ArrayList();
		int[] arrInt = new int[9];
		arListInt.add(1);
		arListInt.add(2);
		arListInt.add(3);
		arListInt.add(4);
		arListInt.add(5);
		arListInt.add(6);
		arListInt.add(7);
		arListInt.add(8);
		arListInt.add(9);
		int i = 0;
		do {

			for (int j = 0; j < arrInt.length; j++) {
				System.out.printf("%d, ", arrInt[j]);
			}
			System.out.println("\n");
			for (int z = 0; z < arListInt.size(); z++) {
				int curr = arListInt.get(z);
				System.out.printf("%d, ", curr);
			}
			System.out.println("\n----------------------------");

			arrInt[i] = arListInt.remove(rnd.nextInt(arListInt.size()));
			i++;

		} while (arListInt.size() != 0);
		System.out.println("\n----------------------------");
		System.out.println("\n----------------------------");
		for (int j = 0; j < arrInt.length; j++) {
			System.out.printf("%d, ", arrInt[j]);
		}
		for (int z = 0; z < arListInt.size(); z++) {
			int curr = arListInt.get(z);
			System.out.printf("%d, ", curr);
		}
		

	}

}
