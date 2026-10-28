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
public class ActividadAplicacion4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa un número:");
        int num = sc.nextInt();
        System.out.println("Ingresa otro número:");
        int num2 = sc.nextInt();
        
        numeros_comprendidos(num, num2);
    }
    static void numeros_comprendidos(int num, int num2) {
        if(num > num2) {
            for(int i = num2; i <= num; i++) {
                System.out.println("Los números comprendidos son: " + i);
            }       
        } else {
            for(int i = num; i <= num2; i++) {
                System.out.println("Los números comprendidos son: " + i);
            }
        }
    }
}
