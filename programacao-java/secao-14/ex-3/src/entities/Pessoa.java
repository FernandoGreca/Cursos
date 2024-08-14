package entities;

public abstract class Pessoa {
    private String nome;
    private double rendaAnual;

    public Pessoa(){
    }
    public Pessoa(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getRendaAnual() {
        return rendaAnual;
    }
    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }


    public abstract double imposto();


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(nome);
        sb.append(": $ ");
        sb.append(String.format("%.2f", imposto()));

        return sb.toString();
    }
}