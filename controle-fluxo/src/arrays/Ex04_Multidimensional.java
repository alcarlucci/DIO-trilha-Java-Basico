package arrays;

import java.util.Random;
import java.util.Scanner;

/*
 Gerar e listar uma matriz 4x4 com valores aleatórios entre 0 e "limite"
 */

public class Ex04_Multidimensional {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite o limite para os números aleatórios:");
        int limite = scan.nextInt();
        
        int[][] matrizNumeros = new int[4][4];

        // leitura da matriz de numeros aleatorios
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                matrizNumeros[i][j] = random.nextInt(limite);
            }
        }

        // listagem da matriz usando Foreach
        System.out.println("Números aleatórios armazenados no Matriz:");
        for (int[] linha : matrizNumeros) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

        scan.close();
    }

}
