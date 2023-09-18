public class Funcionario{
    public String nome;
    public String sobrenome;
    public float salario;

    public Funcionario(String nome, String sobrenome, float salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public float getSalario(){
        return salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public float getSalarioAnual(){
        return salario*12f;
    }

    public void concederAumento(float valor){
        salario += (salario*(valor/100));
    }
}