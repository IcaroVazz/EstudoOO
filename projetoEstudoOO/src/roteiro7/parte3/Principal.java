package roteiro7.parte3;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        System.out.println("Cadastro de Aluno");

        System.out.print("Matrícula: ");
        int matricula = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Curso: ");
        String curso = scanner.nextLine();

        System.out.print("Ano de Ingresso: ");
        int anoIngresso = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Situação: ");
        String situacao = scanner.nextLine();

        Aluno aluno = new Aluno(matricula, nome, curso, anoIngresso, situacao);

        System.out.print("Quantas disciplinas deseja adicionar? ");
        int qtdeDisciplinas = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < qtdeDisciplinas; i++) {
            System.out.print("Digite o nome da disciplina " + (i + 1) + ": ");
            String disciplina = scanner.nextLine();
            aluno.adicionarDisciplina(disciplina);
        }

        listaAlunos.add(aluno);

        System.out.println("\n--- Dados do Aluno Cadastrado ---");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Ano de Ingresso: " + aluno.getAnoIngresso());
        System.out.println("Situação: " + aluno.getSituacao());
        System.out.println("Quantidade de disciplinas matriculadas: " + aluno.getListaDisciplinas().size());
        System.out.println("Disciplinas:");
        for (String d : aluno.getListaDisciplinas()) {
            System.out.println(" - " + d);
        }

        scanner.close();
    }
}
