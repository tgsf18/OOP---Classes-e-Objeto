import java.util.Scanner;
public class ObjetoCadeira {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        Cadeira cadeira1 = new Cadeira();
        Cadeira cadeira2 = new Cadeira();
        Cadeira cadeira3 = new Cadeira();

        String marca1, cor1, modelo1, dataDeCompra1,marca2, cor2, modelo2, dataDeCompra2,marca3, cor3, modelo3, dataDeCompra3;

        System.out.println("Insira a marca da 1° Cadeira: ");
        marca1 = ler.nextLine();
        System.out.println("Insira a cor da 1° Cadeira: ");
        cor1 = ler.nextLine();
        System.out.println("Insira o modelo da 1° Cadeira: ");
        modelo1 = ler.nextLine();
        System.out.println("Insira a data de compra da 1° Cadeira: ");
        dataDeCompra1 = ler.nextLine();


        System.out.println("Insira a marca da 2° Cadeira: ");
        marca2 = ler.nextLine();
        System.out.println("Insira a cor da 2° Cadeira: ");
        cor2 = ler.nextLine();
        System.out.println("Insira o modelo da 2° Cadeira: ");
        modelo2 = ler.nextLine();
        System.out.println("Insira a data de compra da 2° Cadeira: ");
        dataDeCompra2 = ler.nextLine();


        System.out.println("Insira a marca da 3° Cadeira: ");
        marca3 = ler.nextLine();
        System.out.println("Insira a cor da 3° Cadeira: ");
        cor3 = ler.nextLine();
        System.out.println("Insira o modelo da 3° Cadeira: ");
        modelo3 = ler.nextLine();
        System.out.println("Insira a data de compra da 3° Cadeira: ");
        dataDeCompra3 = ler.nextLine();

        cadeira1.setMarca(marca1);
        cadeira1.setCor(cor1);
        cadeira1.setModelo(modelo1);
        cadeira1.setDataDeCompra(dataDeCompra1);

        cadeira2.setMarca(marca2);
        cadeira2.setCor(cor2);
        cadeira2.setModelo(modelo2);
        cadeira2.setDataDeCompra(dataDeCompra2);

        cadeira3.setMarca(marca3);
        cadeira3.setCor(cor3);
        cadeira3.setModelo(modelo3);
        cadeira3.setDataDeCompra(dataDeCompra3);

        System.out.println("---Cadeira 1---");
        System.out.println(cadeira1.getMarca());
        System.out.println(cadeira1.getCor());
        System.out.println(cadeira1.getModelo());
        System.out.println(cadeira1.getDataDeCompra());

        System.out.println("---Cadeira 2---");
        System.out.println(cadeira2.getMarca());
        System.out.println(cadeira2.getCor());
        System.out.println(cadeira2.getModelo());
        System.out.println(cadeira2.getDataDeCompra());

        System.out.println("---Cadeira 3---");
        System.out.println(cadeira3.getMarca());
        System.out.println(cadeira3.getCor());
        System.out.println(cadeira3.getModelo());
        System.out.println(cadeira3.getDataDeCompra());


    }
}
