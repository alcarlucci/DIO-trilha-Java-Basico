public class TabelaVerdade {
    
    public static void main(String[] args) {
        //TABELA VERDADE: demonstrando comparações lógicas entre Operadores Lógicos
        boolean bTrue = true;
        boolean bFalse = false;

        //Conjunção: operador && - AND
        System.out.println("Operador && (AND)");
        System.out.println("V  &&  V  " + (bTrue && bTrue));
        System.out.println("V  &&  F  " + (bTrue && bFalse));
        System.out.println("F  &&  V  " + (bFalse && bTrue));
        System.out.println("F  &&  F  " + (bFalse && bFalse) + "\n");


        //Disjunção: operador || - OR
        System.out.println("Operador || (OR)");
        System.out.println("V  ||  V  " + (bTrue || bTrue));
        System.out.println("V  ||  F  " + (bTrue || bFalse));
        System.out.println("F  ||  V  " + (bFalse || bTrue));
        System.out.println("F  ||  F  " + (bFalse || bFalse) + "\n");

        //Disjunção exclusiva: operador ^ - XOR
        System.out.println("Operador ^ (XOR)");
        System.out.println("V  ^  V  " + (bTrue ^ bTrue));
        System.out.println("V  ^  F  " + (bTrue ^ bFalse));
        System.out.println("F  ^  V  " + (bFalse ^ bTrue));
        System.out.println("F  ^  F  " + (bFalse ^ bFalse) + "\n");

        //Negação: operador !
        System.out.println("Operador ! (negação)");
        System.out.println("! V  " + (!bTrue));
        System.out.println("! F  " + (!bFalse) + "\n");
    }
}
