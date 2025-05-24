package roteiro8.parte1;
public class Cliente{
private String cpf_cnpj;
private String nome;
private String endereco;
private String email;
private int telefone;

Cliente(String pCpf_cnpj,String pNome,String pEndereco, String pEmail,int pTelefone){
    cpf_cnpj = pCpf_cnpj;
    nome = pNome;
    endereco = pEndereco;
    email = pEmail;
    telefone = pTelefone;
}
public String getCpf_cnpj(){
    return cpf_cnpj;
}
public void setCpf_cnpj(String cpf_cnpj){
    this.cpf_cnpj = cpf_cnpj;
}
public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}

public String getEndereco(){
    return endereco;
}
public void setEndereco(String endereco){
    this.endereco = endereco;
}
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email = email;
}
public int getTelefone(){
    return telefone;
}
public void setTelefone(int telefone){
    this.telefone = telefone;
}







































}

