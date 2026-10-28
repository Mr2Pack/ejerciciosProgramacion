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
public class ActividadAplicacion4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero:");
        int num = sc.nextInt();
        
        numPrimo(num);
    }
    static int numPrimo(int num) {
        boolean esPrimo;
        for(int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                esPrimo = false;
                System.out.println(esPrimo);
                break;
            } else {
                esPrimo = true;
                System.out.println(esPrimo);
                break;
            }
        }
        return num;
    }
}