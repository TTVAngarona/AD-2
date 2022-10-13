import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class UD2_9 {

	public static void main(String[] args) throws IOException {
		/*
		UD2.9 Adaptación de los ejemplos vistos en los materiales con la clase RandomAccessFile.
		Realiza una clase UD2_9 que pida al usuario el identificador del profesor y lo borre del fichero
		ProfesFPSierraGuara.dat. Borrar un dato simplemente consiste en poner su campo id dentro del
		fichero a 0 para indicar que ese registro no existe y su posición está libre. Se deberá controlar
		que:
			- El identificador del profesor esté dentro de los límites del fichero.
			- El identificador del profesor debe existir. Si ha sido borrado previamente se advertirá de
			la situación.
			- Antes de finalizar el código visualizar de manera secuencial todos los registros del
			fichero para comprobar la operación.
		 */
		Scanner s = new Scanner(System.in);
		File fichero = new File("src\\Ficheros\\ProfesFPSierraGuara.dat");
		try {
			RandomAccessFile file = new RandomAccessFile(fichero,"rw");
			System.out.println("Escriba el ID del profesor que quiera borrar: ");
			int id = s.nextInt();
			int posicion = (id-1)*56;
			if(posicion > file.length()-56) {
				System.out.println("No existe un profesor con ese identificador");
				System.exit(-1);
			}
			int departamentos;
			double antiguedad;
			char profesores[] = new char[20];
			
			file.seek(posicion);
			id = file.readInt();
			id = 0;
			file.seek(file.getFilePointer()-4);
			file.writeInt(id);
			file.seek(0);
			while(file.getFilePointer() != file.length()) {
				file.seek(posicion);
				id = file.readInt();
				for (int i = 0; i < profesores.length; i++) {
					profesores[i] = file.readChar();
				}
				String profesor = new String(profesores);
				departamentos = file.readInt();
				antiguedad = file.readDouble();
				System.out.println(id + " " + profesor);
			}
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
