public class Decisao {

    public static void main(String[] args) {

        int mes = 1;

        //if - else if
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        }

        if (mes == 1 || mes == 7 || mes == 12) {
            System.out.println("Mês de férias");
        } else {
            System.out.println("Mês de trabalhar");
        }

        int diaSemana = 1;

        //switch
        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia da Semana inválido.");
                break;
        }

        switch (diaSemana) {
            case 1, 7:
                System.out.println("Oba! Final de Semana!");
                break;
            case 2, 3, 4, 5:
                System.out.println("Bora trabalhar!");
                break;
            case 6:
                System.out.println("Sextou!!!");
                break;
            default:
                System.out.println("Dia da Semana inválido.");
                break;
        }

    }    

}
