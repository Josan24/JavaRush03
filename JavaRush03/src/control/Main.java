package control;

import Datos.Catalogo;
import gui.Menus;

public class Main {

	public static void main(String[] args) {


		new Test().Test01();

		opcionesMenuPrincipal();
		


	}
	
	public static void opcionesMenuPrincipal() {
		
		Catalogo c = new Catalogo();
		int option = Menus.menuInicial();
		
		switch(option) {
		
		case 1: 
			System.out.println("Estamos trabajando en ello");
			break;
		case 2: 
			
			System.out.println("Listado de todos los juegos");
			c.imprimirCatalogo();
			
			break;
		
		
		}
		
		
		
	}
	

}
