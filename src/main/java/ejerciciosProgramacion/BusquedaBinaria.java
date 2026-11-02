/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosProgramacion;

/**
 *
 * @author s23oa
 */
import java.util.*;
public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el mínimo:");
        int min = sc.nextInt();
        System.out.println("Ingresa el máximo:");
        int max = sc.nextInt();
        
        int [] t = new int[max + 1];
        
        rellenarArray(t,min, max);
        rellenarArray(t, min, max);

        int resultadoPromedio = promedio(t);
        System.out.println("Promedio: " + resultadoPromedio);

        int posicion = busquedaBinaria(t, 3);
        System.out.println("Posición de la clave: " + posicion);
        
    }
    static void rellenarArray(int t[], int min, int max) {
        for(int i = min; i <= max; i++) {
            t[i] = i;
        }
    }
    static int promedio(int [] t) {
        int suma_arrays = 0;
        
        for(int numero : t) {
            suma_arrays += numero;
        }
        
        return (int) suma_arrays/t.length;
    }
    static int busquedaBinaria(int[] t, int clave) {
        return Arrays.binarySearch(t, clave);
    }
}
