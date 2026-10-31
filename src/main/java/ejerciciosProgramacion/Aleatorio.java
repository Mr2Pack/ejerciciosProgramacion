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
public class Aleatorio {
    public static void main(String[] args) {
        int [] numeros = arreglo();
        System.out.println(Arrays.toString(numeros));

    }
    static int [] arreglo() {
        int [] arreglo = new int[10];
        for(int i = 0; i < arreglo.length; i++) {
            int numAleatorio = (int) (Math.random() * 100) + 1;
            arreglo[i] = numAleatorio;
        }
        
        return arreglo;
    }
}