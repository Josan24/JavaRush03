package utilidades;

import java.util.Scanner;

public class LecturaDatos {

 
    @SuppressWarnings("resource")
	public static String leerString() {
        return new Scanner(System.in).nextLine();
    }
    
    @SuppressWarnings("resource")
	public static int leerInteger() {
        return new Scanner(System.in).nextInt();
    }

    public static String leerString(String msg) {
        System.out.println(msg);
        return leerString();
    }
    
       public static int leerInteger(String msg) {
        System.out.print(msg);
        return LecturaDatos.leerInteger();
    }
       
    @SuppressWarnings("resource")
	public static boolean leerBoolean() {
    	return new Scanner(System.in).nextBoolean();
    }
    
    @SuppressWarnings("resource")
	public static boolean leerBoolean(String msg) {
    	System.out.print(msg);
    	return new Scanner(System.in).nextBoolean();
    }
    


}
