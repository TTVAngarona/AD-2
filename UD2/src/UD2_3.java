import java.io.File;
import java.io.IOException;

public class UD2_3 {

	public static void main(String[] args) {
	/*	boolean resultado;
		File directorio = new File("C:\\DAM2");
		resultado = directorio.mkdir();
		if(resultado)
			System.out.println("Directorio Creado");
		else {
			System.out.println("No se pudo crear el directorio");
			System.exit(-1);
		}
		try {
			File fichero = new File("C:\\DAM2\\Alberto.txt");
			resultado = fichero.createNewFile();
			if (resultado)
				System.out.println("Archivo creado");
			else 
				System.out.println("No se pudo crear el archivo");
		}
		catch (IOException e) {
			System.out.println("Se produjo el error: " + e.getMessage());
		}
		
	 */
		File fichero = new File("C:\\DAM2\\Alberto.txt");
		if(fichero.delete()) {
			System.out.println("El fichero ha sido borrado");
		}
		else 
			System.out.println("El fichero no ha sido borrado o no existe para ser borrado");
		File directorio = new File("C:\\DAM2");
		if(directorio.delete()) {
			System.out.println("El directorio ha sido borrado");
		}
		else 
			System.out.println("El directorio no ha sido borrado o no existe para ser borrado");
	}
	
}
