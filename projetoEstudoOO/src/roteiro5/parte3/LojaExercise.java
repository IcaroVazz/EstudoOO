package roteiro5.parte3;

public class LojaExercise {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;

    public LojaExercise(String nomeFantasia, String razaoSocial, String cnpj){
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public LojaExercise(String nomeFantasia,String cnpj){
        this(nomeFantasia, nomeFantasia, cnpj);
    }

    public String getNomeFantasia(){
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial(){
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;   
    }

    public double getValorFat(){
        return valorFat;
    }
    public void setValorFat(double valorFat){
        this.valorFat = valorFat;
    }

    public double getArea(){
        return area;
    }
    public void setArea(double area){
        this.area = area;
    }

    public static LojaExercise compararFat_Static(LojaExercise lojaA, LojaExercise lojaB){
        return lojaA.getValorFat() > lojaB.getValorFat() ? lojaA : lojaB;
    }

    public LojaExercise compararFat_naoStatic(LojaExercise lojaB){
        return this.getValorFat() > lojaB.getValorFat() ? this : lojaB;
    }
}
