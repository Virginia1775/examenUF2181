
package libs;

/**
 * 
 * @author Virginia Ortiz Rodriguez
 *
 */

public class Funciones {
	/**
	 * función que devuelve el nº de enmedio de tre números pasados por parámetros
	 * @param num1  int número dado por parámetro
	 * @param num2 int número dado por parámetro 
	 * @param num3 int número dado por parámetro
	 * @return int devuelve el número del centro de los tres dados
	 */
	
	public int devuelveCentral(int num1, int num2, int num3) {
		
		int enMedio;
		
		if ((num1>num2) && (num1<num3)) {
			enMedio=num1;
		}  else if  ((num2>num1) && (num2<num3)) {
			enMedio= num2;
		} else {
			enMedio = num3;
		}
		return enMedio;
	}
	/**
	 * función que nos indica si un año dado por parámetro es bisiesto o no
	 * @param año int año entroducido por parámetro
	 * @return int devuelve si el año bisiesto
	 */
	public boolean esBisiesto(int año) {
		boolean bisiesto = false;
		if (año %4 == 0 ) {
			if (año%100==0 && año%400!=0) {
				bisiesto=false;
			} else {
				bisiesto=true;
			}
		} else  {
			bisiesto=false;
		}
		return bisiesto;
	}
	/**
	 * función que comprueba si un número es capicúa, que desde uno central, los números 
	 * por delante y por detrás, sean iguales
	 * @param v int vector compuesto por nº dados por parámetro
	 * @return int devuelve el número si es realmente capicúa
	 */
	public  boolean esCapicua(int v[]) {
		boolean capicua = true;
		
		for (int i=0, j=v.length-1; i<v.length/2; i++,j--) {
			if (v[i]!=v[j]) {
				capicua=false;
			}
		}
		return capicua;
	}
/**
 * función que suma dos vectores dados por parámetros
 * @param v int vector de enteros dados por parámetro
 * @param v2 int segundo vector dado por parámetro
 * @return devuelve la suma de los dos vectores
 */
	public  int [] suma_vectores(int v[], int v2[]) {
		int vector_suma [] = new int[v.length];
		
		if (v.length!=v2.length) 
		   throw new ArithmeticException("Los vectores deben tener el mismo tamaño");
		
		for (int i = 0; i < vector_suma.length; i++) {
			vector_suma[i]=v[i]+v2[i];
		}
		return vector_suma;
	}
	
	
}
