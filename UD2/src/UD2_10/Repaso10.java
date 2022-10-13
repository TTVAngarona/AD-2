package UD2_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Repaso10 {
	public static void main(String[] args) throws FileNotFoundException {
		List<Pelicula> lista = new ArrayList<>();
		XStream xs = new XStream(new DomDriver("UTF-8"));
		xs.alias("Peliculas", List.class);
		xs.alias("Pelicula", Pelicula.class);
		lista = (List) xs.fromXML(new FileInputStream("src\\Ficheros\\Peliculas.txt"));
		// lista.forEach(System.out::println);
		xs = new XStream(new DomDriver("UTF-8"));
		xs.alias("PELICULAS", List.class);
		xs.alias("PELI", Pelicula.class);
		xs.aliasField("ID", Pelicula.class, "id");
		xs.aliasField("TITULO", Pelicula.class, "titulo");
		xs.aliasField("AÑO", Pelicula.class, "anyo");
		xs.aliasField("DESCRIPCIÓN", Pelicula.class, "descripcion");
		xs.toXML(lista, new FileOutputStream("src\\Ficheros\\Peliculas.xml"));

		FileWriter fichero;
		try {
			fichero = new FileWriter("src\\Ficheros\\JSONPeliculas.json");
			new Gson().toJson(lista, fichero);
			fichero.close();

			Gson gson = new Gson();
			String fichero1 = new String(Files.readAllBytes(Paths.get("src\\Ficheros\\JSONPeliculas.json")));
//	JsonArray ja= JsonParser.parseString(fichero1).getAsJsonArray();
//	ja.forEach(j->{JsonObject jo= j.getAsJsonObject();
//	
//		Pelicula p=new Pelicula();			
//		p.setTitulo(jo.get("titulo").getAsString());
//		p.setId(jo.get("id").getAsInt());
//		p.setAnyo(jo.get("anyo").getAsInt());
//		p.setDescripcion(jo.get("descripcion").getAsString());
//		lista1.add(p);
//		
//	});lista1.forEach(System.out::println);

			Pelicula[] lista2 = gson.fromJson(fichero1, Pelicula[].class);
			for (Pelicula p : lista2) {
				System.out.println(p);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
