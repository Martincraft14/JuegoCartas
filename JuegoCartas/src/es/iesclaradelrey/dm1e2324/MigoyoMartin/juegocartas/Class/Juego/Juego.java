package es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Juego;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Barajas.BarajaEspañola;
import es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Barajas.BarajaFrancesa;
import es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Barajas.SupBarajas;
import es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Cartas.Carta;
import es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Jugador.Jugador;

public class Juego {
	private final static Scanner sc = new Scanner(System.in); 
	private final static Random rnd = new Random();
	
	private Jugador[] jugador;
	private SupBarajas baraja;

	public Juego(SupBarajas baraja, Jugador[] jugador) {
		this.baraja = baraja;
		this.jugador = jugador;
	}

	
	public void repartir() {
		int numRonda = 1;
		boolean check = true;
		do {
			System.out.printf("Ronda numero %d\n",numRonda);
			int numCartas = numCartasRep();
			for (int i = 0; i < jugador.length; i++) {
				for(int j = 0; j < numCartas; j++) {
					if(baraja.getCartasBaraja().size() != 0) {
						Carta cartaRep = baraja.getCartasBaraja().remove(rnd.nextInt(baraja.getCartasBaraja().size()));
						jugador[i].añadirCartasJug(cartaRep);
						jugador[i].setPuntuacion(cartaRep);
					}else {
						check = false;
					}
					
				}	
			}
			System.out.println("-".repeat(30));
			System.out.printf("Puntuacion en la ronda %d\n",numRonda);
			calcularPrimero(jugador);
			System.out.println("-".repeat(30));
			
			numRonda++;
		} while (check);
		
		
		
	}


	private void calcularPrimero(Jugador[] jugador2) {
		Arrays.sort(jugador2);
		for (Jugador jugador : jugador2) {
			System.out.printf("Jugador %d --> %d puntos.\n",(jugador.getNumJug()+1),jugador.getPuntuacion());
		}
		
	}


	public int numCartasRep() {
		
		boolean check = true;
		do {
			System.out.print("Cuantas cartas quieres repartir (1-4): ");
			try {
				int numCartRep = (Integer.parseInt(sc.nextLine()));
				if(numCartRep >= 1 && numCartRep <=4) {
					return numCartRep;
				}else {
					System.out.println("Por favor elija un numero valido");
				}
			} catch (Exception e) {
				System.out.println("Por favor elija un numero valido");
			}
		} while (check);
		return 9999;
	}

	public void ganador() {
		Arrays.sort(jugador);
		System.out.printf("-".repeat(30));
		System.out.println();
		System.out.printf("El ganador es el jugador %d con %d puntos\n",jugador[0].getNumJug()+1,jugador[0].getPuntuacion());
		
		for (int i = 0; i < jugador.length; i++) {
			
			System.out.printf("%dª posicion : Jugador %d\n",i+1,jugador[i].getNumJug()+1);
			System.out.print("[");
			mostrarCartas(jugador[i]);
			
		}
	}


	private void mostrarCartas(Jugador jugador2) {
		if(baraja.getClass() == BarajaEspañola.class) {
			for (int i = 0; i < jugador2.getCartasJug().size(); i++) {
				if(jugador2.getCart(i).getNumCart() <= 7) {
					System.out.printf("%s, ", jugador2.getCart(i).toString());
				}else {
					switch (jugador2.getCart(i).getNumCart()) {
					case 10:
						System.out.printf("Sota de %s, ",jugador2.getCart(i).getPalo());
						break;
					case 11:
						System.out.printf("Caballo de %s, ",jugador2.getCart(i).getPalo());
						break;
					case 12:
						System.out.printf("Rey de  %s, ",jugador2.getCart(i).getPalo());
						break;
					}
				}
			}
			System.out.println("]");
		}
		if(baraja.getClass() == BarajaFrancesa.class) {
			for (int i = 0; i < jugador2.getCartasJug().size(); i++) {
				if(jugador2.getCart(i).getNumCart() <= 10) {
					System.out.printf("%s, ", jugador2.getCart(i).toString());
				}else {
					switch (jugador2.getCart(i).getNumCart()) {
					case 11:
						System.out.printf("Sota de %s, ",jugador2.getCart(i).getPalo());
						break;
					case 12:
						System.out.printf("Reina de %s, ",jugador2.getCart(i).getPalo());
						break;
					case 13:
						System.out.printf("Rey de %s, ",jugador2.getCart(i).getPalo());
						break;
					}
				}
			}
			System.out.println("]");
		}
	}

}























