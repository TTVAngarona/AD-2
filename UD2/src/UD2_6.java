import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class UD2_6 {

	public static void main(String[] args) throws IOException {
	/*
	Realiza una clase UD2_6 que indique cuántas veces aparece una palabra dentro de un
	fichero de texto (puedes crearlo con el bloc de notas). Tanto el nombre del fichero como la
	palabra se deben pasar como argumentos. No distinguir mayúsculas/minúsculas. Incluye
	también tratamiento de excepciones.
	Pistas:
		- Métodos para cadenas substring e indexOf.
	*/
		String cadena = "";
		int contador = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("src\\Ficheros\\" + args[0]));
			String linea;
			while((linea = br.readLine()) != null) {
				cadena += linea.toLowerCase();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		cadena.indexOf(args[1]);
		cadena = cadena.substring(cadena.indexOf(
			      args[1])+args[1].length(),cadena.length());
		while (cadena.indexOf(args[1]) > -1) {
		      cadena = cadena.substring(cadena.indexOf(
		        args[1])+args[1].length(),cadena.length());
		      contador++; 
		}
		System.out.println(contador);
		
	}

}
