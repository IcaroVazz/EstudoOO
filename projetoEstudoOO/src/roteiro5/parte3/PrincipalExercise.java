package roteiro5.parte3;
import java.util.Scanner;

public class PrincipalExercise {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Criando a primeira loja
        System.out.println("Digite o nome fantasia da loja:");
        String nomeFantasia = entrada.nextLine();
        
        System.out.println("Digite a razão social da loja:");
        String razaoSocial = entrada.nextLine();

        System.out.println("Digite o CNPJ da loja:");
        String cnpj = entrada.nextLine();
        
        LojaExercise loja01 = new LojaExercise(nomeFantasia, razaoSocial, cnpj);
        loja01.setValorFat(100000);

        // Criando a segunda loja
        System.out.println("Digite o nome fantasia da loja:");
        String nomeFantasia2 = entrada.nextLine();
        
        System.out.println("Digite a razão social da loja:");
        String razaoSocial2 = entrada.nextLine();

        System.out.println("Digite o CNPJ da loja:");
        String cnpj2 = entrada.nextLine();

        LojaExercise loja02 = new LojaExercise(nomeFantasia2, razaoSocial2, cnpj2);
        loja02.setValorFat(2000000);

        // Criando a terceira loja
        System.out.println("Digite o nome fantasia da loja:");
        String nomeFantasia3 = entrada.nextLine();
        
        System.out.println("Digite a razão social da loja:");
        String razaoSocial3 = entrada.nextLine();

        System.out.println("Digite o CNPJ da loja:");
        String cnpj3 = entrada.nextLine();
        
        LojaExercise loja03 = new LojaExercise(nomeFantasia3, razaoSocial3, cnpj3);
        loja03.setValorFat(300000);

        // Testes
        System.out.println("teste 1");
        if(loja01.getNomeFantasia() == loja03.getNomeFantasia()){
            System.out.println("Lojas iguais");
        } else {
            System.out.println("Lojas diferentes");
        }

        System.out.println("teste 2");
        if(loja01.getNomeFantasia().equals(loja03.getNomeFantasia())){
            System.out.println("Lojas iguais");
        } else {
            System.out.println("Lojas diferentes");
        }

        System.out.println("teste 3");
        if(loja01 == loja03){
            System.out.println("Lojas iguais");
        } else {
            System.out.println("Lojas diferentes");
        }

        System.out.println("teste 4");
        if(loja01.equals(loja03)){
            System.out.println("Lojas iguais");
        } else {
            System.out.println("Lojas diferentes");
        }

        System.out.println("Teste 5");
        if(loja01.getValorFat() == loja03.getValorFat()){
            System.out.println("Faturamentos iguais");
        } else {
            System.out.println("Faturamentos diferentes");
        }

        // Exibindo dados das lojas
        System.out.println("Nome Fantasia: " + loja01.getNomeFantasia());
        System.out.println("Razão Social: " + loja01.getRazaoSocial());
        System.out.println("CNPJ: " + loja01.getCnpj());   

        System.out.println("Nome Fantasia: " + loja02.getNomeFantasia());
        System.out.println("Razão Social: " + loja02.getRazaoSocial());
        System.out.println("CNPJ: " + loja02.getCnpj());   

        System.out.println("Nome Fantasia: " + loja03.getNomeFantasia());
        System.out.println("Razão Social: " + loja03.getRazaoSocial());
        System.out.println("CNPJ: " + loja03.getCnpj());   

        // Comparações com retorno
        System.out.println("Comparação com método estático");
        LojaExercise lojaMaiorFat = LojaExercise.compararFat_Static(loja01, loja02);
        System.out.println("Loja com maior faturamento (estático): " + lojaMaiorFat.getNomeFantasia());

        System.out.println("Comparação do método não estático");
        LojaExercise maiorFat1 = loja01.compararFat_naoStatic(loja02);
        System.out.println("Loja com maior faturamento (não estático): " + maiorFat1.getNomeFantasia());

        System.out.println("Comparação do método não estático");
        LojaExercise maiorFat2 = loja02.compararFat_naoStatic(loja01);
        System.out.println("Loja com maior faturamento (não estático): " + maiorFat2.getNomeFantasia());

        entrada.close();
    }
}
