package com.programaciongratis.interfaces;

/**Esta interface solo define dos
 * propiedades y dos metodos.
 * 
 * @author lnoria
 *
 */
public interface MiInterfaz {
	// por defecto, estas variables ya son 
	// staticas y finales.
	int MINIMO = 1;
	int MAXIMO = 10;
	
	int sumar(int argumento1, int argumento2);
	
	int restar(int argumento1, int argumento2);

}
