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
public class atv2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double kwh,total,salario = 1045,desconto;
        System.out.println("digite quantos kwh sua residencia gastou no mes");
        kwh = leia.nextDouble();
        total = kwh * (salario/5);
        desconto = total - ((total/100) * 17);
        System.out.println("o total deu: "+total);
        System.out.println("o total com 17% de desconto deu: "+desconto);
        System.out.println("e o valor de cada quilowatt é: "+(salario/5));
        
    }
}
