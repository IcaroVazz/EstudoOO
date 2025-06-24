package roteiro2.parte1;
import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe seu nome : ");
        String nome = entrada.nextLine();

        System.out.println("Nome informado:" + nome);
        
        System.out.println("Digite a sua idade ");
        int idade = entrada.nextInt();

        System.out.println("A sua idade é:" + idade);
        
        
        
        entrada.close();
    }
}
