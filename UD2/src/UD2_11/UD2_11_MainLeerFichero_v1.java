package UD2_11;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class UD2_11_MainLeerFichero_v1 {

	public static void main(String[] args) {
		try {
			Gson gson= new Gson();
			String sFichero = new String(Files.readAllBytes(Paths.get("src\\Ficheros\\JSONPeliculas.json")));
			List<Pelicula> lista = Arrays.asList(gson.fromJson(sFichero, Pelicula[].class));
			for(Pelicula p : lista) {
				System.out.println(p);
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}

	}

}
