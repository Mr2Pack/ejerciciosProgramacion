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
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa un número:");
        int numSolicitado = sc.nextInt();
        
        fibo(numSolicitado);
    }
    static int fibo(int numSolicitado) {
        int resto;
        
        if(numSolicitado == 0 || numSolicitado == 1) {
            resto = 1;
        } else {
            resto = fibo(numSolicitado - 1) + fibo(numSolicitado - 2);
        }
        
        return resto;
    }
}
