public class Funcionario {
    String nome;
    String endereco;
    double cpf;
    int telefone;
    String cargo;
    int dataDeAdmissao;
    int dataDeDemissao;
    String email;
    char sexo;
    String nivelDeEscolaridade;



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
    public double getCpf(){
        return cpf;
    }
    public void setCpf(double cpf){
        this.cpf = cpf;
    }
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public String getNivelDeEscolaridade(){
        return nivelDeEscolaridade;
    }
    public void setNivelDeEscolaridade(String nivelDeEscolaridade){
        this.nivelDeEscolaridade = nivelDeEscolaridade;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getDataDeAdmissao(){
        return dataDeAdmissao;
    }
    public void setDataDeAdmissao(int dataDeAdmissao){
        this.dataDeAdmissao = dataDeAdmissao;
    }
    public int getDataDeDemissao(){
        return dataDeDemissao;
    }
    public void setDataDeDemissao(int dataDeDemissao){
        this.dataDeDemissao = dataDeDemissao;
    }
    public int getTelefone(){
        return telefone;
    }
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
}
