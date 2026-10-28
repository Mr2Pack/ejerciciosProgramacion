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
public class RepartirPizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa un número:");
        int num1 = sc.nextInt();
        System.out.println("Ingresa otro número:");
        int num2 = sc.nextInt();
        
        int mcd2 = mcd(num1, num2);
        int porciones = (num1/mcd2)*(num2/mcd2);
        
        System.out.println("Porciones de pizza: " + porciones);
        
        mcd(num1, num2);
    }
    static int mcd(int num1, int num2) {
        if(num2 == 0) {
            return num1;
        } else {
            return mcd(num2, num1%num2);
        }
        
    }
}
