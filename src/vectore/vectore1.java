package vectore;

import java.util.Scanner;

public class vectore1 {

	public static double imrpimirmedia(double vnumero[]) {
	double suma = 0;
	double media = 0;
		for (int i =0; i<vnumero.length;i++) {
			suma= suma+vnumero[i];
			
	}
			media=suma/vnumero.length;
		return media;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer;
		leer = new Scanner(System.in);
		
		double vnumero[] = new double [10];
		for (int i = 0; i < vnumero.length; i++) {
			System.out.println("introduce un numero");
			vnumero[i]=leer.nextInt();
	}
		System.out.println(imrpimirmedia(vnumero));
		
		
	}

}
