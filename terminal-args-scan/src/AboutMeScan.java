import java.util.Locale;
import java.util.Scanner;

public class AboutMeScan {
    
    public static void main(String[] args) {
        //criando objeto scanner
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        //entrada dos dados
        System.out.println("Digite seu nome: ");
        String nome = scan.next();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scan.next();
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        //saida dos dados
        System.out.println("Olá, me chamo " + nome + " " + sobrenome + ".");
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + "m.");
    }

}
