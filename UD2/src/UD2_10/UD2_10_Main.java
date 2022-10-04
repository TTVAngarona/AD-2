package UD2_10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class UD2_10_Main {

	public static void main(String[] args) {
		List<Pelicula> lista = new ArrayList<Pelicula>();
		
		lista.add(new Pelicula(1,"El señor de los Anillos: la Comunidad del Anillo", 2001, "Ambientada en la Tierra Media, cuenta la historia del Señor Oscuro Sauron, que está buscando el Anillo Único, el cual ha acabado en poder del hobbit Frodo Bolsón (Elijah Wood). El destino de la Tierra Media está en juego mientras Frodo y ocho compañeros que forman la Compañía del Anillo comienzan un largo y peligroso viaje hacia el Monte del Destino en la tierra de Mordor, que es el único lugar en el que el anillo puede ser destruido."));
		lista.add(new Pelicula(2,"El señor de los Anillos: las dos torres", 2002, "La trama de la película comienza tras la disolución de la Compañía del Anillo. Boromir ha muerto a manos del jefe de los uruk-hai, Lurtz, en un intento de salvar a los hobbits Meriadoc Brandigamo y Peregrin Tuk, que acaban siendo capturados. Frodo Bolsón y Sam Gamyi parten solos hacia Mordor para destruir el Anillo Único en el Monte del Destino, mientras que Aragorn, Gimli y Legolas persiguen a los uruks con el fin de liberar a sus amigos capturados."));
		lista.add(new Pelicula(3,"El señor de los Anillos: el retorno del rey", 2003, "Trata sobre la última parte del viaje que emprendieron los nueve compañeros (de los cuales quedan solamente ocho) para salvar a la Tierra Media de la oscuridad impuesta por Sauron. En esta parte se decide el destino de todos los habitantes de estas tierras."));
		
		try {
			XStream xstream = new XStream(new DomDriver("UTF-8"));
			
			xstream.alias("Peliculas", List.class);
			xstream.alias("Pelicula", Pelicula.class);
			xstream.toXML(lista, new FileOutputStream("src\\Ficheros\\Peliculas.txt"));
			System.out.println("Fichero creado en XML...");
			
			
		} catch (Exception e){
			e.printStackTrace();
		}

	}

}
