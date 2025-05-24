package roteiro7.parte1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno[] ListaAlunos = new Aluno[3];

        System.out.println("Cadastro de Alunos:");
        for (int i = 0; i < ListaAlunos.length; i++) {
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

            ListaAlunos[i] = new Aluno(matricula, nome, curso, anoIngresso, qtdeDisciplinas, situacao);
        }

        System.out.println("\nListando os Alunos:");
        System.out.println("----------------------");

        for (int i = 0; i < ListaAlunos.length; i++) {
            System.out.println("Matrícula: " + ListaAlunos[i].getMatricula());
            System.out.println("Nome: " + ListaAlunos[i].getNome());
            System.out.println("Curso: " + ListaAlunos[i].getCurso());
            System.out.println("Ano Ingresso: " + ListaAlunos[i].getAnoIngresso());
            System.out.println("Quantidade de Disciplinas: " + ListaAlunos[i].getQtdeDisciplinas());
            System.out.println("Situação: " + ListaAlunos[i].getSituacao());
            System.out.println("----------------------");
        }

        entrada.close();
    }
}
