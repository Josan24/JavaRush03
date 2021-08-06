package utilidades;

import java.util.Scanner;

/**
 * @author Antonio Santos
 * 
 *         Clase para leer datos por teclado, contempla varios tipos de dato
 *         (String, int, boolean)
 *
 */
public class LecturaDatos {

	/**
	 * Clase que lee un String, devolviendo dicho String
	 * 
	 * @return String
	 */
	@SuppressWarnings("resource")
	public static String leerString() {
		return new Scanner(System.in).nextLine();
	}

	/**
	 * Clase que lee un int, devolviendo dicho int
	 * 
	 * @return int
	 *
	 */
	@SuppressWarnings("resource")
	public static int leerInteger() {
		return new Scanner(System.in).nextInt();
	}

	/**
	 * Clase que muestra mensaje por teclado y lee un String, devolviendo dicho
	 * String
	 * 
	 * @return String
	 */
	public static String leerString(String msg) {
		System.out.println(msg);
		return leerString();
	}

	/**
	 * Clase que muestra mensaje por teclado y lee un int, devolviendo dicho int 
	 * @return String
	 */
	public static int leerInteger(String msg) {
		System.out.print(msg);
		return LecturaDatos.leerInteger();
	}

	/**
	 * Clase que lee un boolean, devolviendo dicho boolean 
	 * @return String
	 */
	@SuppressWarnings("resource")
	public static boolean leerBoolean() {
		return new Scanner(System.in).nextBoolean();
	}

	/**
	 * Clase que muestra mensaje por teclado y lee un boolean, devolviendo dicho boolean 
	 * @return String
	 */
	@SuppressWarnings("resource")
	public static boolean leerBoolean(String msg) {
		System.out.print(msg);
		return new Scanner(System.in).nextBoolean();
	}

}
