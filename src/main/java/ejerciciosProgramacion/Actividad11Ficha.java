/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosProgramacion;

/**
 *
 * @author s23oa
 */
public class Actividad11Ficha {
    public static void main(String[] args) {

    int [] arreglo1 = new int[100];
    int [] arreglo2 = new int[100];
    
    int[] invertido = arregloInverso(arreglo1, arreglo2);

    for (int i = 0; i < invertido.length; i++) {
        System.out.println(invertido[i]);
    }
    }
    static int [] arregloInverso(int [] arreglo1, int [] arreglo2) {
        arreglo1 = new int[100];
        
        for(int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = (int)(Math.random()*100+1);
        }
        
        for(int j = arreglo1.length; j > 0; j--) {
            arreglo2[j] = arreglo1[arreglo1.length - 1 - j];
        }
        
        System.out.println(arreglo2);
        return arreglo2;
    }
}
