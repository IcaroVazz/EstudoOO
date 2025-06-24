package roteiro5.parte3;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

        // Criando a primeira loja
    
        System.out.println("Digite o nome fantasia da loja:");
        String nomeFantasia = entrada.nextLine();
        
        System.out.println("Digite a razão social da loja:");
        String razaoSocial = entrada.nextLine();

        System.out.println("Digite o CNPJ da loja:");
        String cnpj = entrada.nextLine();
 
        
        Loja loja01 = new Loja(nomeFantasia, razaoSocial, cnpj);
        loja01.setValorFat(100000);

        // Criando a segunda loja

        System.out.println("Digite o nome fantasia da loja:");
        String nomeFantasia2 = entrada.nextLine();
        
        System.out.println("Digite a razão social da loja:");
        String razaoSocial2 = entrada.nextLine();

        System.out.println("Digite o CNPJ da loja:");
        String cnpj2 = entrada.nextLine();

        Loja loja02 = new Loja(nomeFantasia2,razaoSocial2, cnpj2);
        loja02.setValorFat(2000000);
        
        // Criando a terceira loja

        System.out.println("Digite o nome fantasia da loja:");
        String nomeFantasia3 = entrada.nextLine();
        
        System.out.println("Digite a razão social da loja:");
        String razaoSocial3 = entrada.nextLine();

        System.out.println("Digite o CNPJ da loja:");
        String cnpj3 = entrada.nextLine();
        
        Loja loja03 = new Loja(nomeFantasia3, razaoSocial3, cnpj3);
        loja03.setValorFat(300000);
        
        
        System.out.println("teste 1");
            if(loja01.getNomeFantasia() == loja03.getNomeFantasia()){
                System.out.println("Lojas iguais");
            }
            else{
             System.out.println("Lojas diferentes");
            }

        System.out.println("teste 2 ");
            if(loja01.getNomeFantasia().equals(loja03.getNomeFantasia())){
                System.out.println("Lojas iguais");
             }
            else{
                 System.out.println("Lojas diferentes");
             }

        System.out.println("teste 3");
            if(loja01 == loja03){
                System.out.println("Lojas iguais");
            }else{
                System.out.println("Lojas diferentes");
            }

        System.out.println("teste 4");
            if(loja01.equals(loja03)){
                System.out.println("Lojas iguais");
            }
            else{
                System.out.println("Lojas diferentes");
            }
        
        System.out.println("Teste 5");{
            if(loja01.getValorFat() == loja03.getValorFat()){
                System.out.println("Faturamentos iguais");
            }
            else{
                System.out.println("faturamentos diferentes");
            }
        }
        
        
        System.out.println("Nome Fantasia: " + loja01.getNomeFantasia());
        System.out.println("Razão Social: " + loja01.getRazaoSocial());
        System.out.println("CNPJ: " + loja01.getCnpj());   
        
        System.out.println("Nome Fantasia: " + loja02.getNomeFantasia());
        System.out.println("Razão Social: " + loja02.getRazaoSocial());
        System.out.println("CNPJ: " + loja02.getCnpj());   

        System.out.println("Nome Fantasia: " + loja03.getNomeFantasia());
        System.out.println("Razão Social: " + loja03.getRazaoSocial());
        System.out.println("CNPJ: " + loja03.getCnpj());   

        System.out.println("Comparação com método estático");
        Loja.compararFat_Static(loja01, loja02);

        System.out.println("Comparação do método não estático ");
        loja01.compararFat_naoStatic(loja02);
        
        System.out.println("Comparação do método não estático");
        loja02.compararFat_naoStatic(loja01);
        
        entrada.close();    


    }
}
