package aula10;

public class Aluno extends Pessoa{

    private boolean matr;
    private String curso;

    /*public Aluno(String nome, int idade, String sexo, boolean matr, String curso) {
        
        super(nome, idade, sexo);
        
        this.matr = matr;
        this.curso = curso;
    } //construtor*/

    public void cancelarMatr(){

        setMatr(false);
    }

    //getters e setters
    public boolean isMatr() {
    return matr;
    }

    public void setMatr(boolean matr) {
        this.matr = matr;
    }
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


}