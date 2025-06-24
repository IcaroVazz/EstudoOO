package roteiro5.parte1;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite o nome fantasia da loja:");
        String nomeFantasia = entrada.nextLine();
        
        System.out.println("Digite a razão social da loja:");
        String razaoSocial = entrada.nextLine();

        System.out.println("Digite o CNPJ da loja:");
        String cnpj = entrada.nextLine();

        System.out.println("Digite o valor faturado da loja:");
        double valorFat = entrada.nextDouble();

        System.out.println("Digite a área da loja:");
        double area = entrada.nextDouble();
        
        Loja loja01 = new Loja(nomeFantasia, razaoSocial, cnpj, valorFat, area);
        
        
        System.out.println("Nome Fantasia: " + loja01.getNomeFantasia());
        System.out.println("Razão Social: " + loja01.getRazaoSocial());
        System.out.println("CNPJ: " + loja01.getCnpj());          
        
        entrada.close();    
    }
}
