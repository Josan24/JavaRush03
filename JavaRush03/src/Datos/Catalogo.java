package Datos;

import java.util.ArrayList;
import java.util.List;

import modelo.Juego;

public class Catalogo {

	ArrayList<Juego> catalogo;

	

	
	public Catalogo() {
		super();
	}


	

	public Catalogo(ArrayList<Juego> catalogo) {
		super();
		this.catalogo = catalogo;
	}




	public ArrayList<Juego> getCatalogo() {
		return catalogo;
	}



	public void setCatalogo(ArrayList<Juego> catalogo) {
		this.catalogo = catalogo;
	}

	


	@Override
	public String toString() {
		return "Catalogo [catalogo=" + catalogo + "]";
	}




	public void imprimirCatalogo() {
		
		Juego[] j = new Juego[0];
		
		Juego[] arrayJuegos = this.catalogo.toArray(j);
		
		for (int i = 0; i < arrayJuegos.length; i++) {
			
			System.out.println(arrayJuegos[i].toString());
			
		}
		
		
	}
	
	
}
