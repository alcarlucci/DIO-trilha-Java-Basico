package loops;

import java.util.Scanner;

/*
 Ler uma Nota entre Zero e Dez
 Continuar lendo até que digite uma Nota válida
 Aprovação para notas a partir de 7
 */

public class Ex02_LerNota {

    public static void main(String[] args) {
        // classe Scanner para entrada dos dados
        Scanner scan = new Scanner(System.in);

        int nota;
        
        do {
            System.out.println("Digite uma Nota entre Zero e Dez: ");
            nota = scan.nextInt();
            if (nota < 0 || nota > 10)
                System.out.println("Nota \"" + nota + "\" inválida! Tente novametne.\n");
        } while (nota < 0 || nota > 10);

        System.out.println("Você digitou a Nota: " + nota);
        if (nota >= 7)
            System.out.println("Parabéns, você foi aprovado!!!");
        else
            System.out.println("Você foi reprovado, continue tentando.");

        scan.close();
    }

}
