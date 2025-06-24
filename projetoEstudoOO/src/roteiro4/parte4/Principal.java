package roteiro4.parte4;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu número de matrícula:");
        int matricula = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Digite o seu curso:");
        String curso = entrada.nextLine();

        System.out.println("Digite o seu ano de ingresso na instituiçaõ de ensino:");
        int anoIngresso = entrada.nextInt();

        System.out.println("Digite a sua quantidade de disciplinas:  ");
        int qtdeDisciplinas = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Você está matriculado ? (Responda com sim ou não:)");
        String situacao = entrada.nextLine();

        Aluno aluno01 = new Aluno(matricula, nome, curso, anoIngresso, qtdeDisciplinas, situacao);

        if (qtdeDisciplinas == 0 && situacao.equalsIgnoreCase("sim")) {
            System.out.println("[ERRO]");
        } else if (qtdeDisciplinas == 1 && situacao.equalsIgnoreCase("não")) {
            System.out.println("[ERRO]");
        } else {
            System.out.println("Matrícula: " + aluno01.getMatricula());
            System.out.println("Nome: " + aluno01.getNome());
            System.out.println("Curso: " + aluno01.getCurso());
            System.out.println("Ano de ingresso: " + aluno01.getAnoIngresso());
        }

        entrada.close();
    }
}
