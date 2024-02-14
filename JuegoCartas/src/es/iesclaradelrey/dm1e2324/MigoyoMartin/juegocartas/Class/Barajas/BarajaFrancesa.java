package es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Barajas;

import java.util.ArrayList;

import es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Cartas.Carta;
import es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Cartas.Palo;

public class BarajaFrancesa extends SupBarajas {

	private final static int TAMAÑOBARAJAFRANCESA = 52;

	public void crearCartasBaraja() {
		ArrayList<Carta> carta = new ArrayList<>(TAMAÑOBARAJAFRANCESA);
		
		for (int i = 0; i < 4; i++) {
			switch (i) {
			case 0:
				for (int j = 1; j <= 13; j++) {
					carta.add( new Carta(j, Palo.CORAZONES));
				}
				break;
			case 1:
				for (int j = 1; j <= 13; j++) {
					carta.add( new Carta(j, Palo.DIAMANTES));
				}
				break;
			case 2:
				for (int j = 1; j <= 13; j++) {
					carta.add( new Carta(j, Palo.PICAS));					
				}
				break;
			case 3:
				for (int j = 1; j <= 13; j++) {
					carta.add( new Carta(j, Palo.TREBOLES));
				}
				break;
			}

		}
		setCartasBaraja(carta);
	}
}
