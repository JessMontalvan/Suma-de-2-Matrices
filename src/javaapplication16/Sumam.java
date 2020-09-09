
package javaapplication16;

import java.util.Scanner;

public class Sumam {
        
    int [][]lista1;
    int [][]lista2;
    int [][]lista3;
       
    public Sumam (int i, int j){
        
        lista1= new int [i][j];
        lista2= new int[i][j];
        lista3= new int [i][j];
              
    }
    
    public void Matriz() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese Los Datos de la Matriz 1");
        for (int i = 0; i < lista1.length; i++) {
            for (int j = 0; j < lista1[i].length; j++) {
                lista1[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Ingrese Los Datos de la Matriz 2");
        for (int i = 0; i < lista2.length; i++) {
            for (int j = 0; j < lista2[i].length; j++) {
                lista2[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < lista3.length; i++) {
            for (int j = 0; j < lista3[i].length; j++) {
                lista3[i][j] = lista1[i][j] + lista2[i][j];
            }
        }

        System.out.println("Matriz 1");
        for (int i = 0; i < lista1.length; i++) {
            for (int j = 0; j < lista1[i].length; j++) {
                System.out.print(lista1[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Matriz 2");
        for (int i = 0; i < lista2.length; i++) {
            for (int j = 0; j < lista2[i].length; j++) {
                System.out.print(lista2[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Matriz Sumada");
        for (int i = 0; i < lista3.length; i++) {
            for (int j = 0; j < lista3[i].length; j++) {
                System.out.print(lista3[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}




