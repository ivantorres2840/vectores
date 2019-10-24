package vectore;

import java.util.Random;
import java.util.Scanner;

public class vectore5 {

		public static void azar (int[][] mnumero,int fila, int columna ){
		       Random rnd=new Random();
		        for (int i = 0; i<fila; i++){
		            for (int j=0;j<columna;j++){
		                mnumero[i][j]=rnd.nextInt(100);
		                System.out.println(mnumero[i][j]);
		        }
		            
		        }
		        
		    }
		    
		    
		    
		    public static void main(String[] args) {
		        // TODO code application logic here
		        
		        Scanner leer;
		        leer = new Scanner(System.in);
		        int fila = 0 ;
		        int columna = 0;
		        fila  = leer.nextInt();
		        columna = leer.nextInt();
		        int [][]mnumero= new int[fila][columna];
		        
		        
		        azar(mnumero,fila,columna);
		        
		        
		    }
	


