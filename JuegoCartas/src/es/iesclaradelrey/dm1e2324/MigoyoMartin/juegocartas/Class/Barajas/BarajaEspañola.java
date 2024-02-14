package es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Barajas;

import java.util.ArrayList;
import java.util.Iterator;

import es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Cartas.Carta;
import es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Cartas.Palo;

public class BarajaEspañola extends SupBarajas {

	private final static int TAMAÑOBARAJAESPAÑOLA = 40;

	@Override
	public void crearCartasBaraja() { 
		ArrayList<Carta> carta = new ArrayList<>(TAMAÑOBARAJAESPAÑOLA);

		for (int i = 0; i < 4; i++) {
			switch (i) {
			case 0:
				int r = 10;
				for (int j = 1; j <= 12; j++) {
					if (j <= 7) {
						carta.add(new Carta(j, Palo.ESPADAS));
					} else {
						j = r;
						carta.add(new Carta(j, Palo.ESPADAS));
						r++;
					}
				}
				break;
			case 1:
				r = 10;
				for (int j = 1; j <= 12; j++) {
					if (j <= 7) {
						carta.add(new Carta(j, Palo.COPAS));
					} else {
						j = r;
						carta.add(new Carta(j, Palo.COPAS));
						r++;
					}
				}
				break;
			case 2:
				r = 10;
				for (int j = 1; j <= 12; j++) {
					if (j <= 7) {
						carta.add(new Carta(j, Palo.BASTOS));
					} else {
						j = r;
						carta.add(new Carta(j, Palo.BASTOS));
						r++;
					}
				}
				break;
			case 3:
				r = 10;
				for (int j = 1; j <= 12; j++) {
					if (j <= 7) {
						carta.add(new Carta(j, Palo.OROS));
					} else {
						j = r;
						carta.add(new Carta(j, Palo.OROS));
						r++;
					}
				}
				break;
			}
		}
		setCartasBaraja(carta);
	}
}
