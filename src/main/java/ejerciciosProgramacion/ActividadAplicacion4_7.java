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

public class ActividadAplicacion4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número:");
        int num = sc.nextInt();

        numDivisioresPrimos(num);
    }

    static int numDivisioresPrimos(int num) {
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                boolean primo = true;
                for (int j = 2; j <= i / j; j++) {
                    if (i % j == 0) {
                        primo = false;
                        break;
                    }
                }
                if (primo) {
                    System.out.println("Divisor primo: " + i);
                }
            }
        }
        return num;
    }
}