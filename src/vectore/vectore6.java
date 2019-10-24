package vectore;

import java.util.Scanner;

public class vectore6 {

	public static void mostrar (String[][] mnombre,int fila, int columna ){
        for (int i = 0; i<fila; i++){
            for (int j=0;j<columna;j++){
                
                System.out.println(mnombre[i][j]);
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
        String [][]mnombre= new String[fila][columna];
        
        
        for (int i = 0; i<fila; i++){
            for (int j=0;j<columna;j++){
                leer = new Scanner(System.in);
                System.out.println("introduce un nombre y edad");
                mnombre[i][j]=leer.nextLine();
        }
            
        }
        
        
 
        mostrar(mnombre,fila,columna);
        
        
    }
    } 
