import
public class ContaBancaria{
    double saldo;

    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    public void setDepositar(double depositar){
        saldo += depositar;
    }

    public void setSacar(double sacar) {
        saldo -= sacar;
    }

    public double getSaldo(){
        return saldo;
    }
}