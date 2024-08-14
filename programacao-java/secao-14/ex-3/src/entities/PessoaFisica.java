package entities;

public class PessoaFisica extends Pessoa{
    private double gastoSaude;

    public PessoaFisica(){
        super();
    }
    public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }


    public double getGastoSaude() {
        return gastoSaude;
    }
    public void setGastoSaude(double gastoSaude) {
        if (gastoSaude < 0) {
            setGastoSaude(0);
        } else {
            this.gastoSaude = gastoSaude;
        }
        
    }


    @Override
    public double imposto() {
        double imposto = 0;
        if (getRendaAnual() < 20000) {
            imposto = (getRendaAnual() * 0.15) - (gastoSaude * 0.5) ;
        } else {
            imposto = (getRendaAnual() * 0.25) - (gastoSaude * 0.5); 
        }
        return imposto;
    }
}
