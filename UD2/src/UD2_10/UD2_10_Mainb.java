package UD2_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class UD2_10_Mainb {

	public static void main(String[] args) {
		XStream xstream = new XStream(new DomDriver("UTF-8"));		
		xstream.alias("Peliculas", List.class);
		xstream.alias("Pelicula", Pelicula.class);
		
		List<Pelicula> listaConsola;
		try {
			listaConsola = (ArrayList)xstream.fromXML(new FileInputStream("src\\Ficheros\\Peliculas.txt"));
		System.out.println("Número de peliculas: " + listaConsola.size());
		
		for(Pelicula p: listaConsola) {
			System.out.println(p);
		}
		System.out.println("Fin del fichero.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
