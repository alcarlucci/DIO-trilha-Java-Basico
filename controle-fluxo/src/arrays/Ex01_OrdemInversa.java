package arrays;

import java.util.Scanner;

/*
 Criar um array unidimensional (vetor) com 'n' números inteiros
 Ler as posiçoes do array
 Listar o array na ordem da leitura e inversa
 */

public class Ex01_OrdemInversa {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de posições no Array (vetor):");
        int n = scan.nextInt();

        int[] vetorNumeros = new int[n];

        //leitura do Array
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Digite o número da posição [" + (i+1) + "]:");
            vetorNumeros[i] = scan.nextInt();
        }

        //listagem do Array na ordem da leitura
        System.out.println("\nOrdem de leitura:");
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Posição ["+ (i + 1) +"]: " + vetorNumeros[i]);
        }

        //listagem do Array na ordem inversa
        System.out.println("\nOrdem de inversa:");
        for (int i = vetorNumeros.length - 1; i >= 0; i--) {
            System.out.println("Posição ["+ (i + 1) +"]: " + vetorNumeros[i]);
        }

        scan.close();
    }

}
