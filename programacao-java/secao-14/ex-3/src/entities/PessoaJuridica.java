package entities;

public class PessoaJuridica extends Pessoa{
    private int numeroFuncionario;


    public PessoaJuridica() {
        super();
    }
    public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionario) {
        super(nome, rendaAnual);
        this.numeroFuncionario = numeroFuncionario;
    }


    public int getNumeroFuncionario() {
        return numeroFuncionario;
    }
    public void setNumeroFuncionario(int numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }


    @Override
    public double imposto() {
        double imposto = 0;
        if (numeroFuncionario > 10) {
            imposto = getRendaAnual() * 0.14;
        } else {
            imposto = getRendaAnual() * 0.16;
        }
        return imposto;
    }
}
