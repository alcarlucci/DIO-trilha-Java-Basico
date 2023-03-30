package arrays;

import java.util.Scanner;

/*
 Ler um array com "n" caracteres
 Calcular o número de consoantes lidas
 Mostrar o total de consoantes e as consoantes lidas
 */

public class Ex02_Consoantes {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de posições no Array: ");
        int n = scan.nextInt();

        char[] arrayChars = new char[n];
        int totalConsoantes = 0;
        String consoantes = "";

        //leitura do array de caracteres
        for (int i = 0; i < arrayChars.length; i++) {
            System.out.println("Digite o caracter na posição ["+ (i + 1) +"]: ");
            arrayChars[i] = scan.next().toUpperCase().charAt(0);

            // totaliza as consoantes
            if (arrayChars[i] != 'A' &&
                arrayChars[i] != 'E' &&
                arrayChars[i] != 'I' &&
                arrayChars[i] != 'O' &&
                arrayChars[i] != 'U')
            {
                totalConsoantes++;
                consoantes = consoantes + arrayChars[i] + " ; ";
            }
        }

        // mostra o total e as consoantes digitadas
        System.out.println("Foram digitadas " + totalConsoantes + " consoantes: ");
        System.out.println(consoantes);

        scan.close();
    }

}
