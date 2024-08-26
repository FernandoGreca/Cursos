package entities;


public class Product {
    private String nome;
    private double preco;
    private int quantidade;

    public Product(){

    }
    public Product(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public String getName() {
        return nome;
    }
    public void setName(String nome) {
        this.nome = nome;
    }
    public double getPrice() {
        return preco;
    }
    public void setPrice(double preco) {
        this.preco = preco;
    }
    public int getQuantity() {
        return quantidade;
    }
    public void setQuantity(int quantidade) {
        this.quantidade = quantidade;
    }


    public double totalValueStock(){
        return preco * quantidade;
    }
    @Override
    public String toString() {
        return nome + ", " + preco + "," + quantidade ;
    }
}