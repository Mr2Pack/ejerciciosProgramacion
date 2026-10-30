/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosProgramacion;

/**
 *
 * @author s23oa
 */
public class Arreglos1 {
    public static void main(String[] args) {
                
        int [] arreglo1 = new int[3];
        arreglo1[0] = 12;
        arreglo1[1] = 22;
        arreglo1[2] = 32;
        
        int num = arreglo1[0];
        
        System.out.println(num);
        System.out.println(arreglo1[1]);
        System.out.println(arreglo1[2]);
        
        int [] arreglo2 = {1, 2, 3, 4, 5};
        
        for(int i = 0; i < arreglo2.length; i++) {
            System.out.println(arreglo2[i]);
        }
        
        
    }
}
