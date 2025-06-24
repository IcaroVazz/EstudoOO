package roteiro2.parte4;
import java.util.Scanner;

public class Programa8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int [] Vetornotas = new int[5];

        for (int cont = 0; cont < 5; cont++){
            System.out.print("informe uma nota");
            int nota = entrada.nextInt();
         
            Vetornotas [cont] = nota;
        }
        
        for (int cont = 0; cont < 5; cont++){
            System.out.println("A sua nota na posicao : " + cont + " = " + Vetornotas[cont]);
        }
        entrada.close();
}}
