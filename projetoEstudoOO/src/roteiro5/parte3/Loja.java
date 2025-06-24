package roteiro5.parte3;

public class Loja {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    

public Loja(String nomeFantasia, String razaoSocial, String cnpj){
    this.nomeFantasia = nomeFantasia;
    this.razaoSocial = razaoSocial;
    this.cnpj = cnpj;
}

public Loja(String nomeFantasia,String cnpj){
    this(nomeFantasia,nomeFantasia,cnpj);
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

    public static void compararFat_Static (Loja lojaA,Loja lojaB){
        if (lojaA.getValorFat()>lojaB.getValorFat()){
            System.out.println("Loja de maior Faturamento:" + lojaA.getNomeFantasia());
        }
        else{
            System.out.println("Loja de maior faturamento:" + lojaB.getNomeFantasia());
        }
    }

    public void compararFat_naoStatic(Loja lojaB){
        if(this.getValorFat()>lojaB.getValorFat()){
            System.out.println("Loja de maior faturamento: " + this.nomeFantasia);
        }
        else{
            System.out.println("Loja de maior faturamento: "+lojaB.nomeFantasia);
        }
    }
}

    

