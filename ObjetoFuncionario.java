import java.util.Scanner;

public class ObjetoFuncionario {

    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        Funcionario objFuncionario = new Funcionario();

        System.out.println("Deseja fazer quantas fichas de funcionario: ");
        int info = ler.nextInt();



        for(int i = 0; i < info; i++){
            System.out.println("insira o nome do paciente:");
            String nome = ler.nextLine();
            ler.nextLine();

            System.out.println("insira o endereço do paciente:");
            String endereco = ler.nextLine();


            System.out.println("insira o cpf do paciente:");
            int cpf = ler.nextInt();


            System.out.println("insira o sexo do paciente:");
            char sexo = ler.next().charAt(0);


            System.out.println("insira o nivel de escolaridade do paciente:");
            String nivelEscolaridade = ler.nextLine();


            System.out.println("insira o email do paciente:");
            String email = ler.nextLine();

            System.out.println("insira o cargo do paciente:");
            String cargo = ler.nextLine();

            System.out.println("insira a data de admissao do paciente:");
            int dataAdmissao= ler.nextInt();

            System.out.println("insira a data de admissao do paciente:");
            int dataDemissao= ler.nextInt();

            System.out.println("insira o telefone do paciente:");
            int telefone = ler.nextInt();



            objFuncionario.setNome(nome);
            ler.nextLine();
            objFuncionario.setEndereco(endereco);
            objFuncionario.setCpf(cpf);
            objFuncionario.setSexo(sexo);
            objFuncionario.setNivelDeEscolaridade(nivelEscolaridade);
            objFuncionario.setEmail(email);
            objFuncionario.setDataDeAdmissao(dataAdmissao);
            objFuncionario.setTelefone(telefone);
            objFuncionario.setCargo(cargo);
            objFuncionario.setDataDeDemissao(dataDemissao);



            System.out.println("----------Funcionario:--------------");

            System.out.println(objFuncionario.getNome());
            System.out.println(objFuncionario.getEndereco());
            System.out.println(objFuncionario.getCpf());
            System.out.println(objFuncionario.getSexo());
            System.out.println(objFuncionario.getNivelDeEscolaridade());
            System.out.println(objFuncionario.getEmail());
            System.out.println(objFuncionario.getTelefone());
            System.out.println(objFuncionario.getCargo());
            System.out.println(objFuncionario.getDataDeAdmissao());
            System.out.println(objFuncionario.getDataDeDemissao());

        }
    }
}
