package Veiculo;

public class Main {
    public static void main(String[]args) {

        Veiculo veiculo = new Veiculo("BMW", "320I", "Rosa",2021);
        System.out.println("VEICULO: ");
        System.out.println("MARCA: " +veiculo.getMarca());
        System.out.println("MODELO: " +veiculo.getModelo());
        System.out.println("COR: " +veiculo.getCor());
        System.out.println("ANO: " +veiculo.getAno());

        Automovel automovel = new Automovel("BMW", "320I", "Rosa",2021, "I10", 4);
        System.out.println("\nAutomóvel: ");
        System.out.println("MARCA: " +automovel.getMarca());
        System.out.println("MODELO: " +automovel.getModelo());
        System.out.println("COR: " +automovel.getCor());
        System.out.println("NÚMEROS DE PORTAS: " +automovel.getNumeroPortas());
        System.out.println("MOTOR: " +automovel.getMotor());


        Moto moto = new Moto("BMW", "310", "Rosa",2019, 310);
        System.out.println("\nMoto: ");
        System.out.println("MARCA: " +moto.getMarca());
        System.out.println("MODELO: " +moto.getModelo());
        System.out.println("COR: " +moto.getCor());
        System.out.println("CILINDRADA: " +moto.getCilindrada());
    }
}
