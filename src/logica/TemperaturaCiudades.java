
package logica;

import java.util.Scanner;


public class TemperaturaCiudades {

    public static void main(String[] args) {
        
        String ciudades[] = new String[5];
        Double minimas[]= new Double[5];
        Double maximas[]= new Double[5];
        
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        
        
      //cargar los vectores
        for (int i = 0; i<ciudades.length; i++) {
            System.out.println("Ingrese el nombre de la ciudad "+ i);
            ciudades[i] =teclado.next();
            
            System.out.println("Ingrese la minima de la ciudad " + i);
            minimas[i]= teclado2.nextDouble();
            
            System.out.println("Ingrese la máxima de la ciudad " + i);
            maximas[i]= teclado2.nextDouble();
            }
        //determinar la minima
        double minima = 99999.00;
        int posMin = -1;
        
        for (int i = 0; i<ciudades.length; i++){
            if (minimas[i]<minima) {
                minima = minimas[i];
                posMin = i;   
            }
        }
        double maxima = -99999.00;
        int posMax = -1;
        //determinar la máxima
         for (int i = 0; i<ciudades.length; i++){
            if (maximas[i]>maxima) {
                maxima = maximas[i];
                posMax = i;   
            }
        }
        System.out.println("La temperatura mínima es: "+ minima);
        System.out.println("Se registro en la ciudad de: "+ ciudades[posMin]);
        System.out.println("************************************");
        
        System.out.println("La temperatura máxima es: "+ maxima);
        System.out.println("Se registro en la ciudad de: "+ ciudades[posMax]);
        System.out.println("*************************************");

    }  
    
}
