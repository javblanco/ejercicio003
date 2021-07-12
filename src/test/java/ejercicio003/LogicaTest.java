package ejercicio003;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LogicaTest {
	
	//Creación de un objeto grupo ( que almacena una lista de nombres)
	Grupo grupo = new Grupo();

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void getNombreRandomTest() {
		
		// Solicitar un nombre aleatorio.
		String randomName = grupo.getNombreRandom();

		// Debería ser un log no sysout
		System.out.println("El nombre random devuelto es : " + randomName);
		assertNotEquals(null, randomName);

	}
	
	@Test
	void getDosNombresRandomTest() {
		
		//Solicitar dos nombres aleatorios
		List<String> dosRandom = new ArrayList<>();
		
		dosRandom = grupo.getDosNombresRandom();
		
		// Debería ser un log no sysout
		System.out.println("El nombre random devuelto es : " + dosRandom);
		assertNotEquals(null, dosRandom.get(0));
		assertNotEquals(null, dosRandom.get(1));
		assertNotEquals(dosRandom.get(0), dosRandom.get(1));

	}

}
