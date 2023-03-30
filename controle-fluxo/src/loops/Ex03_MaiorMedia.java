package loops;

import java.util.Scanner;

/*
 Ler 5 números
 Encontrar o menor, o maior e calcular a média
 */

public class Ex03_MaiorMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double numero;
        double maior = 0;
        double menor = 0;
        double media = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número " + (i+1) + ": ");
            numero = scan.nextDouble();

            //totaliza para calcular a Média
            media += numero;

            //encontra o Maior número
            if (maior < numero)
              maior = numero;
            
            //encontra o Menor número
            if (i == 0)
                menor = numero;
            else if (menor > numero)
                menor = numero;
        }

        //calcula a média
        media /= 5;
        System.out.println("Média para os números digitados: " + media);
        //apresenta o maior número digitado
        System.out.println("O maior número digitado foi: " + maior);
        //apresenta o menor número digitado
        System.out.println("O menor número digitado foi: " + menor);

        scan.close();
    }

}
