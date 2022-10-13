

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Objetos.MiObjectOutputStream;
import Objetos.Profesor;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Escriba la cantidad de profesores: ");
		List<Profesor> lista = new ArrayList<Profesor>();
		String num_profes = s.next();

		// Comprobamos si ha puesto una cantidad correcta.
		while (!num_profes.matches("[0-9]+")) {
			System.out.println("Introduce una cantidad de profesores válida: ");
			num_profes = s.next();
		}

		for (int i = 0; i < Integer.valueOf(num_profes); i++) {
			System.out.print("\nIntroduce el nombre del profesor: ");
			String nombre = s.next();

			// Comprobamos si es una cadena.
			while (!nombre.matches("[a-zA-Z]+")) {
				System.out.println("Introduce un nombre válido: ");
				nombre = s.next();
			}
			System.out.print("Introduce la antigüedad de " + nombre + ": ");
			String antiguedad = s.next();

			// Comprobamos si ha puesto una antigüedad correcta.
			while (!antiguedad.matches("[0-9]{1,2}")) {
				System.out.println("Introduce una antigüedad válida: ");
				antiguedad = s.next();
			}
			lista.add(new Profesor(nombre, Integer.parseInt(antiguedad)));
		}
		
		File f = new File("src\\Ficheros\\Profesores.dat_obj.dat");
		
		if(!f.exists()) { //Si no existe
			try {
				f.createNewFile();
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
				for(Profesor p: lista) {
					oos.writeObject(p);
				}
				oos.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else { //Si existe
			try {
				MiObjectOutputStream mios = new MiObjectOutputStream(new FileOutputStream(f,true));
				for(Profesor p: lista) {
					mios.writeObject(p);
				}
				mios.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
			while(true) {
				System.out.println(ois.readObject());
			}
			
		} catch (IOException e) {
        } catch (ClassNotFoundException e) {
        }
		
		

	}

}
