import java.util.Iterator;


//send help
//el iterador debe darte las diferentes combinaciones de los numeros en el array para posteriormente (creemos)
//comprobar si es combinacion cumple los requisitos que queremos, la primera que los cumple es la solucion
//lo primero es hacer el iterador y el metodo main, para ir probando se pueden introducir los datos directamente
//la parte de leeer de un fichero se puede hacer posterior o a la vez
public class practica2{

	public static void main(String[] args) {
		int[] arrayEjemplo = new int[3];
		for(int i =0;i<arrayEjemplo.length;i++){
			arrayEjemplo[i]=i;
		}
		Iterator<int[]> willy =IteradorCombn(arrayEjemplo);
	}


}
