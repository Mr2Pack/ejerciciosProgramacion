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

public class ActividadResuelta5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] apuesta = new int[6];

        System.out.println("Ingresa 6 números:");
        for (int i = 0; i < apuesta.length; i++) {
            apuesta[i] = sc.nextInt();
        }

        int aciertos = primitiva(apuesta);
        System.out.println("Aciertos: " + aciertos);

    }

    static int primitiva(int[] apuesta) {
        int aciertos = 0;
        int[] combinacionGanadora = new int[6];

        for (int i = 0; i < combinacionGanadora.length; i++) {
            combinacionGanadora[i] = (int) (Math.random() * 100 + 1);

            if (apuesta[i] == combinacionGanadora[i]) {
                aciertos++;
            }
        }

        return aciertos;
    }
}
