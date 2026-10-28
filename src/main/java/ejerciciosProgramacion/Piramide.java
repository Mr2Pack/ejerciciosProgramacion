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
public class Piramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa un número:");
        int num = sc.nextInt();
        
        for(int i = 1; i<= num; i++) {
            for(int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for(int c = 1; c <= i*2-1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
