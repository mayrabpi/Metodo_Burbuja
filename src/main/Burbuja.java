package main;

public class Burbuja {

	public static void main(String[] args) {
		// Metodo de ordenacion ( burbuja)
		
		int numeros [] = {2, 2, 5 ,3};
		int guardar=0;
		System.out.println("Este es mi array desordenado ");
		
		for (int i=0; i<numeros.length; i++) {
		
		    System.out.print( numeros [i]+ " "+ "\n");
	
		}
	        for (int i= 0; i< numeros.length; i++) {
			
			   for(int j= 0;j< numeros.length-i-1 ; j++) {
				
				if(numeros[j]> numeros[j+1]) {
					guardar= numeros[j+1];
					numeros[j+1]=numeros[j];
					numeros[j]= guardar;
				} 
			}
			
		}
		  System.out.println("Este es mi array ordenado ");
			
			for (int i=0; i<numeros.length; i++) {
			
			    System.out.print( numeros [i]+ " "+ "\n");
			    
			}

	}

}
