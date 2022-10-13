import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UD2_5 {

	public static void main(String[] args) throws IOException {
	/*
	UD2.5 Realiza una clase UD2_5 que sea capaz de ordenar alfabéticamente las líneas contenidas
	en un fichero de texto (puedes crearlo con el bloc de notas). El nombre del fichero que contiene
	las líneas se debe pasar como argumento. El nombre del fichero resultado ya ordenado debe ser
	el mismo que el original añadiéndole la coletilla _sort al nombre. Incluye también tratamiento
	de excepciones.
	Pistas:
	- Utiliza una colección (p.ej. ArrayList) donde guardar las líneas leídas del fichero y el
	método estático Collections.sort para ordenar dicha colección.
	- Para formar el nuevo nombre de fichero puedes usar el método para cadenas substring.
	
	 */
		ArrayList <String> lista = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("src\\Ficheros\\" + args[0]));
			String linea;
			while((linea = br.readLine()) != null) {
				lista.add(linea);
			}
			br.close();
		} catch(IOException e){
			e.printStackTrace();
		}
		lista.sort(null);
		try {
		BufferedWriter bw = new BufferedWriter (new FileWriter("src\\Ficheros\\"+ args[0] + "_sort"));
		for(String s : lista) {
			bw.write(s);
			bw.newLine();
		}
		bw.close();
		} catch(IOException o) {
			o.printStackTrace();
		}
		

	}

}
