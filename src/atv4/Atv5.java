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
public class Atv5 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double altura1 = 150;
        double altura2 = 110;
        double ano = 0;
        while (altura1 > altura2) {
            altura1 = altura1 + 2;
            altura2 = altura2 + 3;
            ano += 1;
        }
        System.out.println("vai demorar "+ano+" anos para o irmaozinho mais novo passar o pedrinho ");
    }
}
