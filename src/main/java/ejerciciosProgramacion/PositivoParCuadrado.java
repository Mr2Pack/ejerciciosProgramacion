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
public class PositivoParCuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa un número:");
        int num = sc.nextInt();
        
        while(num != 0) {
            if(num % 2 == 0) {
                System.out.println("El número ingresado es par.");
            } else {
                System.out.println("El número ingresado es impar.");
            }
            
            if(num > 0) {
                System.out.println("El número es positivo.");
            } else {
                System.out.println("El número es negativo.");
            }
            
            int operacionCuadrado = (int)(Math.pow(num, 2));
            System.out.println("El cuadrado del número ingresado es: " + operacionCuadrado);
            
            System.out.println("Ingresa un número:");
            num = sc.nextInt();
        }
    }
}
