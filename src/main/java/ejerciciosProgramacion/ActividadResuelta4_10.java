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
public class ActividadResuelta4_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa A:");
        double A = sc.nextDouble();
        System.out.println("Ingresa N:");
        int N = sc.nextInt();
        
        AelevadoN(A, N);
        
    }
    static double AelevadoN(double A, int N) {
        double resto;
        if(N == 0) {
            resto = 1;
        } else {
            resto = A *AelevadoN(A, N - 1);
        }
        
        return resto;
    }
}
