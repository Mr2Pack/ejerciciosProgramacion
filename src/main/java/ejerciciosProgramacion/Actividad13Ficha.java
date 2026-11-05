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
public class Actividad13Ficha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿De cuánto quiere que sea el arreglo?");
        int numSolicitado = sc.nextInt();
        
        int [] arreglo = new int[numSolicitado];
        
        System.out.println("Ingresa el número:");
        int numSolicitado2 = sc.nextInt();
        System.out.println("Ingresa el número para incrementar:");
        int numIncrementar = sc.nextInt();
        
        for(int i = 0; i < arreglo.length; i++) {
            
            numSolicitado2 += numIncrementar;
            
            /* En cada posición del arreglo se debe de guardar cada número 
            sumado por su incremento */
            arreglo[i] = numSolicitado2;
            
            System.out.println(arreglo[i]);
        }
    }
}
