package roteiro3.parte1;
import java.util.Scanner;

public class Programa12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sb, grat, imp, sr;

        System.out.println("Informe o Salário Base:");
        sb = entrada.nextDouble();

        grat = Programa12.calcValor(sb, "grat");  
        imp = Programa12.calcValor(sb, "imp");   
        sr = sb + grat - imp;

        System.out.println("Salário a receber: " + sr);

        entrada.close();
    }

    public static double calcValor(double sb, String tipo) {
        tipo = tipo.toLowerCase(); 

        if (tipo == "grat") {  
            
            return sb * 0.05;
              
        } else if   (tipo == "imp") {

            return  sb * 0.07;

        }
        return  0;  
        }
}
