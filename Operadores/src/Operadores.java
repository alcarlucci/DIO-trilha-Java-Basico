public class Operadores {
    
    public static void main(String[] args) {

        //  Atribuição
        String nome = "André";
        int idade = 46;
        double peso = 62.5;
        char sexo = 'M';
        boolean doadorOrgao = true;
        System.out.println(nome+"; "+idade+"; "+peso+"; "+sexo+"; "+doadorOrgao);

        // Aritméticos
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);
        System.out.println(soma+"; "+subtração+"; "+multiplicacao+"; "+divisao+"; "+modulo+"; "+resultado);

        // + : concatenção de duas strings
        String primeiroNome = "André";
        String segundoNome = "Carlucci";
        System.out.println("Nome completo: " + primeiroNome + " " + segundoNome);

        // Unários
        int numero = 5;
                
        //Imprimindo o numero negativo
        System.out.println(- numero);
        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);
        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++); //imprime e depois incrementa
        System.out.println(numero);    //mas o numero virou 7
        System.out.println(++ numero); //incrementa e depois imprime
        //decrementa o numero e imprime
        System.out.println(-- numero);
        //operador negação
        boolean verdadeiro = true;
        System.out.println(verdadeiro);
        System.out.println("Inverteu: " + !verdadeiro);

        // Ternário
        int a, b;
        String resposta;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
            resposta = "verdadeiro";
        else
            resposta = "falso";
        */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        a = 5;
        b = 6;
        resposta = (a==b) ? "verdadeiro" : "false";
        System.out.println("a = b: " + resposta);
        a = 5;
        b = 5;
        resposta = (a==b) ? "verdadeiro" : "false";
        System.out.println("a = b: " + resposta);

        // Relacionais
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");
        
        // Lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        //Se condicao1 E condicao2 for verdadeira, executar código.
        if(condicao1 && condicao2)
            System.out.print("<E> : as duas condições precisam ser verdadeiros");

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.print("<OU> : uma das condições precisa ser verdadeira");
    }
}
