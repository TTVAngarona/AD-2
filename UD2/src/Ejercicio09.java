
import Objetos.Profesores;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio09 {

	public static void main(String[] args) {
		List<Profesores> lista = new ArrayList<>();
		lista.add(new Profesores("Antonio", 10, 37.5));
		lista.add(new Profesores("Pedro", 10, 37.5));
		lista.add(new Profesores("Juan", 10, 37.5));
		lista.add(new Profesores("Pepe", 10, 37.5));
		int i = 0;
		try {
			RandomAccessFile raf = new RandomAccessFile("src\\Ficheros\\Profesores.dat", "rw");

			for (Profesores p : lista) {
				try {
					i++;
					raf.writeInt(i);
					StringBuffer sb=new StringBuffer(p.getNombre());
					sb.setLength(20);
					String nombre=sb.toString();
					raf.writeChars(nombre);
//					char[] nombre = new char[20];
//					nombre = p.getNombre().toCharArray();
//					int x=nombre.length;
//					for (int j = 0; j < 20; j++) {
//						if(j<x)
//						raf.writeChar(nombre[j]);
//						else raf.writeChar(' ');
//						
//					}
					
					raf.writeInt(p.getDepartamento());
					raf.writeDouble(p.getAntiguedad());

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			raf.seek((20 - 1) * 56);
			raf.writeInt(20);
			StringBuffer sb=new StringBuffer("Luis");
			sb.setLength(20);
			String nombre2=sb.toString();
			raf.writeChars(nombre2);
			
//			char[] nombre2 = {'L','u','i','s',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
//			for (int j = 0; j < 20; j++) {
//				raf.writeChar(nombre2[j]);	
//			}
			
			raf.writeInt(20);
			raf.writeDouble(22.5);
			
		/*	raf.close();		Opcional
			raf = new RandomAccessFile("src\\\\Ficheros\\\\Profesores.dat", "r"); */ 
		
			raf.seek(0);
			while(raf.getFilePointer()!=raf.length()) {
//			for (int j = 0; j < raf.length() / 56; j++) {
				System.out.print(raf.readInt() + "\t");
				String name="";
				for (int k = 0; k < 20; k++) {
					name+=raf.readChar();
				}
				System.out.print(name+"\t");
				System.out.print(raf.readInt() + "\t");
				System.out.print(raf.readDouble() + "\n");

			}
	/*		raf.seek(172);
			String name="";
			for (int k = 0; k < 20; k++) {
				name+=raf.readChar();
			}
			System.out.print(name.trim());
			raf.seek(raf.getFilePointer()-96);		Para testear
			 name="";
			for (int k = 0; k < 20; k++) {
				name+=raf.readChar();
			}
			System.out.print(name.trim()); 
			raf.seek(19*56+4);
			 name="";
			for (int k = 0; k < 20; k++) {
				name+=raf.readChar();
			}
			System.out.print(name.trim()+raf.readInt()+raf.readDouble()); */
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}


