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
public class Actividad5Ficha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] arreglo = new int[20];
        
        int suma = 0;
        
        for(int i = 0; i < 20; i++) {
            System.out.println("Ingresa un número:");
            arreglo[i] = sc.nextInt();
        }
        for(int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        
        suma = suma/10;
        System.out.println("Promedio:" + " " + suma);
    }
}
