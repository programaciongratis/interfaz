package com.programaciongratis.aplicaciones;

import com.programaciongratis.implementaciones.MiInterfazImpl;
import com.programaciongratis.interfaces.MiInterfaz;

public class InterfazMain {

	public static void main (String[] args) {
		
		// Aqui creamos una variable de tipo MiInterfaz.
		// Como ven, Interfaces son tipos definidos por el programador,
		// y tienen como metodos los metodos definidos en la interfaz.
		// Como interfaces solo son tipos, no podemos inicializar 
		// una interfaz de la siguiente manera:
		// MiInterfaz test = new MiInterfaz();
		// si hacemos eso tendriamos un error de compilacion.
		// Por eso solo inicializamos interfaces con clases
		// que implementan la interfaz.
		MiInterfaz interfaz = new MiInterfazImpl();
		
		// aqui asignamos el resultado del metodo sumar a la
		// variable resultadoDeSumar.
		int resultadoDeSumar = interfaz.sumar(2, 5);
		
		// aqui asignamos el resultado del metodo restar a
		// la variable resultadoDeRestar.
		int resultadoDeRestar = interfaz.restar(5, 2);
		
		// aqui solo mostramos los resultados.
		System.out.println("suma: " + resultadoDeSumar);
		System.out.println("resta: " + resultadoDeRestar);
		
		// aqui podemos ver como a pesar que nosotros no especificamos
		// la propiedad MAXIMO como statico, por defecto es estatico.
		// Como es estatico la podemos invocar a traves de la clase.
		System.out.println("Constante MAXIMO: " + MiInterfaz.MAXIMO);
		
		// Aqui tambien podemos ver que podemos invocar la otra constante
		// con el objeto interfaz.
		System.out.println("Constante MINIMO: " + interfaz.MINIMO);
		
		// NOTA: si tratas de cambiar el valor a las constantes vas
		// a ver un error de compilacion. no agas esto:
		// interfaz.MINIMO = 2;
		// vas a tener un error porque las constantes son
		// declaradas final. Final significa que no se pueden cambiar.
		
	}
}
