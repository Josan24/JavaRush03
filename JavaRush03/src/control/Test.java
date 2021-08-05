package control;

import java.util.ArrayList;

import modelo.Juego;
import utilidades.LecturaFichero;

public class Test {
	
	public void Test01() {
		
		ArrayList<Juego> lista =  LecturaFichero.cargaInicial();
		
		System.out.println(lista);
		
	}
	
	

}
