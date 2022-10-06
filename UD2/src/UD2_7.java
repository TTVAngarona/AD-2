
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class UD2_7 {

	public static void main(String[] args) {
		/*
		UD2.7 Realiza una clase UD2_7 que guarde 20 números enteros aleatorios comprendidos entre
		1 y 5 en el fichero puntuación.dat. Completa el código abriendo el fichero para visualizarlos
		todos por la consola indicando al final cuántas veces se repiten cada uno de ellos. Incluye
		también tratamiento de excepciones.
		*/
		ArrayList <Integer> lista = new ArrayList<Integer>(); 
		int contadorUnos = 0;
		int contadorDos = 0;
		int contadorTres = 0;
		int contadorCuatros = 0;
		int contadorCincos = 0;
		
		try {
			DataOutputStream dos = new DataOutputStream (new FileOutputStream ("src\\Ficheros\\puntuacion.dat"));
			String numeros = "";
			int i = 1;
			
			do {
				int random = (int)(Math.random()*5)+1;
				numeros = numeros + random + " ";
				lista.add(random);
				i++;
			} while(i != 21);
			dos.writeUTF(numeros);
			dos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i<= lista.size()-1;i++) {
			if(lista.get(i) == 1) {
				contadorUnos++;
			}else if(lista.get(i) == 2) {
				contadorDos++;
			} else if(lista.get(i) == 3) {
				contadorTres++;
			} else if(lista.get(i) == 4) {
				contadorCuatros++;
			} else if(lista.get(i) == 5) {
				contadorCincos++;
			}
			
		}
		System.out.println(lista);
		System.out.println("Hay del numero 1: " + contadorUnos + 
				" Hay del numero 2: " + contadorDos + 
				" Hay del numero 3: " + contadorTres + 
				" Hay del numero 4: " + contadorCuatros + 
				" Hay del numero 5: " + contadorCincos );
	}

}
