public class Computador {

    String modelo;
    String versao;
    double valor;
    int dataDeCompra;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getVersao() {
        return versao;
    }
    public void setVersao(String versao){
        this.versao = versao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }

    public int getDataDeCompra() {
        return dataDeCompra;
    }

    public void setDataDeCompra(int dataDeCompra) {
        this.dataDeCompra = dataDeCompra;
    }

    public double getCashback() {
        // Cashback de 10% do valor do computador
        return this.valor * 10;
    }
}
