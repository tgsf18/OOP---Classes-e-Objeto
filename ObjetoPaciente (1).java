import java.util.Scanner;
public class ObjetoPaciente {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        Paciente paciente1 = new Paciente();

        String nome1,endereco1, nivelDeEscolaridade1, email1;
        int dataDeNascimento1, telefone1;
        char sexo1;
        double cpf1;

        System.out.println("Insira seu nome: ");
        nome1 = ler.nextLine();
        System.out.println("Insira seu endereço: ");
        endereco1 = ler.nextLine();
        System.out.println("Digite seu cpf: ");
        cpf1 = ler.nextDouble();
        System.out.println("Insira seu sexo (M ou F): ");
        sexo1 = ler.next().charAt(0);
        ler.nextLine();
        System.out.println("Insira seu nível de escolaridade: ");
        nivelDeEscolaridade1 = ler.nextLine();
        System.out.println("Insira seu email: ");
        email1 = ler.nextLine();
        System.out.println("Insira sua data de nascimento: ");
        dataDeNascimento1 = ler.nextInt();
        ler.nextLine();
        System.out.println("Insira seu telefone: ");
        telefone1 = ler.nextInt();



        paciente1.setNome(nome1);
        paciente1.setEndereco(endereco1);
        paciente1.setCpf(cpf1);
        paciente1.setSexo(sexo1);
        paciente1.setNivelDeEscolaridade(nivelDeEscolaridade1);
        paciente1.setEmail(email1);
        paciente1.setDataDeNascimento(dataDeNascimento1);
        paciente1.setTelefone(telefone1);

        System.out.println("---Paciente 1---");
        System.out.println(paciente1.getNome());
        System.out.println(paciente1.getEndereco());
        System.out.println(paciente1.getCpf());
        System.out.println(paciente1.getSexo());
        System.out.println(paciente1.getNivelDeEscolaridade());
        System.out.println(paciente1.getEmail());
        System.out.println(paciente1.getDataDeNascimento());
        System.out.println(paciente1.getTelefone());



    }
}
