package roteiro4.parte1;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        aluno01.matricula = 111;
        aluno01.nome = "josé";
        aluno01.curso = "Sistema da informação";
        aluno01.anoIngresso = 2019;

        System.out.println("Matrícula:" + aluno01.matricula);
        System.out.println("Nome:" + aluno01.nome);
        System.out.println("Curso:" + aluno01.curso);
        System.out.println("Ano de ingresso:" + aluno01.anoIngresso);

        Aluno aluno02 = new Aluno();
        aluno02.matricula = 222;
        aluno02.nome = "Pedro";
        aluno02.curso = "Análise e desenvolvimento de sistemas";
        aluno02.anoIngresso = 2009;

        System.out.println("Matrícula:" + aluno02.matricula);
        System.out.println("Nome:" + aluno02.nome);
        System.out.println("Curso:" + aluno02.curso);
        System.out.println("Ano de ingresso:" + aluno02.anoIngresso);
    }
}

    
