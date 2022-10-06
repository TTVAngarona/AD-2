import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UD2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	UD2.4 Realiza una clase UD2_4 que guarde en un fichero con nombre pares.txt los números
	pares que hay entre 0 y 500, un número en cada línea del fichero. Seguidamente lee el fichero y
	muéstralo por la consola. Incluye también tratamiento de excepciones.
	*/
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("src\\Ficheros\\Pares.txt"));
			String cadena;
			for(int i = 0;i <=500;i++) {
				if(i%2==0) {
					cadena = Integer.toString(i);
					bw.write(cadena);
					bw.newLine();
				}
			}
			
			bw.close();
		} catch (IOException o){
			o.printStackTrace();
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("src\\Ficheros\\Pares.txt"));
			String linea;
			while ( (linea = br.readLine())!=null) {
				System.out.println(linea);
			}
			br.close();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}