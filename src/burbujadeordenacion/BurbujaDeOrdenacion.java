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
       
    public void metodoBurbuja (int [] numeros){
        for (int j=1; j < numeros.length; j++){
           for (int i=1; i < numeros.length - j; i++){
               if (numeros[i] < numeros[i+1]){
                   i++;
               }else{
                   numeros[i] = numeros[i+1];
                   numeros[i+1] = numeros[i];
               }
           } 
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] listaNumeros = {11,17,21,55};
    }
    
}
