class Circulo{
    float raio;

    public Circulo(float raio){
        this.raio = raio;
    }

    public float getRaio(){
        return this.raio;
    }

    public void setRaio(float raio){
        this.raio = raio;
    }

    public float getArea(){
        return this.raio * 3.14159f * this.raio;
    }

    public float getCircunferencia(float area){
        return this.raio * 2.0f * 3.14159f;
    }
}