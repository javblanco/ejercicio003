package ejercicio003;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

	// Declaración del atributo lista que almacenará los nombres
	List<String> listaNombres = new ArrayList<>();

	// Metodo encargado de cargar la lista con los nombres
	public Grupo() {

		this.listaNombres.add("Unai");
		this.listaNombres.add("Cesar");
		this.listaNombres.add("Eric");
		this.listaNombres.add("Aymeric");
		this.listaNombres.add("Jordi");
		this.listaNombres.add("Sergio");
		this.listaNombres.add("Pedri");
		this.listaNombres.add("Koke");
		this.listaNombres.add("Pablo");
		this.listaNombres.add("Dani");
		this.listaNombres.add("Alvaro");

	}

	// Método que devuelve un random
	public String getNombreRandom() {

		int valorEntero = (int) Math.floor(Math.random() * ((this.listaNombres.size() - 1) - 0 + 1) + 0);

		return this.listaNombres.get(valorEntero);

	}

	// generar metodo que devuelva dos nombres y que no sea el repetido, sean los
	// dos diferentes.
	public List<String> getDosNombresRandom() {
		
		List<String> dosRandom = new ArrayList<>();
		boolean flag = false;

		// Carga el 1º random
		dosRandom.add(getNombreRandom());
		
		//Solicita Segundo random
		while ( flag == false) {
			
			String segundoNombre = getNombreRandom();
			
			if (! dosRandom.get(0).equals(segundoNombre)) {
				
				dosRandom.add(segundoNombre);
				flag= true;
				
			}
		}
		
		return dosRandom;
	}
}