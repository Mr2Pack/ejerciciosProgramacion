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
public class ActividadAplicacion4_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa un número:");
        int num = sc.nextInt();
        System.out.println("Ingresa otro número:");
        int num2 = sc.nextInt();
        System.out.println("Ingresa el operador:");
        char operador = sc.next().charAt(0);
        
        calculadora(num, num2, operador);
    }
    static void calculadora(int num, int num2, char operador) {
        int operacion;
        switch(operador) {
            case '+' -> {
                operacion = num+num2;
                System.out.println("Suma:" + " " + operacion);
            }
            case '-' -> {
                if(num > num2) {
                    operacion = num-num2;
                    System.out.println("Resta:" + " " + operacion);
                } else {
                    operacion = num2-num;
                    System.out.println("Resta:" + " " + operacion);
                }
            }
            case '/' -> {
                if(num > num2) {
                    operacion = num/num2;
                    System.out.println("División:" + " " + operacion);
                } else {
                    operacion = num2/num;
                    System.out.println("División:" + " " + operacion);
                }
            }
            case '*' -> {
                operacion = num*num2;
                System.out.println("Multiplicación:" + " " + operacion);
            }
            case '%' -> {
                if(num > num2) {
                    operacion = num%num2;
                    System.out.println("Módulo: " + " " + operacion);
                } else {
                    operacion = num2%num;
                    System.out.println("Módulo: " + " " + operacion);
                }
            }
            default -> {
                System.out.println("Hubo algún error desconocido.");
            }
        }
    }
}
