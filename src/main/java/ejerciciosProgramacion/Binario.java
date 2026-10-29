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
public class Binario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resto;
        
        System.out.println("Ingresa un número para convertirlo en binario:");
        int numBinario = sc.nextInt();
        
        while(numBinario != 0) {
            resto = numBinario % 2;
            numBinario = numBinario / 2;
            System.out.println(resto);
        }
    }
}
