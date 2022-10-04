import java.io.File;

public class UD2_1 {

	public static void main(String[] args) {
		File f = new File("C:\\windows");
		System.out.println("Ruta: " + f.getPath());
		File[] archivos = f.listFiles();
		
		for(File archivo : archivos) {
			if(archivo.isHidden()) {
				System.out.println("Nombre: " + archivo.getName());
				System.out.println("Longitud: " + archivo.length());
				System.out.println("¿Se puede leer?");
				if(archivo.canRead()) {
					System.out.println("Si");
				}
				else System.out.println("No");
				System.out.println("¿Se puede escribir?");
				if(archivo.canWrite()) {
					System.out.println("Si");
				}
				else System.out.println("No");
				System.out.println();
			}
			
		}
			
	}

}
