public class Linha{
    Ponto inicio;
    Ponto fim;

    public Linha(Ponto inicio, Ponto fim){
        this.inicio = inicio;
        this.fim = fim;
    }

    public Ponto getInicio() {
        return inicio;
    }

    public void setInicio(Ponto inicio) {
        this.inicio = inicio;
    }

    public Ponto getFim() {
        return fim;
    }

    public void setFim(Ponto fim) {
        this.fim = fim;
    }

    public double getComprimento(){
        double x1 = getInicio().getX();
        double y1 = getInicio().getY();
        double x2 = getFim().getX();
        double y2 = getFim().getY();

        return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
    }
}
