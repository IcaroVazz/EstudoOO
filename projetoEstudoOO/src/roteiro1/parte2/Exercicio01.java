package roteiro1.parte2;

public class Exercicio01 {
    public static void main(String[] args) {

        int horasExtra = 10;
        int horasmensais = 160;

        double sb = 3500;
        double salario_hora = sb / horasmensais;
        double total_horaextra = horasExtra * salario_hora;
        double salario_total = sb + total_horaextra;

        System.out.println("O salário Base = $" + sb);
        System.out.println("Horas extra trabalhadas:" + horasExtra);
        System.out.println("valor por hora : $" + salario_hora);
        System.out.println("Salário total: $ " + salario_total);

    }
}
