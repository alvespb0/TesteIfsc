/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv4;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Atv4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numMotoristas, valorMultas[], acumulador = 0;
        int numCart[], numMultas[], M = 0;

        System.out.println("Quantos motoristas foram multados? ");
        numMotoristas = leia.nextInt();
        numCart = new int[numMotoristas];
        numMultas = new int[numMotoristas];
        valorMultas = new int[numMotoristas];
        for (int i = 0; i < numMotoristas; i++) {
            System.out.println("digite a carteira de motorista do " + (i + 1) + " motorista");
            numCart[i] = leia.nextInt();
            System.out.println("quantas multas esse motorista tem? ");
            numMultas[i] = leia.nextInt();
            if (numMultas[i] > M) {
                M = numCart[i];
            }
            for (int indice = 0; indice < numMultas[i]; indice++) {

                System.out.println("digite o valor da multa");
                valorMultas[i] = leia.nextInt();
                valorMultas[i] += valorMultas[i];
            }
        }
        for (int i = 0; i < numMotoristas; i++) {
            System.out.println("o valor a ser pago pelo motorista que tem a carteira '" + numCart[i] + "' é: " + valorMultas[i]); //nao consegui fazer direito essa parte
            acumulador += valorMultas[i];
        }
        System.out.println("A carteira com o maior numero de multas é: " + M);
        System.out.println("o valor total arrecadado pelo detran: " + acumulador);
        for (int i = 0; i < numMotoristas; i++) {
            if (numCart[i] < 0 || numCart[i] > 3235) {
                System.out.println("Carteira de motorista invalida recomece o processo!");
            }
        }
    }
}
