package es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Barajas;

import java.util.ArrayList;

import es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Cartas.Carta;

public abstract class SupBarajas {
	
	private ArrayList<Carta> cartasBaraja = new ArrayList<>();

	public abstract void crearCartasBaraja();

	public ArrayList<Carta> getCartasBaraja() {
		return cartasBaraja;
	}

	public void setCartasBaraja(ArrayList<Carta> cartasBaraja) {
		this.cartasBaraja = cartasBaraja;
	}
}
