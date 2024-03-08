package javaAvanzado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

public class Scrapper {

	public static void main(String[] args) throws IOException {
		//Scrapper
		
		String link = "https://www.bbc.com/";
		URL url = new URL(link);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		String enconding = conn.getContentEncoding();
		InputStream input = conn.getInputStream();
		String result = new BufferedReader(new InputStreamReader(input)).lines().collect(Collectors.joining());
		
		System.out.println(result);
		
		//Synchronized
		//Si agregamos synchronized a un método, esto bloquea el método hasta que se termine de ejecutar.
		//Asi cuanto termine el proceso que se esta ejecutando continuará con el siguiente.
		//Ejemplo: 
		//private synchronized static String getWebContent(String link) {}

	}

}
