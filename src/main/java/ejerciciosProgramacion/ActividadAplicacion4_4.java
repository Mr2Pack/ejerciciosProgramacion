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
public class ActividadAplicacion4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa un número:");
        int num = sc.nextInt();
        System.out.println("Ingresa otro número:");
        int num2 = sc.nextInt();
        
        System.out.println("El número máximo es: " + sacarMax(num, num2));
    }
    static int sacarMax(int num, int num2) {
        int numMaximo = 0;
        if(num > num2) {
            numMaximo = num;
        } else if (num2 > num) {
            numMaximo = num2;
        } else {
            System.out.println();
        }
        return numMaximo;
    }
}
