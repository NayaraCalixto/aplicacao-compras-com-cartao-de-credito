package model;

public class Compras implements Comparable<Compras>{
    private String nomeProduto;
    private double precoProduto;

    public Compras(String nomeProduto, double precoProduto) { // burraaaa
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    @Override
    public String toString() {
        return nomeProduto + " - " + precoProduto;
    }

    @Override
    public int compareTo(Compras outraCompras) {
       return Double.valueOf(this.precoProduto).compareTo(Double.valueOf(outraCompras.precoProduto));
    }

}
