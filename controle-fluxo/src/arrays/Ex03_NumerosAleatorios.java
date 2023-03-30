package arrays;

import java.util.Random;
import java.util.Scanner;

/*
 Gerar e guardar "n" números aleatórios (entre 0 e um "limite") em um Array
 Listar o Array gerado usando Foreach
 */

public class Ex03_NumerosAleatorios {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Qual o limite para o intervalo de números aleatórios: ");
        int limite = scan.nextInt();
        System.out.println("Digite a qtde de números aleatórios (entre 0 e "+ limite +"): ");
        int n = scan.nextInt();

        int[] numerosAleatorios = new int[n];

        // leitura do array de numeros aleatorios
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = random.nextInt(limite);
        }

        // listagem do array usando Foreach
        System.out.println("Números aleatórios armazenados no Array:");
        for (int num : numerosAleatorios) {
            System.out.print(num + "; ");
        }

        scan.close();
    }

}
