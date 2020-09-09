
package javaapplication16;

import java.util.Scanner;

public class JavaApplication16 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas que desee: ");  
        int f = entrada.nextInt();
        System.out.println("Ingrese el numero de columnas que desee: ");  
        int c = entrada.nextInt();
        
        Sumam te = new Sumam(f,c);
        te.Matriz();
        
       }
    
    
}
