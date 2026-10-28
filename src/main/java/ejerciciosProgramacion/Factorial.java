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
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int factorial = 1;
        
        System.out.println("Introduce un número:");
        int num = sc.nextInt();
        
        for(int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
            
}
