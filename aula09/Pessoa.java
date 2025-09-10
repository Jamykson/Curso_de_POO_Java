package aula09;
public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    public Pessoa( String nome, String sexo, int idade){ //Construtor
        
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;

    }

    public void fazerAniver(){ 
        System.out.println(getNome() + " está fazendo aniversário!");
        setIdade(getIdade() + 1);
    }

    public void apresentarPessoa(){
        System.out.println(getNome() + " tem " + getIdade() + " anos e é do sexo " + getSexo() + ".");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}