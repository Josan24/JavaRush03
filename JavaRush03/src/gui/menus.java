package gui;

import utilidades.LecturaDatos;

public class menus {
	
	public static int menuInicial() {
		int opcion = 0;
        /*	**** Menú inicial ****
         * 	1)Gestión de juegos (altas)
         * 	2)Listado de juegos Género:"plataforma"
         * 	3)Listado de juegos
         * 	4)Juegos para consolas de Nintendo
         * 	5)Listado de editores
         * 	6)Los juegos del siglo XX
         * 	7)Gestión de juegos (Edit, Delete)
         * 	8)Listados de juegos (filtrados por todo tipo de géneros)
         * 	9)Los juegos que aparecen en años pares
         * 	Seleciona una opción: 
         */

        System.out.print("**** Menú inicial ****\n" +
            "1) Gestión de juegos (altas)\n" +
            "2) Listado de juegos Género:\"plataforma\"\n" +
            "3) Listado de juegos\n" +
            "4) Juegos para consolas de Nintendo\n" +
            "5) Listado de editores\n" +
            "6) Los juegos del siglo XX\n" +
            "7) Gestión de juegos (Edit, Delete)\n" +
            "8) Listados de juegos (filtrados por todo tipo de géneros)\n" +
            "9) Los juegos que aparecen en años pares\n");
        opcion = LecturaDatos.leerInteger("Seleciona una opción: ");
           
        return opcion;
	}
	
	public static int menuGestionJuegos() {
		int opcion = 0;
        /*	**** Menú Gestión de Juegos ****
         * 	1)Editar Juego
         * 	2)Eliminar Juego
         * 	Seleciona una opción: 
         */

        System.out.print("**** Menú Gestión de Juegos ****\n" +
            "1) Editar Juego\n" +
            "2) Eliminar Juego\n");
        opcion = LecturaDatos.leerInteger("Seleciona una opción: ");
           
        return opcion;
	}
	
	public static int menuEditarJuego() {
		int opcion = 0;
        /*	**** Menú Editar Juego ****
         * 	1)Nombre
         * 	2)Plataforma
         * 	3)Año
         * 	4)Genero
         * 	5)Editor
         * 	Seleciona campo a editar:
         */

        System.out.print("**** Menú Editar Juego ****\n" +
    		"1)Nombre\n" +
    		"2)Plataforma\n" +
    		"3)Año\n" +
    		"4)Genero\n" +
    		"5)Editor\n");
        opcion = LecturaDatos.leerInteger("Seleciona campo a editar: ");
           
        return opcion;
	}

}
