package roteiro4.parte2;

public class Principal {
    public static void main(String[] args) {
       
        Aluno aluno01 = new Aluno(111,"jose","SI",2019);
      

        System.out.println("Matrícula:" + aluno01.matricula);
        System.out.println("Nome:" + aluno01.nome);
        System.out.println("Curso:" + aluno01.curso);
        System.out.println("Ano de ingresso:" + aluno01.anoIngresso);
    }
}

    
