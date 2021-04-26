package ar.com.educacionit.exceptions;

import ar.com.educacionit.exceptions.checked.DivisionPorCeroException;

public class DivisionMain {

	public static void main(String[] args) throws DivisionPorCeroException {


		int valor1 = 10;
		int valor2 = 0;
		
		int res;
		if(valor2 == 0) {
			throw new DivisionPorCeroException("No se puede dividir por 0", null);
		}
		
		res = valor1/valor2;
		System.out.println(res);
	}

}