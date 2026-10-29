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
public class Figura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa un número:");
        int numSolicitado = sc.nextInt();
        
        for(int i = 1; i <= numSolicitado; i++) {
            for(int j = i; j <= numSolicitado; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
