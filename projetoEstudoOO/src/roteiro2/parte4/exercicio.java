package roteiro2.parte4;
import java.util.Random;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(100)+1;
        
         System.out.println("Advinhe o número secreto entre 1 e 100! ");
         int numberDigitado = scanner.nextInt();


         while(numberDigitado != numeroSecreto){
            
            if(numberDigitado < numeroSecreto){
                
                System.out.println("O seu palpite foi baixo");
                System.out.println("O número secreto é maior que " + numberDigitado + ". Tente novamente!");

            }else if(numberDigitado > numeroSecreto){
                
                System.out.println("O seu palpite foi alto");
                System.out.println("O número secreto é menor que " + numberDigitado + ". Tente novamente!");
                
            }
            
             System.out.println("Você errou! Tente novamente! Digite outro número");
             numberDigitado = scanner.nextInt();
         }
        
            System.out.println("Parabéns! Você acertou o número secreto: " + numeroSecreto + "!");
             scanner.close();
    }
}
