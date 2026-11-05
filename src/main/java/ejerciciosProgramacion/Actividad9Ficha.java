/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosProgramacion;

/**
 *
 * @author s23oa
 */
import java.util.Scanner;
public class Actividad9Ficha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el número del que deseas saber su posición:");
        int numSolicitado = sc.nextInt();
        
        boolean encontrado = false;
        
        int [] arreglo = new int[10];

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numSolicitado) {
                System.out.println("El número está en la posición " + i);
                encontrado = true;
            }   
        }

        if (!encontrado) {
            System.out.println("El número no está en el arreglo.");
        }
        
        
        posicionArray(arreglo);
        
    }
    static int [] posicionArray (int [] arreglo) {
        arreglo = new int[10];
                
        for(int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random()*100+1);
        }
        
        
        return arreglo;
    }
}
