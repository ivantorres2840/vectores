package vectore;

import java.util.Scanner;

public class vectore3 extends vectore1 {

	public static void multiplos(int tama�o,int vnumero[],int numero) {
		int multiplos = 0;
		for (int i =0; i<tama�o; i++){
			multiplos=numero*i;
			multiplos=vnumero[i];
			}
		}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer;
		leer = new Scanner(System.in);
		
		int tama�o = 0;
		System.out.println("introduce un tama�o");
		tama�o = leer.nextInt();
		System.out.println("introduce un numero");
		int numero = 0;
		numero = leer.nextInt();
		int vnumero[]= new int[tama�o];
		multiplos(tama�o,vnumero,numero);
	}

}
