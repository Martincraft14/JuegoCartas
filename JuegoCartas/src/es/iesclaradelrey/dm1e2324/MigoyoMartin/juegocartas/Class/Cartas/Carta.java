package es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Cartas;

public class Carta {
	
	private int numCart;
	private Palo palo;
	
	public Carta(int numCart, Palo palo) {
		this.numCart = numCart;
		this.palo = palo;
	}
	@Override
	public String toString() {
		return String.format("%d %s",numCart,palo);
	}
	public int getNumCart() {
		return numCart;
	}
	public Palo getPalo() {
		return palo;
	}
}
