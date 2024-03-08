package javaAvanzado;

import java.util.ArrayList;
import java.util.List;

public class Funcionalidades {

	public static void main(String[] args) {
		// Lambda Expressions
		List<String> cities = new ArrayList<>();
		cities.add("New York");
		cities.add("La Paz");
		cities.add("Bogota");
		cities.add("Buenos Aires");
		cities.add("Lima");
		cities.add("Caracas");
		cities.add("Rio de Janeiro");
		
		//cities.stream().forEach(city -> System.out.println(city));
		
		//Referencia a un método
		//cities.stream().forEach(Funcionalidades::printCity);
		
		//Parallel
		//cities.stream().parallel().forEach(System.out.println(city));
		
		//Patron de diseño Pipeline:
		//Consiste en concatenar métodos
		cities.stream().filter(city -> city.startsWith("B"));
		
		

	}
	public static void printCity(String city) {
		System.out.println(city);
	}
}
