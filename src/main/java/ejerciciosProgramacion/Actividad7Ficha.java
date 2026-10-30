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
public class Actividad7Ficha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa un número:");
        int p = sc.nextInt();
        
        System.out.println("Ingresa otro número:");
        int q = sc.nextInt();
        
        int[] arreglo = new int[q - p + 1];
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i] = p + i);
        }
    }
}
