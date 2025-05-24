package roteiro7.parte2;

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private int qtdeDisciplinas;
    private String situacao;

    Aluno(int pMatricula,String pNome,String pCurso,int pAnoIngresso,int pQtdeDisciplinas,String pSituacao){
        matricula = pMatricula;
        nome = pNome;
        curso = pCurso;
        anoIngresso = pAnoIngresso;
        qtdeDisciplinas = pQtdeDisciplinas;
        situacao = pSituacao;
    }

    public int getMatricula(){
        return matricula;
    } 
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public int getAnoIngresso(){
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso){
        this.anoIngresso = anoIngresso;
    }

    public int getQtdeDisciplinas(){
        return qtdeDisciplinas;
    }
    public void setQtdeDisciplinas(int qtdeDisciplinas){
        this.qtdeDisciplinas = qtdeDisciplinas;
    }

    public String getSituacao(){
        return situacao;
    }
    
    public void setSituacao (String situacao){
        this.situacao = situacao;
    }
}
