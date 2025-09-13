package aula11;

public abstract class Pessoa{

    private String nome;
    private int idade;
    private String genero;

    public void fazerAniver(){

        setIdade(getIdade() + 1);
    }
    @Override
    public String toString(){
        return "Pessoa:\n" + "Nome:" + getNome() + ", Idade: " + getIdade() + ", Gênero: " + getGenero() + ".";
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}