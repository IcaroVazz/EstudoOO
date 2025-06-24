package roteiro6.parte3;

public class Ligacao {
    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private Tempo horaInicio;
    private Tempo horaFim;
    private static double precoPorMinuto = 1.00;

    public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, Tempo horaInicio) {
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horaInicio = horaInicio;
        this.horaFim = null;
    }

    public boolean participaDaLigacao(String numero) {
        return numOrigem.equals(numero) || numDestino.equals(numero);
    }

    
    public double calcularValorLigacao() {
        if (horaInicio == null || horaFim == null) {
            return 0.0;
        }

        int segundosInicio = horaInicio.getHora() * 3600 + horaInicio.getMinuto() * 60 + horaInicio.getSegundo();
        int segundosFim = horaFim.getHora() * 3600 + horaFim.getMinuto() * 60 + horaFim.getSegundo();
        int duracaoSegundos = segundosFim - segundosInicio;

        if (duracaoSegundos <= 0) {
            return 0.0;
        }

        int minutos = (int) Math.ceil(duracaoSegundos / 60.0); 
        return minutos * precoPorMinuto;
    }

   
    public double calcularValorLigacaoCobrado() {
        if (horaInicio == null || horaFim == null) {
            return 0.0;
        }

        int segundosInicio = horaInicio.getHora() * 3600 + horaInicio.getMinuto() * 60 + horaInicio.getSegundo();
        int segundosFim = horaFim.getHora() * 3600 + horaFim.getMinuto() * 60 + horaFim.getSegundo();
        int duracaoSegundos = segundosFim - segundosInicio;

        if (duracaoSegundos <= 0) {
            return 0.0;
        }

  
        int minutosCobrado = (duracaoSegundos % 60 == 0) ? duracaoSegundos / 60 : (duracaoSegundos / 60) + 1;
        return minutosCobrado * precoPorMinuto;
    }


    public String getNumOrigem() {
        return numOrigem;
    }

    public void setNumOrigem(String numOrigem) {
        this.numOrigem = numOrigem;
    }

    public String getNumDestino() {
        return numDestino;
    }

    public void setNumDestino(String numDestino) {
        this.numDestino = numDestino;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    public String getLocalDestino() {
        return localDestino;
    }

    public void setLocalDestino(String localDestino) {
        this.localDestino = localDestino;
    }

    public Tempo getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Tempo horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Tempo getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Tempo horaFim) {
        this.horaFim = horaFim;
    }

   
    public static double getPrecoPorMinuto() {
        return precoPorMinuto;
    }

    public static void setPrecoPorMinuto(double preco) {
        precoPorMinuto = preco;
    }
}
