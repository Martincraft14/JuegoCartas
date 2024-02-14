package es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Programa;

import java.util.Scanner;

import es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Barajas.BarajaEspañola;
import es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Barajas.BarajaFrancesa;
import es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Barajas.SupBarajas;
import es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Juego.Juego;
import es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Jugador.Jugador;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Juego juego = new Juego(crearBaraja(sc),crearJugadores(sc));
		
		juego.repartir();
		juego.ganador();
	}

	private static SupBarajas crearBaraja(Scanner sc) {
		boolean check = true;
		do {
			System.out.println("Que tipo de baraja quieres?");
			System.out.printf("E (Española) F (Francesa): ");
			String a = sc.nextLine();
			if (a.length() >= 0 && a.length() < 2) {
				if (a.equalsIgnoreCase("E")) {
					System.out.println("Has elejido la baraja española");
					SupBarajas barajaEspañola = new BarajaEspañola();
					barajaEspañola.crearCartasBaraja();
					return barajaEspañola;
				} else if (a.equalsIgnoreCase("F")) {
					System.out.println("Has elejido la baraja francesa");
					SupBarajas barajaFrancesa = new BarajaFrancesa();
					barajaFrancesa.crearCartasBaraja();
					return barajaFrancesa;
				} else {
					System.out.println("Elija por favor una opcion valida");
				}

			} else {
				System.out.println("Elija por favor una opcion valida");
			}

		} while (check);
		return null;
	}

	private static Jugador[] crearJugadores(Scanner sc) {
		boolean check = true;
		do {
			System.out.print("Elija el numero de jugadores (2-6)");
			try {
				int numJug = Integer.parseInt(sc.nextLine());
				if (numJug >= 2 && numJug <= 6) {
					Jugador[] jug = new Jugador[numJug];
					for (int i = 0; i < jug.length; i++) {
						jug[i] = new Jugador(i);
					}
					return jug;
				} else {
					System.out.println("Por favor elija un numero de jugadores valido.");
				}
			} catch (Exception e) {
				System.out.println("Por favor elija un numero de jugadores valido.");
			}

		} while (check);
		return null;
	}
	
	public static void repartir() {
		
		
	}
	
	
}











































