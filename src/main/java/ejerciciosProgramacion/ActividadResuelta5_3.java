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
public class ActividadResuelta5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cuántos números quieres ingresar?");
        int num = sc.nextInt();
        
        int [] arreglo1 = new int[num];
        
        for(int i = 0; i < num; i++) {
            System.out.println("Ingresa un número:");
            arreglo1[i] = sc.nextInt();
        }
        
        for(int i = arreglo1.length - 1; i >= 0; i--) {
            System.out.print(arreglo1[i] + " ");
        }
        
        /*for(int i = 0; i < arreglo1.length; i++) {
            System.out.print(arreglo1[i]);
        }*/
    }
}
