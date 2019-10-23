package vectore;

import java.util.Scanner;

public class vectore3 extends vectore1 {

	public static void multiplos(int tamaño,int vnumero[],int numero) {
		int multiplos = 0;
		for (int i =0; i<tamaño; i++){
			multiplos=numero*i;
			multiplos=vnumero[i];
			}
		}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer;
		leer = new Scanner(System.in);
		
		int tamaño = 0;
		System.out.println("introduce un tamaño");
		tamaño = leer.nextInt();
		System.out.println("introduce un numero");
		int numero = 0;
		numero = leer.nextInt();
		int vnumero[]= new int[tamaño];
		multiplos(tamaño,vnumero,numero);
	}

}
