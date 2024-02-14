package es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Jugador;

import java.util.ArrayList;

import es.iesclaradelrey.dm1e2324.MigoyoMartin.juegocartas.Class.Cartas.Carta;

public class Jugador implements Comparable<Jugador>{

	private int numJug;
	private int puntuacion;
	private ArrayList<Carta> cartasJug = new ArrayList<>();

	public Jugador(int numJug) {
		this.numJug = numJug;

	}
	
	public int getNumJug() {
		return numJug;
	}
	public void añadirCartasJug(Carta cartasJug) {
		this.cartasJug.add(cartasJug);
	}
	public ArrayList<Carta> getCartasJug() {
		return cartasJug;
	}
	public void puntuacion() {
	//	cartasJug
	}
	
	public void setPuntuacion(Carta carta) {
		this.puntuacion += carta.getNumCart();
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	
	@Override
	public String toString() {
		return String.format("Jugador %d\n %s",numJug,cartasJug );
	}

	@Override
	public int compareTo(Jugador obj) {
		
		return Integer.compare(obj.getPuntuacion(), this.puntuacion);
	}
	public Carta getCart(int numCart){
		return cartasJug.get(numCart);
	}
}
