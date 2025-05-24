package roteiro7.parte3;

import java.util.ArrayList;

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private String situacao;
    private ArrayList<String> listaDisciplinas;

    public Aluno(int matricula, String nome, String curso, int anoIngresso, String situacao) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        this.situacao = situacao;
        this.listaDisciplinas = new ArrayList<>();
    }

    public int getMatricula() { return this.matricula; }
    public void setMatricula(int matricula) { this.matricula = matricula; }

    public String getNome() { return this.nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCurso() { return this.curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public int getAnoIngresso() { return this.anoIngresso; }
    public void setAnoIngresso(int anoIngresso) { this.anoIngresso = anoIngresso; }

    public String getSituacao() { return this.situacao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }

    public void adicionarDisciplina(String disciplina) {
        this.listaDisciplinas.add(disciplina);
    }

    public void adicionarDisciplinas(ArrayList<String> disciplinas) {
        this.listaDisciplinas.addAll(disciplinas);
    }

    public ArrayList<String> getListaDisciplinas() {
        return this.listaDisciplinas;
    }
}
