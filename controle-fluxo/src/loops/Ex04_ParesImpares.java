package loops;

import java.util.Scanner;

/*
 Ler N números inteiros
 Calcular a qtde de números pares e números impares digitados
 */

public class Ex04_ParesImpares {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count;
        int numero;
        int qtdePar = 0;
        int qtdeImpar = 0;

        System.out.println("Informe a Qtde de números para leitura: ");
        count = scan.nextInt();

        while (count > 0) {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            if (numero%2 == 0)
                qtdePar++;
            else
                qtdeImpar++;
            
            count--;
        }

        System.out.println("\nForam digitados " + (qtdePar + qtdeImpar) + " números, sendo:");
        System.out.println("  - qtde de números Pares: " + qtdePar);
        System.out.println("  - Qtde de números Impares: " + qtdeImpar);

        scan.close();
    }
    
}
