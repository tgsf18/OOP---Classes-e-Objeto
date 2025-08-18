import java.util.Scanner;
public class ObjetoComputador{
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);

        Computador computador1 = new Computador();
        Computador computador2 = new Computador();
        Computador computador3= new Computador();

        String modelo, modelo2, modelo3, versao, versao2,versao3;
        double valor, valor2, valor3;

        double cashback1 = computador1.getCashback();
        double cashback2 = computador2.getCashback();
        double cashback3 = computador3.getCashback();

        double totalCashback = cashback1 + cashback2 + cashback3;

        int dataDeCompra, dataDeCompra2, dataDeCompra3;


        System.out.println("------------- CashBack---------------");
        ler.nextLine();
        System.out.println("------------- Computador 1---------------");
        System.out.println("Qual é o modelo deste computador :");
        modelo = ler.nextLine();
        System.out.println("Qual é a versão deste computador :");
        versao = ler.nextLine();
        System.out.println("Qual é o valor deste computador :");
        valor = ler.nextDouble();
        System.out.println("Qual é a data de compra deste computador :");
        dataDeCompra = ler.nextInt();
        ler.nextLine();
        System.out.println("------------- Computador 2---------------");
        System.out.println("Qual é o modelo deste computador :");
        modelo2 = ler.nextLine();
        System.out.println("Qual é a versão deste computador :");
        versao2 = ler.nextLine();
        System.out.println("Qual é o valor deste computador :");
        valor2 = ler.nextDouble();
        System.out.println("Qual é a data de compra deste computador :");
        dataDeCompra2 = ler.nextInt();
        ler.nextLine();
        System.out.println("------------- Computador 3---------------");

        System.out.println("Qual é o modelo deste computador :");
        modelo3 = ler.nextLine();
        System.out.println("Qual é a versão deste computador :");
        versao3 = ler.nextLine();
        System.out.println("Qual é o valor deste computador :");
        valor3 = ler.nextDouble();
        System.out.println("Qual é a data de compra deste computador :");
        dataDeCompra3 = ler.nextInt();

        computador1.setModelo(modelo);
        computador1.setVersao(versao);
        computador1.setValor(valor);
        computador1.setDataDeCompra(dataDeCompra);

        computador2.setModelo(modelo2);
        computador2.setVersao(versao2);
        computador2.setValor(valor2);
        computador2.setDataDeCompra(dataDeCompra2);

        computador3.setModelo(modelo3);
        computador3.setVersao(versao3);
        computador3.setValor(valor3);
        computador3.setDataDeCompra(dataDeCompra3);

        System.out.println("\n------------- Resultado ---------------");

        System.out.println("------------- Computador 1 ---------------");

        System.out.println("Modelo" +computador1.getModelo());
        System.out.println("Versao"+ computador1.getVersao());
        System.out.println("Valor" +computador1.getValor());
        System.out.println("Data de Compra" +computador1.getDataDeCompra());

        System.out.println("------------- Computador 2 ---------------");

        System.out.println("Modelo" +computador2.getModelo());
        System.out.println("Versao"+ computador2.getVersao());
        System.out.println("Valor" +computador2.getValor());
        System.out.println("Data de Compra" +computador2.getDataDeCompra());

        System.out.println("------------- Computador 3 ---------------");

        System.out.println("Modelo" +computador3.getModelo());
        System.out.println("Versao"+ computador3.getVersao());
        System.out.println("Valor" +computador3.getValor());
        System.out.println("Data de Compra" +computador3.getDataDeCompra());

        System.out.println("------------- CashBack---------------");

        System.out.println("Cashback do computador 1: R$" + cashback1);
        System.out.println("Cashback do computador 2: R$" + cashback2);
        System.out.println("Cashback do computador 3: R$" + cashback3);
        System.out.println("Total de cashback: R$" + totalCashback);
    }
}
