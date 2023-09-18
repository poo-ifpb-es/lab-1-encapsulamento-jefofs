import java.time.LocalDateTime;
public class ContaBancaria{
    double saldo;
    LocalDateTime horario = LocalDateTime.now();

    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    public void setDepositar(double depositar){
        saldo += depositar;
    }

    public void setSacar(double sacar) {
        if(horario.getHour < 20 || horario.getHour){
            saldo -= sacar;
        }
    }

    public double getSaldo(){
        return saldo;
    }
}