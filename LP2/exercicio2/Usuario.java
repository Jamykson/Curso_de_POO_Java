package Professor;

public class Usuario{

    private String nome;
    private int identificador;

    public Usuario(String nome, int identificador){

        this.nome = nome;
        this.identificador = identificador;

    }//Construtor
    
    public String getNome(){
        return nome;
    }
    public String setNome(){
        this.nome = nome;
    }
    public int getIdentificador(){
        return identificador;
    }
    public int setIdentificador(){
        this.Identificador = Identificador;
    }

    public void Exibir(){

        System.out.println("Nome: " + this.nome);
        System.out.println("ID: " + this.identificador);

    }
}