public class CarroAluguel {
    float valorPorKm;
    int distancia;
    boolean disponivel = true;

    public CarroAluguel(float valorPorKm){
        this.valorPorKm = valorPorKm;
    }

    public void setValorPorKm(float valor){
        this.valorPorKm = valor;
    }

    public float getValorPorKm(){
        return this.valorPorKm;
    }

    public void setDistanciaPercorrida(int distancia){
        this.distancia = distancia;
    }

    public float getDistanciaPercorrida(){
        return this.distancia;
    }

    public void alugar(){
        if(disponivel == false){
            throw new CarroIndisponivelException();
        }
        this.disponivel = false;
    }

    public void devolver(){
        this.disponivel = true;
    }
}