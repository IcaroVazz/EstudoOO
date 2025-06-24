package roteiro6.parte3;

public class Principal {
    public static void main(String[] args) {
        Ligacao.setPrecoPorMinuto(1.00);

        Tempo inicio1 = new Tempo(10, 0, 0);
        Tempo fim1 = new Tempo(10, 0, 1);
        Ligacao lig1 = new Ligacao("71999999999", "71988888888", "Salvador", "Feira de Santana", inicio1);
        lig1.setHoraFim(fim1);

        System.out.println("Teste 1: Ligação de 1 segundo");
        System.out.println("Valor da ligação (Método 1): R$ " + lig1.calcularValorLigacao());
        System.out.println("Valor da ligação (Método 2 - cobrado 1 minuto para qualquer segundo): R$ " + lig1.calcularValorLigacaoCobrado());

        Tempo inicio2 = new Tempo(10, 0, 0);
        Tempo fim2 = new Tempo(10, 5, 1);
        Ligacao lig2 = new Ligacao("71999999999", "71988888888", "Salvador", "Feira de Santana", inicio2);
        lig2.setHoraFim(fim2);

        System.out.println("\nTeste 2: Ligação de 6 minutos e 1 segundo");
        System.out.println("Valor da ligação (Método 1): R$ " + lig2.calcularValorLigacao());
        System.out.println("Valor da ligação (Método 2 - cobrado 1 minuto para qualquer segundo): R$ " + lig2.calcularValorLigacaoCobrado());

        Tempo inicio3 = new Tempo(10, 0, 0);
        Tempo fim3 = new Tempo(10, 5, 35);
        Ligacao lig3 = new Ligacao("71999999999", "71988888888", "Salvador", "Feira de Santana", inicio3);
        lig3.setHoraFim(fim3);

        System.out.println("\nTeste 3: Ligação de 5 minutos e 35 segundos");
        System.out.println("Valor da ligação (Método 1): R$ " + lig3.calcularValorLigacao());
        System.out.println("Valor da ligação (Método 2 - cobrado 1 minuto para qualquer segundo): R$ " + lig3.calcularValorLigacaoCobrado());

        Tempo inicio4 = new Tempo(9, 55, 50);
        Tempo fim4 = new Tempo(10, 3, 53);
        Ligacao lig4 = new Ligacao("71999999999", "71988888888", "Salvador", "Feira de Santana", inicio4);
        lig4.setHoraFim(fim4);

        System.out.println("\nTeste 4: Ligação de 8 minutos e 3 segundos");
        System.out.println("Valor da ligação (Método 1): R$ " + lig4.calcularValorLigacao());
        System.out.println("Valor da ligação (Método 2 - cobrado 1 minuto para qualquer segundo): R$ " + lig4.calcularValorLigacaoCobrado());
    }
}
