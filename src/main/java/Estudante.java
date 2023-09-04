class Estudante{
    String nome;
    int matricula;

    public Estudante(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public int getMatricula(){
        return this.matricula;
    }

    public String getNome(){
        return this.nome;
    }
}