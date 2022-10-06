package UD2_11;

import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class UD2_11_MainLeerFichero_v2 {

	public static void main(String[] args) {
		try {
			String sFichero = new String(Files.readAllBytes(Paths.get("src\\Ficheros\\JSONPeliculas.json")));
			JsonArray gsonArr = JsonParser.parseString(sFichero).getAsJsonArray();
			for (JsonElement obj : gsonArr) {
				JsonObject gsonObj = obj.getAsJsonObject();
				System.out.println(gsonObj.get("id").getAsInt() + " - " +
						gsonObj.get("titulo").getAsString() + " - " +
						gsonObj.get("anyo").getAsInt() + " - " +
						gsonObj.get("descripcion").getAsString()
						);
			}
			System.out.println();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
