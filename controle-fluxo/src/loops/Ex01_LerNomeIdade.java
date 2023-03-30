package loops;

import java.util.Scanner;

/*
 Ler conjutos de de dois valores: Nome e Idade
 Realizar a leitura dos valores até que se digite zero para o Nome
 */

public class Ex01_LerNomeIdade {
    
    public static void main(String[] args) {
        // classe Scanner para entrada dos dados
        Scanner scan = new Scanner(System.in);
        // declaracao das variáveis
        String nome = "";
        int idade;

        while (!nome.equals("0")) {
            System.out.println("Digite o Nome: ");
            nome = scan.next();
            System.out.println("Digite a Idade: ");
            idade = scan.nextInt();
            
            System.out.println("Você digitou:");
            System.out.println(nome);
            System.out.println(idade);
        }

        scan.close();
    }

}
