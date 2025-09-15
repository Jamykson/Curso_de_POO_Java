package aula14;

public abstract class Pessoa{

    private String nome;
    private int idade;
    private String genero;
    private int experiencia;

    public Pessoa(String nome, int idade, String genero){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.experiencia = 0;
    }

    public void ganharExperiencia(){

        setExperiencia(getExperiencia() + 1);
    }
    public String toString(){

        return "Pessoa {" + "nome = " + getNome() + ", Idade =" + getIdade() + ", Genero: " + getGenero() + ", Experiencia: " + getExperiencia() + "}";
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
    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    

}