package loops;

import java.util.Scanner;

/*
 Calcular o Fatorial de um determinado número inteiro
 Ex.: 5! = 120 (5 x 4 x 3 x 2 x 1)
 */

public class Ex06_Fatorial {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long fatorial = 1;

        System.out.println("Digite o número para calcular o Fatorial: ");
        int numero = scan.nextInt();

        // int count = numero;
        // do {
        //     fatorial *= count;
        //     count--;  
        // } while (count > 0);

        for (int i = numero; i > 0; i--) {
            fatorial *= i;
        }

        System.out.println("Fatorial de \"" + numero + "\" = " + fatorial);

        scan.close();;
    }

}
