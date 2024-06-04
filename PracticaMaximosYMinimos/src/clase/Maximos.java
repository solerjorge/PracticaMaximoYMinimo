package clase;

public class Maximos {
	/**
	 * Esta función devuelve el máximo de dos números enteros positivos.
	 *
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El máximo entre a y b.
	 * @throws IllegalArgumentException Si uno de los valores es negativo lanza la excepción.
	 */
	public int MaximoDe2EnterosPositivos(int a, int b) {
		  if (a < 0 || b < 0) {
		    throw new IllegalArgumentException("Los valores deben ser mayores o iguales que cero");
		  }

		  if (a > b) {
		    return a;
		  } else {
		    return b;
		  }
		}
	
	/**
	 * Esta función devuelve el máximo de dos números enteros positivos.
	 *
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El mínimo entre a y b.
	 * @throws IllegalArgumentException Si uno de los valores es negativo lanza la excepción.*/
	public int MenorDe2EnterosPositivos(int a, int b) {
		  if (a < 0 || b < 0) {
		    throw new IllegalArgumentException("Los valores deben ser mayores o iguales que cero");
		  }

		  if (a < b) {
		    return a;
		  } else {
		    return b;
		  }
		}
	
}
