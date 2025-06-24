package roteiro6.parte2;

public class Principal {
    public static void main(String[] args) {
        Tempo inicio = new Tempo(14, 30, 0);
        Tempo fim = new Tempo(14, 45, 30);

        Ligacao lig = new Ligacao("71999999999", "71988888888", "Salvador", "Feira de Santana", inicio);
        lig.setHoraFim(fim);

        System.out.println("Número de origem: " + lig.getNumOrigem());
        System.out.println("Número de destino: " + lig.getNumDestino());
        System.out.println("Local de origem: " + lig.getLocalOrigem());
        System.out.println("Local de destino: " + lig.getLocalDestino());
        System.out.println("Horário de início: " + lig.getHoraInicio());
        System.out.println("Horário de fim: " + lig.getHoraFim());
    }
}
