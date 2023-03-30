package loops;

import java.util.Scanner;

/*
 Gerador de Tabuada
 Informar de qual número deseja ver a tabuada
 */

public class Ex05_Tabuada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;

        System.out.println("De qual número deseja gerar a tabuada: ");
        tabuada = scan.nextInt();

        System.out.println("Tabuada do \"" + tabuada + "\":");

        for (int i = 0; i < 10; i++) {
            int resultado = tabuada * (i + 1);

            System.out.println(tabuada + " X " + (i + 1) + " = " + resultado);
        }

        scan.close();
    }

}
