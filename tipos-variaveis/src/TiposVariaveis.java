public class TiposVariaveis {

    public static void main(String[] args) throws Exception {
        //tipos primitivos
        byte meuByte = 100;
        short meuShort = 15000;
        int meuInt = 250000;
        long meuLong = 1234567890;
        float meuFloat = 35.78f;
        double meuDouble = 12456.7894;
        boolean meuBoolean = true;
        char meuChar = 'A';
        
        //classe String para texto
        String meuNome = "André Carlucci";

        System.out.println("Tipos Primitivos:");
        System.out.println(meuByte);
        System.out.println(meuShort);
        System.out.println(meuInt);
        System.out.println(meuLong);
        System.out.println(meuFloat);
        System.out.println(meuDouble);
        System.out.println(meuBoolean);
        System.out.println(meuChar);

        System.out.println("String 'meuNome': " + meuNome);
    }

}
