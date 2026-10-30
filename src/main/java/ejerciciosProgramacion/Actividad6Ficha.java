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
public class Actividad6Ficha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cuántos espacios quieres que tenga el arreglo?");
        int numSolicitado = sc.nextInt();
        
        int [] arreglo = new int [numSolicitado];
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresa un número:");
            int m = sc.nextInt();
            
            arreglo[i] = m;
            
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Contenido del arreglo:" + " "+ arreglo[i]);
        }
    }
}
