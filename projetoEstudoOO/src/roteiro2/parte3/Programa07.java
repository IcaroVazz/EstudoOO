package roteiro2.parte3;
import java.util.Scanner;

public class Programa07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        int cont = 0;
        int soma = 0;
        
        System.out.println("Informe uma a primeira nota");
        int nota = entrada.nextInt();

        while (nota!=-1) {
            

            cont++;
            soma = soma + nota;
            if (nota>=7){
                System.out.println("Aprovado");
            } else{
                System.out.println("Reprovado");
            }

            System.out.println("Informe a proxima nota:");
            nota = entrada.nextInt();

         }

         System.out.println("a quantidade de notas inseridas foram:  " + cont );
         System.out.println(" a soma das notas foram: " + soma );
         System.out.println("a media das notas foram: " + (soma/cont));
         
            entrada.close();
    }
}   



