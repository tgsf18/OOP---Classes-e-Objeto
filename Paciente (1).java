public class Paciente {
    String nome;
    String endereco;
    double cpf;
    char sexo;
    String nivelDeEscolaridade;
    String email;
    int dataDeNascimento;
    int telefone;


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
    public int getDataDeNascimento(){
        return dataDeNascimento;
    }
    public void setDataDeNascimento(int dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento;
    }
    public int getTelefone(){
        return telefone;
    }
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
}
