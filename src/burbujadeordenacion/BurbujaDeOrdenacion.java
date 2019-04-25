/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbujadeordenacion;

/**
 *
 * @author Fernando de Castro 
 */



public class BurbujaDeOrdenacion {
    
    
       
    public int[] metodoBurbuja (int [] numeros){
        
        int [] listaBurbuja = {numeros[0], numeros[1]};
        int aux = 0;
        for (int j=0; j < numeros.length; j++){
           for (int i=0; i < numeros.length - 1; i++){
               if (numeros[i] > numeros[i+1]){
                   aux = numeros[i+1];
                   numeros[i+1] = numeros[i];
                   numeros[i] = aux;
                   
               }
           } 
        }
        return numeros;
    }
    
    public int[] metodoInserccion (int [] numeros){
        int z = 0;
        int aux = 0;
        for (int j=0; j < numeros.length; j++){
           for (int i=1; i < numeros.length -1; i++){
               if (numeros[i] < numeros[0]){
                   numeros[0] = aux;
                    numeros[0] = numeros[i];
               }else{
                   while (numeros[i] <  numeros.length && numeros[i] > numeros[z]){
                      
                       z++;
                       
                   }
                   aux = numeros[z];
                   numeros [z]= numeros[i+1];
                   
                   
               }
           }
    
    }
        return numeros;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = {22,17,21,55,13,24};
        BurbujaDeOrdenacion ejercicio = new BurbujaDeOrdenacion();
        
        ejercicio.metodoBurbuja(numeros);
        for (int i=0; i < numeros.length ; i++){
            System.out.println(" " + numeros[i]);
        }
        
        ejercicio.metodoInserccion(numeros);
        for (int i=0; i < numeros.length ; i++){
            System.out.println("   " + numeros[i]);
        }
    }
    
}
