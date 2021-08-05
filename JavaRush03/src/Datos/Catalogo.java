package Datos;

import java.util.List;

import modelo.Juego;

public class Catalogo {

	List<Juego> catalogo;

	public Catalogo() {
		super();
	}

	public Catalogo(List<Juego> catalogo) {
		super();
		this.catalogo = catalogo;
	}

	public List<Juego> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(List<Juego> catalogo) {
		this.catalogo = catalogo;
	}

	@Override
	public String toString() {
		return "Catalogo [catalogo=" + catalogo + "]";
	}
	
	public void agregarJuego(Juego j) {
		catalogo.add(j);
	}
		
	
	
	
}
