package com.programaciongratis.implementaciones;

import com.programaciongratis.interfaces.MiInterfaz;

/**Esta clase implementa la interfaz MiInterfaz
 * y implementa los metodos sumar y restar.
 * 
 * @author lnoria
 *
 */
public class MiInterfazImpl implements MiInterfaz {

	@Override
	public int sumar(int argumento1, int argumento2) {
		return argumento1 + argumento2;
	}

	@Override
	public int restar(int argumento1, int argumento2) {
		return argumento1 - argumento2;
	}

}
