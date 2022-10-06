import java.io.File;
import java.util.Scanner;

public class UD2_2 {

	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("No hay ningun argumento.");
		}
		if(args.length!=0) {
			String ruta = args[0];
			System.out.println(existe(ruta));
		}
		 
	}
	public static boolean existe(String ruta) {
		File f = new File(ruta);
		if(f.exists()) {
			return true;
		}
		else return false;
	}

}
