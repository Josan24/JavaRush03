package control;

import Datos.Catalogo;
import gui.PantallaMenus;
import services.GestionCatalogo;
import utilidades.LecturaDatos;

public class Menu {
	public static void controlMenu(Catalogo c) {
		int option = 0;

		do {
			option = PantallaMenus.menuInicial();

			switch (option) {

			case 1:
				GestionCatalogo gc = new GestionCatalogo();
				System.out.println("Añadir un nuevo juego");
				gc.agregarAlCatalogo(c);

				break;
			case 2:

				System.out.println("Listado de juegos Genero:\"plataforma\"");
				listadoJuegosGeneroPlataforma(c);

				break;
			case 3:
				System.out.println("Listado de juegos");
				GestionCatalogo gc2 = new GestionCatalogo();
				gc2.generarInforme(c);

				break;
			case 4:
				System.out.println("Juegos para consolas de Nintendo");
				break;
			case 5:
				System.out.println("Listado de editores");
				break;
			case 6:
				System.out.println("Los juegos del siglo XX");
				break;
			case 7:
				System.out.println("Gestión de juegos (Edit, Delete)");
				// Buscar juego
				
				controlMenuEdicion(c);

				break;
			case 8:
				System.out.println("Listados de juegos (filtrados por todo tipo de géneros)");
				break;
			case 9:
				System.out.println("Los juegos que aparecen en años pares");
				break;
			case 0:
				System.out.println("Salir");
				break;
			}

		} while (option != 0);

	}

	/**
	 * Lista todos los juegos del genero plataforma del catalogo
	 * 
	 * @author Jose Antonio Ramos
	 * @param Catalogo c
	 */
	public static void listadoJuegosGeneroPlataforma(Catalogo c) {

		String genero = "Platform";

		System.out.println(new GestionCatalogo().listaPorGenero(c, genero));

	}

	public static void controlMenuEdicion(Catalogo c) {
		
		GestionCatalogo gc = new GestionCatalogo();
		int option = 0;

		do {
			PantallaMenus.menuGestionJuegos();
			option = LecturaDatos.leerInteger("Seleciona una opcion: ");

			switch (option) {

			case 1:
				System.out.println("Editar juego");
				

				break;
			case 2:

				System.out.println("Eliminar Juego");
				gc.eliminarJuego(c);

				break;
			case 3:
				
				option = 0;

			}

		} while (option != 0);
	}

}
