package roteiro7.parte2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        System.out.println("Cadastro de Alunos:");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");

            System.out.print("Matrícula: ");
            int matricula = entrada.nextInt();
            entrada.nextLine(); 

            System.out.print("Nome: ");
            String nome = entrada.nextLine();

            System.out.print("Curso: ");
            String curso = entrada.nextLine();

            System.out.print("Ano de Ingresso: ");
            int anoIngresso = entrada.nextInt();

            System.out.print("Quantidade de Disciplinas: ");
            int qtdeDisciplinas = entrada.nextInt();
            entrada.nextLine();

            System.out.print("Situação: ");
            String situacao = entrada.nextLine();

            Aluno aluno = new Aluno(matricula, nome, curso, anoIngresso, qtdeDisciplinas, situacao);
            listaAlunos.add(aluno);
        }

        System.out.println("\nListando os Alunos:");
        System.out.println("----------------------");

        for (Aluno a : listaAlunos) {
            System.out.println("Matrícula: " + a.getMatricula());
            System.out.println("Nome: " + a.getNome());
            System.out.println("Curso: " + a.getCurso());
            System.out.println("Ano Ingresso: " + a.getAnoIngresso());
            System.out.println("Quantidade de Disciplinas: " + a.getQtdeDisciplinas());
            System.out.println("Situação: " + a.getSituacao());
            System.out.println("----------------------");
        }

        entrada.close();
    }
}
