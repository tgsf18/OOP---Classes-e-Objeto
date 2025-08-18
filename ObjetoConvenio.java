import java.util.Scanner;
public class ObjetoConvenio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Convenio objConvenio = new Convenio();

        System.out.println("insira o nome do convenio:");
        String nome = ler.nextLine();
        ler.nextLine();

        System.out.println("insira o plano do convenio:");
        String plano = ler.nextLine();

        System.out.println("insira a tarifa do convenio:");
        double tarifa = ler.nextDouble();

        objConvenio.setNome(nome);
        ler.nextLine();
        objConvenio.setPlano(plano);
        objConvenio.setTarifa(tarifa);

        System.out.println("----------Funcionario:--------------");
        System.out.println(objConvenio.getNome());
        System.out.println(objConvenio.getPlano());
        System.out.println(objConvenio.getTarifa());
    }
}