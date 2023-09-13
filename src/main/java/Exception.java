public class CarroIndisponivelException extends Exception{
    public CarroIndisponivelException(){
        super("O carro já está alugado.");
    }
}