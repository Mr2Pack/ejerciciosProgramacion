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
public class Actividad4Ficha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] arreglo = new int[20];
        int sumaPositivos = 0, sumaNegativos = 0;
        
        for(int i = 0; i < 20; i++) {
            System.out.println("Ingresa un número:");
            arreglo[i] = sc.nextInt();
        }
        for(int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] > 0) {
                sumaPositivos += arreglo[i];
            } else if(arreglo[i] < 0) {
                sumaNegativos += arreglo[i];
            } else {
                System.out.println();
            }
        }
        System.out.println("Suma de positivos:" + " " + sumaPositivos);
        System.out.println("Suma de negativos:" + " " + sumaNegativos);
    }
}
