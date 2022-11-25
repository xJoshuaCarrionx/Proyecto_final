package Ferreteria;

public class Metodo {
	public static int generanNumerosAleatorios(int minimo, int maximo) {
		return 	(int)(Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1)));
	}
	public static int amp(int r, int v) {
		return (v/r);
	}

	
}
