package vectore;

import java.util.Scanner;

public class vectore4 extends vectore1 {

	public static void mostrar( String vnombre[],int vnumero[],int tama�o) {
		for (int i =0; i<tama�o;i++) {
			System.out.println(vnombre[i]);
			System.out.println(vnumero[i]);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer;
		leer = new Scanner(System.in);
		int tama�o = 0;
		System.out.println("introduce un tama�o");
		tama�o = leer.nextInt();
		String vnombre[] = new String [tama�o];
		int vnumero[] = new int [tama�o];
		
		for (int i=0;i<tama�o;i++) {
			leer = new Scanner(System.in);
			System.out.println("introduce un nombre");
			vnombre[i]=leer.nextLine();
			
		}
		for (int i=0;i<tama�o;i++) {
			System.out.println("introduce una edad");
			vnumero[i]=leer.nextInt();
		}
		
		mostrar(vnombre,vnumero,tama�o);
		
		
	}

}
